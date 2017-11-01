/**
A class to test the CashRegister class.
*/
public class CashRegisterTester
{
public static void main(String[] args)
{
   CashRegister register = new CashRegister();

   register.recordPurchase(29.50);
   register.recordPurchase(9.25);
   register.receivePayment(50);

   double change = register.giveChange();
   
   /**
    * creates integer itemcount for register to return
    */
   int itemcount = register.getItemCount();

   
   System.out.println(change);      
   System.out.println("Expected: 11.25");
   /**
    * prints the itemcount
    */
   System.out.println(itemcount);
}
}