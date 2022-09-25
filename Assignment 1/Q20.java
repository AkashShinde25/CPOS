import java.util.Scanner;

class Q20
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no. of terms to be printed in odd series");
		int n=s.nextInt();
		System.out.println();
		int odd=1;
		for(int i=1;i<=n;i++) 
		{
		  System.out.print(odd+" ");	
		  odd=odd+2;
		}
	
	}
	
}	

