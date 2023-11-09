package OOPS_concepts;

public class Student extends Person{
	
	String course_name;
	int fees;
	
	public Student(String Nm,int ag, String ad, String cs, int fs)
	{ 
		super(Nm,ag,ad);
		course_name  = cs;
		fees = fs;
	}
	
	public void print_student()
	{
		System.out.println(" The name of the student is: "+Name+" \n The age of the student is: "+Age+"\n The address of the student is: "+Address+"\n The course name is: "+course_name+" \n The fees is: "+ fees);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Naveen",29,"11th cross","mechanical", 55000);
		s.print_student();
	}

}
