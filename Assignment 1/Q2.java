import java.util.Scanner;

class Q2
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Natural no. to find Factorial");
		int a=sc.nextInt();
		
		int fact=1,n=1;
	
		while(n<=a)      
		{
			fact=fact*n;    
			n++;
		}
		
		System.out.println("Factorial of "+a+" is "+fact);
		
		
	}
	
}	



