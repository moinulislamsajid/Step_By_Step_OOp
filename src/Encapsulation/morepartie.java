package Encapsulation;

import java.util.Scanner;

public class morepartie {
	private int num1;
	private int num2;
	
	public void set_Info(){
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first Number : ");
		num1 = input.nextInt();
		char ch;
		System.out.print("Enter a choice (+-*/%) : ");
		ch = input.next().charAt(0);
		System.out.print("Enter Second  Number : ");
		num2 = input.nextInt();
		switch(ch) {
		case '+':
			int result = num1 + num2;
			System.out.println("Addition is : "+result);
			break;
			
			
		case '*':
			int result1 = num1 * num2;
			System.out.println("Subtarction  is : "+result1);
			break;
			
		case '/':
			int result2 = num1 / num2;
			System.out.println("Subtarction  is : "+result2);
			break;
			
		case '%':
			int result3 = num1 % num2;
			System.out.println("Subtarction  is : "+result3);
			break;
			
		}
	}
	}
}
		
		
	
	
			
			

		
		
	
	


