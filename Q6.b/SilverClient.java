public class SilverClient extends Client {
	
	public SilverClient(int id){
		super(id);
	}
	
	@Override 
	public double checkDiscount(){
		return 0.1;
	}
	
}
