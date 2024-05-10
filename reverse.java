//Reverse a number 
class  reverse
{
	public static void main(String[] args) 
	{
		int x = 249;
        int sum = 0;
		while (x!=0)
		{
			int rem = x % 10;
			sum = (sum*10)+rem;
			x = x/10;


		}
		System.out.println(sum);
}
}
