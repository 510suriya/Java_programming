import java.util.Scanner;
public class string_var_char{
    public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         int count=0;
         String s1=s.nextLine();
         String s2=s.nextLine();
         for(int i=0;i<s1.length();i++){
             if(s1.charAt(i)!=s2.charAt(i)){count++;
             }
         }
        if(count==1){System.out.println("yes");}
        if(count==0){System.out.println("no");}  
        
    
}}