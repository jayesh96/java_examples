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
				hi p=new Hi();

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