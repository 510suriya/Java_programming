import java.util.*;
public class StrBin{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        if(str.contains("0")||str.contains("1"))
        {
            System.out.println("yes");
        }
        else
        System.out.println("no");
        
     }
}
