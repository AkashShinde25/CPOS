import java.util.Scanner;

class Q18
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Positive No.");
		int a=s.nextInt();
		
		for(int i=2;i<a;i++)  
		{
			while(a%i==0)    
			{
				System.out.println(i);
				a=a/i; 
			}
		}
		
		if(a>2)
		System.out.println(a);	
	
	}
	
}	

