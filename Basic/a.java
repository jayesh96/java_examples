import java.util.Scanner;

public class a{
	public static void main(String... str)
	{int flag=0;
	int a[]=new int[10];
	int element;
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		a[i]=sc.nextInt();
		
	}
	
	element=sc.nextInt();
	for(int i=0;i<10;i++)
	{
	if(a[i]==element)
	{
		flag=1;
	}
	}
	if(flag==1)
	{
	System.out.println("Found");
	}
	else
	{
	System.out.println("Not-Found");
	}


	}

}
