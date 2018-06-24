import java .util.*;
public class mul_onethree{
      public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int n1=s.nextInt();
            int n2=s.nextInt();
            int n3=n1*n2;
            int sqrt = (int) Math.sqrt(n3);
            if(sqrt*sqrt==n3)
                  {
                        System.out.print("yes");
                  }
                  else
                   System.out.print("no");
                  
      }
}
