package model;


public abstract class discountObserver {
	
	//here we are setting methods and constructors which will be 
	//modified/inherited by the specific concrete classes
	
	   protected discountState discountState;
	   //method to update the observer 
	   public abstract void calculateDiscount();
	
}