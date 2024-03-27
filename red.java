//Method Overloading1

class red
{
	static void add(int a, int b)
	{
	   int c = a + b;
       System.out.println(c);
	}
	static void add(double a, double b)
	{
	   double c = a + b;
       System.out.println(c);
	}
	public static void main(String[] args) 
	{
		add (2,3);
		add (3.5,1.5);
	}
}
