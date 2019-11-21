public class Paiement {
	
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;
	
	private double payment;
	private double pricePurchases;
	
	public Paiement(double pricePurchases){
		payment=0;
		this.pricePurchases = pricePurchases;
	}
	 /**
      Computes the change due and resets the machine for the next customer.
      @sommeDonnee argent donnée par le client 
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - pricePurchases;
      return change;
   }
   
    /**
      Processes the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   public double receivePayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
      if(payment > pricePurchases){
		 return giveChange();
	  } else {
		  return 0.0;
	  }
  }
}
