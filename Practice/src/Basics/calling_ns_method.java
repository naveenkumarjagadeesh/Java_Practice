/**
 * 
 */
package Basics;

/**
 * @author Naveen
 *This program is used to demo the calling of the non static method inside the static main method
 */
public class calling_ns_method {
	
	void method1()
	{
		System.out.println("successfully called the non static meethod");
	}

	/**
	 * @param args
	 *if we need to call a non static method inside the static main method we need to make use of the constructor
	 *ie. calssname varname = new classname(); 
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calling_ns_method  cnm = new calling_ns_method();
		cnm.method1();
	}

}
