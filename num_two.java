import java.util.Scanner;
public class num_two{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int n1,rem;
         while(n!=1){
             rem=n%2;
             n1=n/2;
             System.out.print(n1);
             n=rem;
             break;
         }
     }
}