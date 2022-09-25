import java.util.Scanner;

class Q10
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a No.");
		int a=sc.nextInt();
		int sum=0;
		int dig;
		if(a<=0)
		{
			System.out.println("Enter Positive No. and try again... ");
		}
		else
		{	
			while(a>0)    
			{
			  dig=a%10;				
			  sum=sum+dig;
			  a=a/10;
			}
			
			System.out.println("The Sum of Digits is: "+sum);
		}	
	}
	
}	


