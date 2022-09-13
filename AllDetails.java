package Hello_Programs;

import java.util.Scanner;

public class AllDetails {

	public static void main(String[] args) {
		int age;                              
		String firstName;  
		char gender;      
		double salary;    
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
								
		age=scanner.nextInt();
		
		System.out.println("Enter your name: ");
		
		firstName=scanner.next();
		
		System.out.println("Choose your gender ");
		
		gender=scanner.next().charAt(0);
		System.out.println("Enter your salary: ");
		
		salary=scanner.nextDouble();
		
		System.out.println("Hey! "+firstName+" of "+age+" with gender "+gender+" having salary "+salary);
		
		
			// TODO Auto-generated method stub

	}

}
