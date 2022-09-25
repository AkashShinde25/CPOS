import java.util.Scanner;

class Q19
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no. of terms to be printed in  even series");
		int n=s.nextInt();
		System.out.println();
		int eve=2;
		for(int i=1;i<=n;i++) 
		{
		  System.out.print(eve+" ");	
		  eve=eve+2;
		}
	
	}
	
}	

