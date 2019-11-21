public class GoldClient extends Client {
	
	public GoldClient(int id){
		super(id);
	}
	
	@Override 
	public double checkDiscount(){
		return 0.2;
	}
}
