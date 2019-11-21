public class RecordPurchases {
	private double amont;
	
	public RecordPurchases(){
		amont = 0;
	}
	
	public double getAmont(){
		return amont;
	}
	
	public void addPurchase(double purchase){
		amont = amont + purchase;
	}
	
}
