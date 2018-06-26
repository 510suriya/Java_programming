import java.util.*;
public class Quo_rem{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        long n1=s.nextLong(),ans;
        long n2=s.nextLong();
        char c=s.next().charAt(0);;
        if(c=='/')
        {
            ans=n1/n2;
            System.out.println(ans);
        }
        if(c=='%')
        {
              ans=n1%n2;
              System.out.println(ans);
        }
   }
}
