import java.util.Scanner;
public class n_pow_k{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();int ans=1;
         int k=s.nextInt();
         for(int i=0;i<k;i++){
             ans=ans*n;
             }System.out.println(ans);
     }
}