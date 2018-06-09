import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        int n1=str1.length();
        int n2=str2.length();
        if(n1>n2)
        System.out.println(str1);
        else if(n2>n1)
        System.out.println(str2);
        else {
        System.out.println(str1);
        System.out.println(str2);
        }
     }
     
}
