import java.util.*;
public class Strn{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int n=s.nextInt();
        for(int i=0; i<n;i++)
        {
        char ch = str.charAt(i);
        System.out.print(ch);
        }
        
     }
}
