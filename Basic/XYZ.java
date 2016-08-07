import java.util.Scanner;
class convert
{
int feet,inches;
	public convert(int i)
	{
		this.feet=i;
		feet=i/12;
		System.out.println("Feet:"+feet);
	}

}

class Main
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	convert ob=new convert(20);
	ob.convert();
	}
}