package OOPS_concepts;

// This program is to demonstrate the parameterized constructor working 
//i.e whenever we need the dynamic inputs to be passed to the 
//global variables we make use of the parameterized constructors


public class employee {
	
	String name;
	String job;
	int sal;
	
	/* this is parameterized constructor which is used when we need to pass the dynamic values to the 
	 * global variables/ instance variables at the run time rather than the static values
	 * 
	 * Initially we need to create a object pass some values into it as a parameter and as the constructor gets invoked as 
	 * soon as an object is created hence we need the constructor method to be present to assign those values to the global variable
	 */
	employee(String n, String j, int s)
	{
		name = n;
		job = j;
		sal  =s;
	}
	
	void printing()
	{
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}


	public static void main(String[] args) {
		employee e = new employee("naveen","no job",0);
		e.printing();
		
		employee e1 = new employee("yashu","team lead",40000);
		e1.printing();
		
	}
}
