import java.io.*;

class File2
{

public static void main(String[] args) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter an Integer");
	String str = br.readLine();
	int i = Integer.parseInt(str);
	System.out.println("String" + i);
	
}	

}

