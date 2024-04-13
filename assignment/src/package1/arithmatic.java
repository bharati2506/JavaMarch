package package1;

public class arithmatic {
	public int sumresult (int a , int b)
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
		System.out.println("The final result is:" +z2);
/*		return z2;*/
	}

	public static void main(String args[])
	{
		int sum1, sum2, sub1,mult1;
		arithmatic obj = new arithmatic();
		sum1= obj.sumresult(10,2);
		System.out.println("the sum is "+sum1);
		sum2 = obj.sumresult(sum1, 2);
		System.out.println("The sum is "+sum2);
		sub1 = obj.subresult(sum2,2);
		System.out.println("The subtraction is "+sub1);
		mult1 = obj.mulresult(sub1,2);
		System.out.println("The multiplication is "+mult1);
		obj.divresult(mult1,2);
			
	}
}
