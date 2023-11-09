package OOPS_concepts;

public class Person {
	
	String Name;
	int Age;
	String Address;
	
	Person(String N, int a, String ad){
	Name= N;
	Age = a;
	Address = ad;	
	}
	
	public void print_values()
	{
		System.out.println(" The name is : "+Name+
				"\n The Age is: " +Age +
				"\n The address is: "+ Address);
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person p = new Person("Suresh", 55,"15th cross road");
			p.print_values();
		}

}
