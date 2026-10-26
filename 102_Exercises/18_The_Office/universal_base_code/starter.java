/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee DS= new Employee(1987,"Dwight","Shurt",4166.66);
		Employee JH= new Employee(2474,"Jim","Halpert",4166.66);
		Employee PB= new Employee(2011,"Pam","Beesly",2250);
		Employee ninefivesixseven= new Employee(9567,"ninefive","sixseven",7659.00);
		System.out.println(DS.getAnnualSalary());
		DS.raiseSalary(12);
		DS.employeeToString();
		System.out.println(JH.getAnnualSalary());
		JH.raiseSalary(12);
		JH.employeeToString();
		System.out.println(PB.getAnnualSalary());
		PB.raiseSalary(55);
		PB.employeeToString();
		System.out.println(ninefivesixseven.getAnnualSalary());
		ninefivesixseven.raiseSalary(12);
		ninefivesixseven.employeeToString();
		
		
	}
}
