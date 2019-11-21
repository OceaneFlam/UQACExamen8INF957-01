/* ----------------------------- CashRegister.java  ----------------------------------------------- */
/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double totalArgent;
   private double sommeDu;
   
   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      totalArgent = 0;
   }

   /**
      Enregistre la somme ajouter à la caisse .
      @param amount la somme ajouter à la caisse 
   */
   public void MAJtotalArgent(double amount)
   {
      totalArgent = totalArgent + amount;
   }
   
   
  
}




	




