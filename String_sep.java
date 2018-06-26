import java.util.*;
public class str_sep{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char[] ch=str.toCharArray();
        int l=str.length();
        for(int i=0;i<l;i++){
            if(ch[i]>='0' && ch[i]<='9')
		{
		System.out.print(ch[i]);
        }
   } 
}
}
