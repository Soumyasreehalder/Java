//Method Overloading2

class red1
{
	static void mul(int a, int b)
	{
	   int c = a * b;
       System.out.println(c);
	}
	static void mul(double a, double b)
	{
	   double c = a * b;
       System.out.println(c);
	}
	public static void main(String[] args) 
	{
		mul (2,3);
		mul (3.5,1.5);
	}
}
