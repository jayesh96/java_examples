import java.util.Scanner;

public class mulrecursive{
	
	public static int div(int m,int n)

	{  if (m < n)
	 return 0;
	else    	
	return div(m-n,n) + 1;
	}
	public static void main(String... str)
	{
		int r;
		r=div(6,2);
		System.out.println(r);
	}

}
