package OOPS_concepts;

class Class_w_o_main_method {
	
	String x = "New variable 1";
	String y = "Second new variable";
	
	void printing_info()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		Class_w_o_main_method cn  = new Class_w_o_main_method();
		cn.printing_info();
	}
}
