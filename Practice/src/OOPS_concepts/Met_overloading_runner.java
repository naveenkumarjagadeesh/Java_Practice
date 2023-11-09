package OOPS_concepts;

public class Met_overloading_runner {
	
	public static void main(String[] args)
	{
		Method_Overloading mo = new Method_Overloading();
		
		int total = mo.meth_add(5, 5, 5);
		System.out.println(total);
		
		float f_total = mo.meth_add(10, 8, 12, 12.0456f);
		System.out.println(f_total);
	}

}
