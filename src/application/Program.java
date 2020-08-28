package application;

import java.text.ParseException;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: " );
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.println("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");		
		double amount = sc.nextDouble();
		
		
			acc.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
		}
		
		catch (DomainException apelido) {
			System.out.println("Withdraw error: " + apelido.getMessage());
		}
		 catch(RuntimeException e){
			 System.out.println("Unexpected error");
			 
		 }
		
		
		
		
		sc.close();
	}
}
