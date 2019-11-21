public class EmployeSalarie extends Employe {
	double SalaireAnnuel;
	
	public EmployeSalarie(String nom,double SalaireAnnuel){
		this.SalaireAnnuel = SalaireAnnuel;
		this.nom = nom;
	}
	
	@Override
	public double CalculPayeSemaine(double data){
		return SalaireAnnuel / 52;
	}
}
		
