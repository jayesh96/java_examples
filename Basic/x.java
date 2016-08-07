class XYZ
{
	int i;
	XYZ(int i)
	{
	this.i=i;
	System.out.println("I="+i);
	i=10;
	System.out.println("My I="+i);
	}
	void Hello()
	{
	System.out.println("I am in XYZ.Hello="+i);
	}	
}

class Main
{
	public static void main(String args[])
	{
		XYZ ob=new XYZ(20);
		ob.Hello();
	}
}