import java.util.Scanner;
public class Mul_add{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);int ans=0;
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        ans=(a*b)%c;
        System.out.println(ans);
     }
}