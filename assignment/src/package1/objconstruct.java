package package1;

public class objconstruct {
	
	public objconstruct()
	{
		this(10,20,30);
		System.out.println("This is default constructor");
	}
	
	public objconstruct(int a)
	{
		this(10,20,30,40);
		System.out.println("One parameterrized constrcutor");
	}
	public objconstruct(int a, int b)
	{
		this(10);
		System.out.println("Two parameterized constructor");
	}
	
	public objconstruct(int a, int b, int c)
	{
		//this(10,20,30,40);
		System.out.println("Three parameterized constructor");
	}
	
	public objconstruct(int a, int b, int c, int d)
	{
		this();
			System.out.println("Four parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//objconstruct ob= new objconstruct();
		
		
	}

}
