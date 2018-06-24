import java .util.*;
public class rep_star{
      public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            String str =s.next();
            int n=str.length();
            if(n%2!=0){
                  int n1=n/2;
            char[] strchar = str.toCharArray();
            strchar[n1] = '*';
            str= String.valueOf(strchar);
            System.out.println(str);
            }
            else
            { int n2=n/2,n3=(n/2)-1;
            char[] strchar = str.toCharArray();
            strchar[n2] = '*';
            strchar[n3] = '*';
            str= String.valueOf(strchar);
            System.out.println(str);
                  
            }
      }
}
