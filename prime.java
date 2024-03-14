//Prime number
class prime
{
	public static void main(String[] args) 
	{
		int n = 21;
		boolean tf = true;
		if (n<2)
		{
			tf = false;
		
		}
		else
		{
			for (int i=2;i<=n/2 ;i++)
			{
				if (n%i==0)
				{
					tf = false;
                    
				}
				
			}
		
		}
		String op = tf ? "prime" : "not prime";
        System.out.println("The number is "+ op);
	}
}
