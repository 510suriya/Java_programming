import java.util.Scanner;
 
public class SwapNumbers
{
   public static void main(String args[])
   {
      int x, y, temp;
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      temp = x;
      x = y;
      y = temp;
      System.out.println(+x);
      System.out.println(+y);
   }
}
