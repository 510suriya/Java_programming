import java .util.*;
public class prod_sq{
      public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int n1=s.nextInt();
            int n2=s.nextInt();
            int n3=n1*n2;
            if((n1==n2)&&(n3%n1==0))
                  {
                        System.out.print("yes");
                  }
                  else
                   System.out.print("no");
                  
      }
}
