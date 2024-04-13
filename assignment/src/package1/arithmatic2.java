package package1;

public class arithmatic2 {
	public int sumresult (int a, int b)
	{
		int c = a+b;
		return c;
		
	}
	
	public int subresult (int x, int y)
	{
		int z= x-y;
		return z;
		
	}
	
	public int mulresult (int x1, int y1)
	{
		int z1 = x1 *y1;
		return z1;
	}
	
	public void divresult (int x2, int y2)
	{
		int z2 = x2/y2;
		System.out.println("The final result is: " +z2);
/*		return z2;*/
	}

	public static void main(String args[])
	{
		int sum1,sub1,mult1,mult2;
		arithmatic obj = new arithmatic();
		mult1= obj.mulresult(10,2);
		System.out.println("The firts multiplication value is: "+mult1);
		sum1 = obj.sumresult(mult1, 2);
		System.out.println("The sum is: "+sum1);
		sub1 = obj.subresult(sum1,2);
		System.out.println("The subtraction is: "+sub1);
		mult2 = obj.mulresult(sub1,2);
		System.out.println("The multiplication2 is: "+mult2);
		obj.divresult(mult2,2);
			
	}

}
