public class EmployeHeure extends Employe {
	double TauxHoraire;
	
	public EmployeHeure(String nom,double TauxHoraire){
		this.TauxHoraire = TauxHoraire;
		this.nom = nom;
	}
	
	@Override
	public double CalculPayeSemaine(double HeuresTravaillees){
		return HeuresTravaillees * TauxHoraire;
	}
}
		

