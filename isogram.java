import java.util.*;
public class isogram{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int i=0,j=0,c=0;
        String str=s.next();
        char[] ch=str.toCharArray();
        for(i=0;i<str.length();i++){
        for(j=i+1;j<str.length();j++){
              if(ch[i]==ch[j])
              c++;
        }
       }
       if(c==0)
       System.out.print("Yes");
       else
       System.out.print("No");
       
      
    
     }    
}
