
/**
 * This class test the employee hierarchy
 * @author Luis Miguel Acevedo
 * @version Oct 2014
 *
 */
public class TesterEmployee {
	public static void main(String[] args) {
		//create subclass object
		SalariedEmployee sEmp = new SalariedEmployee("Luis", "Acevedo", 200264686, 1600);
		HourlyEmployee hEmp = new HourlyEmployee("Ty", "Hamlin", 123456, 16.45, 160);
		ComissionEmployee cEmp = new ComissionEmployee("James", "Something", 987456132, 10000, 0.10);
		BasePlusComissionEmployee bEmp = new BasePlusComissionEmployee("Jaret", "Wright", 456789123, 50000, .5, 2000);
		
		System.out.println("----------- SALARIED EMPLOYEE -----------");
		System.out.println(sEmp);
		System.out.println(sEmp.earnings());
		
		System.out.println("----------- HOURLY EMPLOYEE -----------");
		System.out.println(hEmp);
		System.out.println(hEmp.earnings());
		
		System.out.println("----------- COMISSION EMPLOYEE -----------");
		System.out.println(cEmp);
		System.out.println(cEmp.earnings());
		
		System.out.println("----------- BASEpLUSS EMPLOYEE -----------");
		System.out.println(bEmp);
		System.out.println(bEmp.earnings());
	}
}
