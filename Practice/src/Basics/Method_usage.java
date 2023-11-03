package Basics;


public class Method_usage {
	boolean bl = true;
	
	void printing(String s)
	{
		System.out.println(s); 
		System.out.println(bl);
	}

	public static void main(String[] args) {
		
		Method_usage mu = new Method_usage();
		
		String s = "NAveen is the creater of this program"; 
		
		System.out.println(mu.bl);
		mu.printing(s);
	}
}
