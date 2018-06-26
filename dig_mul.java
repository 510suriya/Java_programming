import java.util.*;
public class dig_mul{

     public static void main(String []args){
           Scanner s=new Scanner(System.in);
           int rem=0,quo,mul=1;
           int n=s.nextInt();
           int l= (int) Math.log10(n) + 1;
           for(int i=0;i<l;i++)
           {
                 rem=n%10;
                 quo=n/10;
                 n=quo;
                 mul=mul*rem;
           }
           System.out.println(mul);
        
     }
}
