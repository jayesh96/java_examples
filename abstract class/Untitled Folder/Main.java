abstract class A
{
abstract public void X();
}

abstract class B extends A
{
public void X()
{
System.out.println("B-X");
}
}
class C extends B
{

}
class Main
{
public static void main(String... args)
{
C o=new C();
o.X();	
}

}
