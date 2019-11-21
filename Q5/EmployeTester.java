public class EmployeTester {
	
	public static void main(String[] args){
	   
		EmployeSalarie empS = new EmployeSalarie("Alain", 52000.0);
		EmployeHeure empH = new EmployeHeure("Bertrand", 17.5);
		EmployeCommission empC = new EmployeCommission("Michel", 5.0);
		double s1 = empS.CalculPayeSemaine(0);
		double s2 = empH.CalculPayeSemaine(50);
		double s3 =empC.CalculPayeSemaine(25000);
		
		System.out.println(empS.getName()+ " : \n$"+s1+"\n");
		System.out.println(empH.getName()+ " : \n$"+s2+"\n");
		System.out.println(empC.getName()+ " : \n$"+s3+"\n");
	}
	
}
