import java.util.Scanner;

class Q13
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a No.");
		int a=s.nextInt();
		if(a<0)
		{	
			System.out.println("Enter Positive No.& Try Again...");
		}
		else
		{
		System.out.println("The Reverse of Entered No. is:");
		while(a>0)   
		{
			System.out.print(a%10); 
			a=a/10;
		}
		}		
	}
	
}	

