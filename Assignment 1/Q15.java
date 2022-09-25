import java.util.Scanner;

class Q15
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st Positive No.");
		int a=s.nextInt();
		System.out.print("Enter 2nd Positive No.");
		int b=s.nextInt();
		int gcd=0;
		int lcm=0;
		if(a==b)
		{
          System.out.print("L.C.M.= "+a);
		}			
		else if(a<b) 
		{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0&&b%i==0)
				{
					gcd=i;
				}					
			}
			lcm=(a*b)/gcd;
		    System.out.println("L.C.M.= "+lcm);
		}	
        else
		{
			for(int i=1;i<=b;i++)
			{
				if(a%i==0&&b%i==0)
				{
					gcd=i;
				}					
			}
			lcm=(a*b)/gcd;
		    System.out.println("L.C.M.= "+lcm);
		}		
		
	}
	
}	

