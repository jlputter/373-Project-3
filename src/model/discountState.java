package model;

import java.util.ArrayList;
import java.util.List;

public class discountState {
	
	//the discount State class is used in essence to load and unload concrete classes 
	//to the client for observer, so when we list the observers we load them into the client class
	
	private List<discountObserver> observers = new ArrayList<discountObserver>();
	private double price;

   
   //classic getter and setter functions 
	public double getPrice() {
	   return price;
   }

	public void setPrice(double price) {
      this.price = price;
      updateStateForObserver();
   }

	//add to list of observable classes passed into observer to be used in client
	public void attach(discountObserver observer){
		observers.add(observer);		
   }

   //used to update the observer with state change depending on concrete class
	public void updateStateForObserver(){
		for (discountObserver observer : observers) {
			observer.calculateDiscount();
      }
   } 	
}