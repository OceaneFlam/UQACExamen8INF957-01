public class Client1  {
	private int rank; //valeur entre 0 et 2
	private int id;
	
	public Client1(int id, int rank){
		this.id=id;
		this.rank=rank;
	}
	
	public double checkDiscount(){
		if(rank == 0){
			return 0;
		}else if(rank == 1 ){
			return 0.1;
		} else return 0.2;
	}
}
