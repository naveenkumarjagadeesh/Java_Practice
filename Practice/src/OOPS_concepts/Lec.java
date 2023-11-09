package OOPS_concepts;

import java.util.Scanner;

public class Lec extends Person
{
	
	String clg;
	int sal;
	
	Lec(String name , int age, String add, String c_name,int sl)
	{
		super(name,age,add);
		clg = c_name;
		sal = sl;
		
	}
	
	void printing()
	{
		System.out.println("The name is:"+Name);		
		System.out.println("The age is:"+ Age);
		System.out.println("The address is:"+ Address);
		System.out.println("The clg name is:"+ clg);
		System.out.println("The sal is:"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the anem for the lecturer: ");
		String pname = sc.nextLine();
		System.out.println("Enter the age: ");
		int page = sc.nextInt();
		System.out.println("Enter the add: ");
		String ares = sc.nextLine(); 
		
		Lec lc =new Lec(pname, page, ares, "imtma", 40000);
		lc.printing();
	}

}
