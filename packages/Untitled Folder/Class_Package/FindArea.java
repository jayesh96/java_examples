package package1;

/*package package2;
import package1.AreaValue;*/

class FindArea
{
public static void main (String args[])
{
System.out.println("value pi  "+AreaValue.pi);

AreaValue av=new AreaValue();
double area=(av.pi)*(av.r)*(av.r);
System.out.println("area is  "+area);
}
}