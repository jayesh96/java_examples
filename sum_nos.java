import java.util.Scanner;
 
class Sum
{
   public static void main(String args[])
   {
      int x, y;
      System.out.println("Enter two numbers");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      x = x + y;
      System.out.println("Sum = "+x);
   }
}
