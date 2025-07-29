package MiniProjects;
import java.util.*;

public class EmployeInformation {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    
		int EmpNo[]= {1001,1002,1003,1004,1005,1006,1007};
		String EmpName[]= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String JoinDate[]= {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
		char DesignCode[]= {'e','c','k','r','m','e','c'};
		String Department[]= {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int Basic[]= {20000,30000,10000,12000,50000,23000,29000};
		int HRA[]= {8000,12000,8000,6000,20000,9000,12000};
		int IT[]= {3000,9000,1000,2000,20000,4400,10000};
		String Designation="";
		int DA=0;
		int Salary=0;
		boolean found=false;
		
		int empid=sc.nextInt();
		
		for(int i=0;i<EmpNo.length;i++) {
			if(EmpNo[i]==empid) {
				found=true;
				switch(DesignCode[i]) {
				case 'e':
					Designation="Engineer";
					DA=20000;
					break;
				case 'c':
					Designation="Consultant";
					DA=32000;
					break;
				case 'k':
					Designation="Clerk";
					DA=12000;
					break;
				case 'r':
					Designation="Receptionist";
					DA=15000;
					break;
				case 'm':
					Designation="Manager";
					DA=40000;
					break;
				}
				System.out.printf("%-9s%-12s%-14s%-16s%-10s\n","EmpNo","Emp Name","Department","Designation","Salary");
				Salary=Basic[i]+HRA[i]+DA-IT[i];
				System.out.printf("%-9d%-12s%-14s%-16s%-10d\n",EmpNo[i],EmpName[i],Department[i],Designation,Salary);
				break;	
			}
		}
		if (!found) {
            System.out.println("There is no employee with empid : " + empid);
        }
		
	}

}
