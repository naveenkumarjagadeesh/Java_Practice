package OOPS_concepts;

import java.util.Scanner;

public class Met_ovrdg_rnnr extends Method_Overriding {
	@Override
	int liquor_price(int no_of_bottles, int todays_price) {
	int pre_final_cost = no_of_bottles*todays_price;
	System.out.println("the prefinal cost "+ pre_final_cost);
	float gst = pre_final_cost*.18f;
	System.out.println("the added gst as per new rule "+ gst);
	float bill = pre_final_cost + gst;
	return (int)bill;	
	}	
	
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the todays price");
		int t_price  = sc.nextInt();
		System.out.println(" enter the nos of bottles");
		int bottle_count = sc.nextInt();
//		Method_Overriding mo = new Method_Overriding();
//		int x = mo.liquor_price(bottle_count, t_price);
		Met_ovrdg_rnnr mor = new Met_ovrdg_rnnr();
		int x = mor.liquor_price(bottle_count, t_price);
		System.out.println("the final bill according to new govt rules is "+x);
	}
	

}
