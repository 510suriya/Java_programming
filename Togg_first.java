import java.util.Scanner;
public class Togg_first{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         String st=s.nextLine();
         String[] split = st.split(" ");
         for(int i=0;i<split.length;i++){
            
            char c=Character.toUpperCase(split[i].charAt(0));
            String str=split[i].substring(1,split[i].length());
            System.out.print(c+str+" ");
         }
         
     }
}