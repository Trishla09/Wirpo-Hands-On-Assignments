package Inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee("Trishla",1200000.0,"2025","3910");
		System.out.println("Name:"+emp.getName());
		System.out.println("Annual Salary:"+emp.getAnnualSal());
		System.out.println("Year:"+emp.getYearannualSalOfJoin());
		System.out.println("Insurance Number:"+emp.getNationalInsuranceNum());
		

	}

}
