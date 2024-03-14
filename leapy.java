//Leap year or not 
class leapy 
{
	public static void main(String[] args) 
	{
		int yr=2000;
		int yr1=100;
		int yr4=400;
		int a =4;
		if (yr%a==0 && yr%yr1 !=0 )
		{
			System.out.println("It's a leap year!");
		}
		else if ( yr%yr1==0 && yr%yr4==0)
		{
			System.out.println("It's a leap year!");
		}
		else
		{
			System.out.println("It's not a leap year!");
		}
		
	}
}
