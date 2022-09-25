import java.util.Scanner;

class Q8
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a No.");
		int a=sc.nextInt();
		System.out.println("The Digits of entered no. is:");
		while(a>0||a<0)   
		{
			
			if(a>0)
		       {
			  System.out.println(a%10); 
			  a=a/10;
			}

                        else
			{
			   System.out.println((a%10)*(-1)); 
			   a=a/10;	
			}


		}				
	}
	
}	


