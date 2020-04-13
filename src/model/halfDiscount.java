package model;

public class halfDiscount extends discountObserver{

	   public halfDiscount(discountState discountState){
	      this.discountState = discountState;
	      this.discountState.attach(this);
	   }

	   @Override
	   public void calculateDiscount() {
	      System.out.println( "Half discount = : " + ( discountState.getPrice() / 2 ) ); 
	   }
	}