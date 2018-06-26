import java.util.*;
public class lexi{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char[] ch=str.toCharArray();
        int l=str.length();
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
}
}
