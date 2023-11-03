package Basics;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++)
		{
			System.out.println(" please enter the value form where the counting should be started");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			while(x<=100)
			{
				System.out.println(x);
				x++;
			}		
			System.out.println();
		}
	}

}
