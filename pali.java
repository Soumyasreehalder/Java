//palidrome or not 
class pali 
{
	public static void main(String[] args) 
	{
		int x = 1001;
		int c = x;
		int sum=0;
		while (x!=0)
		{
			int rem = x% 10;
			sum = (sum *10)+rem;
			x = x/10;
		}
		if (sum==c)
		{
			System.out.println("It is a pallidrome");

		}
		else
			{
			System.out.println("It is not a pallidrome");

		}
		
	}
}
