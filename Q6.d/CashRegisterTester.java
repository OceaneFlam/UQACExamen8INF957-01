/* ----------------------------- CashRegisterTester.java----------------------------------------------- */
/**
   This class tests the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      RecordPurchases achat = new RecordPurchases();
      Paiement paiement;

      achat.addPurchase(0.75);
      achat.addPurchase(1.50);
      paiement  = new Paiement(achat.getAmont());
      double change = paiement.receivePayment(2, 0, 5, 0, 0);
      System.out.println("Change: "+change);
      System.out.println("Expected: 0.25");
      register.MAJtotalArgent(achat.getAmont());

   }
}
