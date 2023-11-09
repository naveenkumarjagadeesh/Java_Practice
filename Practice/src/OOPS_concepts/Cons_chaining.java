/**
 * 
 */
package OOPS_concepts;

/**
 * @author Naveen
 *
 */
public class Cons_chaining {
	
	String name;
	String job;
	float Salary;
	
	public Cons_chaining()
	{
		//this();

		// TODO Auto-generated constructor stub
		System.out.println("This is the sample constructor extension to print before"
				+ "the values to be printed");
	}
	
	// The second line starts over here and the first constructor chaining gets executed
	// later the values gets assigned to the instance variables, later the method printing the 
	// variables trough the print_values method gets executed.
	Cons_chaining(String n, String j, float s){
		this();
		name = n;
		job = j;
		Salary = s;		
	}
	
	void print_values()
	{
		System.out.println("the name of the employee is : "+name);
		System.out.println("the job of the employee is : "+job);
		System.out.println("the salary of the employee is : "+Salary);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// First this line gets executed and then it goes to the line 22	
	Cons_chaining cc = new Cons_chaining("Naveen","No job",0.0f);
	cc.print_values();
			
	}

}
