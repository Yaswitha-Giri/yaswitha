import java.util.Scanner;
class Test
{
	public static void main(String [] args) 
	{
		System.out.println("enter monthly salary");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=12 * x;
		if ( y > 1000000)
		{
			int z1=y-1000000;
			double t1=(z1*0.3)+(500000*0.2)+(250000*0.1);
			System.out.println(t1);
		}
		else if (y > 500000 && y<=1000000)
		{
			
			int z2=y-500000;
			double t2=(z2*0.2)+(250000*0.1);
			System.out.println(t2);
		}
		else if (y > 250000 && y<= 500000)
		{
			
			int z3=y-250000;
			double t3=(z3*0.1);
			System.out.println(t3);
		}
		else
		{
			double t4=0;
			System.out.println(t4);
		}
		
			
	}
}
	

		