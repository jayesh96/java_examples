import java.io.*;

public class File
{

public static void main(String[] args) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("File");
	char ch = (char) br.read();
	System.out.println("Output after line char");

}	

}

