
import model.discountState;
import model.halfDiscount;
import model.quarterDiscount;

public class discountDemo {
   public static void main(String[] args) {
      discountState discountState = new discountState();

      new halfDiscount(discountState);
      new quarterDiscount(discountState);

      System.out.println("First state change: 29");	
      discountState.setPrice(29);
      System.out.println("Second state change: 10");	
      discountState.setPrice(10);
   }
}