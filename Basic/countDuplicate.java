import java.util.Scanner;

public class countDuplicate{
	public static void main(String... str)
	{
	String s;
	int c[]=new int[6];
	int a[]=new int[6];
	int e[]=new int[6];
	int j=0,i=0,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers:");
	for(i=0;i<6;i++)
	{
		c[i]=sc.nextInt();

	}	
	for(i=0;i<5;i++)
	{
	for(j=i+1;j<6;j++)
		{
			if(c[i]==c[j])
			{
				for(e=0;e<6;e++)
				{
					e[i]=j;
				}	
			}

		}
	
	}
			
	
	}
}
