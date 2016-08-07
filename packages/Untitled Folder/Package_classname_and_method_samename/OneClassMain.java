package package3;
import package1.*;
import package2.*;
class OneClassMain
{
public static void main(String args[])
{
System.out.println("In package3 we call the classes with same class and method name but different package");
System.out.println("----------------------------------------------------------------------");
package1.OneClass oc1=new package1.OneClass();
package2.OneClass oc2=new package2.OneClass();
}
}