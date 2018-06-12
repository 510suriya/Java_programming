import java.util.*;
public class sum_nat{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int num=s.nextInt();
         int  count = 1, total = 0;
         while(count <= num)
         {
           total = total + count;
           count++;
             
         }
         System.out.println(total);
        
     }
}
