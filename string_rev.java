import java.util.Scanner;
public class string_rev_dis{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         String st=s.next();
         int n=s.nextInt();
         int n1=st.length()-n;
         for(int i=n1;i<st.length();i++){
             System.out.print(st.charAt(i));
         }
     }
}