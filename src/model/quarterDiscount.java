package model;

public class quarterDiscount extends discountObserver{
	
	public quarterDiscount(discountState discountState){
	      this.discountState = discountState;
	      this.discountState.attach(this);
	   }

	   @Override
	   public void calculateDiscount() {
	      System.out.println( "Quarter discount = : " + ( discountState.getPrice() / 4 ) ); 
	   }
	}


