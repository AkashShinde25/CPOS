import java.util.Scanner;

class Q4
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st No.:");
		int a=s.nextInt();  
		System.out.print("Enter 2nd No.:");
		int b=s.nextInt();  
		System.out.println();
		
		a=a+b;  
		b=a-b;  
		a=a-b;  
		
		
		System.out.println("After Swapping:");
		System.out.println();
		System.out.println("1st No. is: "+a);
		System.out.println("2nd No. is: "+b);
		
	}
	
}	


