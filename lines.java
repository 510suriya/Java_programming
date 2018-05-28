import java.util.*;
public class linec{
     public static void main(String args[]){
     int count=0;
     Scanner s=new Scanner(System.in);
     String a=s.nextLine();
     String b[]=a.split("\\.");
     for(int i=0;i<b.length;i++){
         count++;
     }
     System.out.println(count);
    }

      
}
