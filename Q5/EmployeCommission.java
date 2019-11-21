public class EmployeCommission extends Employe {
	double Commission;
	
	public EmployeCommission(String nom,double Commission){
		this.Commission = Commission;
		this.nom = nom;
	}
	
	@Override
	public double CalculPayeSemaine(double VentesTotales){
		return VentesTotales * Commission/100;
	}
}
