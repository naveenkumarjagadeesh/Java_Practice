package Basics;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch case is basically used to avoid multiple if else-if conditions,
		//because those will be confusing.
		System.out.println("Please enter the proper interger value");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		switch(x) {
		case 1 :
			System.out.println(" the first number");
			break;
			
		case 2 :
			System.out.println(" the second number");
			break;
			
		case 3 :
			System.out.println(" the third number");
			break;
			
		case 4:
			 System.out.println(" the fourth number");
			 
		default:
			System.out.println(" This in not a proper input value to process");
			 
		}
							
			

	}

}
