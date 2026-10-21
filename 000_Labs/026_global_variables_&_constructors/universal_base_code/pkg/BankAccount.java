/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	int accountNumber;
	double balance;
	String bankName;
	String accountOwner;
	


	// -------CONSTRUCTORS-------
	public bankAccount(){
		accountNumber=0;
		balance=0.0;
		BankName="Unknown";
		accountOwner="Unknown";
	}
	public bankAccount(String eins, String zwei){
		accountNumber=0;
		balance=0.0;
		BankName=eins;
		accountOwner=zwei;
	}
	public bankAccount(int number,double decimal,String eins, String zwei){
		accountNumber=number;
		balance=decimal;
		BankName=eins;
		accountOwner=zwei;
	}
	

	// -------METHODS-------

}