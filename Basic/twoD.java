import java.util.Scanner;

public class twoD{
	public static void main(String... str)
	{
	String s;
	int c[][]=new int[2][2];
	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Input");
	for( i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
	{
		c[i][j]=sc.nextInt();
	}
	}
for( i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
	{
	System.out.print(c[i][j]);
	
}
	System.out.println();
	}
	}
}
