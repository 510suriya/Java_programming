import java.util.Scanner;
public class sum_squ{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
          int num=s.nextInt();int sum=0;
          while(num>0){
              int rem=num%10;
              rem=rem*rem;
              sum=sum+rem;
              num=num/10;
          } System.out.print(sum);
     }
}