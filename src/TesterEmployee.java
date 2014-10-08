
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
		System.out.println("Earnings: "+sEmp.earnings());
		
		System.out.println("----------- HOURLY EMPLOYEE -----------");
		System.out.println(hEmp);
		System.out.println("Earnings: "+hEmp.earnings());
		
		System.out.println("----------- COMISSION EMPLOYEE -----------");
		System.out.println(cEmp);
		System.out.println("Earnings: "+cEmp.earnings());
		
		System.out.println("----------- BASEPLUS EMPLOYEE -----------");
		System.out.println(bEmp);
		System.out.println("Earnings: "+bEmp.earnings());
		
		//create an array of employee
		Employee[] employees = new Employee[4];
		//initialize the array
		employees[0] = sEmp;
		employees[1] = hEmp;
		employees[2] = cEmp;
		employees[3] = bEmp;
		
		System.out.println("----------- POLYMORPHICAL USE -----------");
		System.out.println("----------- employee information -----------");
		for(Employee x : employees){
			//What if we wanted to target an specific type of employee?
			if(x instanceof BasePlusComissionEmployee){
				System.out.println("**********BasePlusEmployee found**********");
				System.out.println("I am a BasePlusComissionEmployee");
				System.out.println("Increase his salary by 10%");
				BasePlusComissionEmployee e = (BasePlusComissionEmployee)x; //This is called down casting, because you are going from a SUPER class to a SUB class
				e.setBaseSalary((e.getBaseSalary()*1.1));
			}
			
			System.out.println("----------- Information: -----------");
			System.out.println(x);
			System.out.println("Earnings: "+x.earnings());
			
			
		}
	}
}
