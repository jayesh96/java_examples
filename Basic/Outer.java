abstract class Hi
{
	void Hello()
	{

	}
}

 class Hello
{
	public static void main(String... str)
	{
		Hi ob=new Hi()
		{
			void Hello()
			{
				System.out.println("hello");

			}
		};
		ob.Hello();
	}
}