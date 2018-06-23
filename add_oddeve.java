import java.util.*;
public class add_oddeve{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int a=n1+n2;
        if(a%2==0)
        {System.out.print("even");
        }
        else
        System.out.print("odd");
     }
}
