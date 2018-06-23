import java.util.*;
public class prime{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int a,b;
        int n=s.nextInt();
        if(n>0)
        {
              a=(n/10)*10;
              b=a+10;
              System.out.println(b);
        }
     }
}
