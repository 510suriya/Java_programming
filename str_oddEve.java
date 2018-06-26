import java.util.*;
public class odd_evepos{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int i=0;
        String str=s.next();
        char[] c=str.toCharArray();
        for(i=0;i<str.length();i++){
        if(i%2==0)
        {
        System.out.print(c[i]);
       }
       }
       System.out.print("\t");
       for(i=0;i<str.length();i++){
       if(i%2!=0){
        System.out.print(c[i]); 
       }
       }
    
     }    
}
