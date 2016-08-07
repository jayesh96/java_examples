import java.util.Scanner;

public class calculate{
	public static void main(String... str)
	{	
		int flag=0;
		int a[]=new int[10];
		int element;
		float res;
		Scanner sc=new Scanner(System.in);
		element=sc.nextInt();
		
		try
		{
		if(element==0)
		{
			throw new ClassNotFoundException(); 
		}		
			res = 100/element;
			
			System.out.println("res="+res);
		}
		catch(Exception e)
		{
			System.out.println("Divide by zero"+" "+e.getMessage());
			e.printStackTrace();
					
		}

	}

}
