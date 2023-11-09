package OOPS_concepts;

import java.util.Scanner;

public class Method_Overriding {
	
	int liquor_price(int no_of_bottles, int todays_price)
	{

		int total_cost = no_of_bottles*todays_price;
		return total_cost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overriding mor = new Method_Overriding();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos of bottles required: ");
		int req_bottle = sc.nextInt();
		System.out.println(" enter the todays price: ");
		int todays_price = sc.nextInt();
		int bill = mor.liquor_price(req_bottle,todays_price);
		System.out.println("The old bill with out gst "+bill);
	}

}
