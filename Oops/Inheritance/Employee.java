package Inheritance;

public class Employee extends Person{
     double annualSal ;
     String yearannualSalOfJoin;
     String nationalInsuranceNum;
     
     Employee(){}

     Employee(String name ,double annualSal,String yearannualSalOfJoin,String nationalInsuranceNum){
    	 super(name);
    	 this.annualSal=annualSal;
    	 this.yearannualSalOfJoin=yearannualSalOfJoin;
    	 this.nationalInsuranceNum=nationalInsuranceNum;
     }
     
     
     public void setName(double annualSal ) {
    	 this.annualSal=annualSal;
     }
     public void setyearannualSalOfJoin(String yearannualSalOfJoin ) {
    	 this.yearannualSalOfJoin=yearannualSalOfJoin;
     }
     public void setName(String nationalInsuranceNum) {
    	 this.nationalInsuranceNum=nationalInsuranceNum;
     }
     
     public double getAnnualSal() {
    	 return annualSal;
     }
     public String getYearannualSalOfJoin() {
    	 return yearannualSalOfJoin;
     }
     public String getNationalInsuranceNum() {
    	 return nationalInsuranceNum;
     }
     
}
