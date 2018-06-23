import java.util.*;
public class palindrome{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String s1,s2="";
        s1=s.next();
        int n=s1.length();
        for(int i=n-1;i>=0;i--)
        {
              s2=s2+s1.charAt(i);
        }
        if(s1.equalsIgnoreCase(s2))
        {
              System.out.println("yes");
        }
        else
        System.out.println("no");
        
      
     } 
     
}
