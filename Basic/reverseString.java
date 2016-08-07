import java.util.Scanner;

public class reverseString{
	public static void main(String... str)
	{
	String s;
	int c[]=new int[100001];
	int a[]=new int[11];
	int y=0,i=0,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers:");
	for(i=0;i<100001;i++)
	{
		c[i]=0;
	}	
	for(i=0;i<10;i++)
	{	int j=0;
		c[i]=sc.nextInt();

		a[c[i]]=j++;
		if(a[c[i]]>1)
		{
			count=count+1;
		}
				
	}
	System.out.println(count);
		










	/*while(c[i]!='\0')
	{
	 c[i]=s.charAt[i];
	i++;
	}*/

		
	
	
	}

}
