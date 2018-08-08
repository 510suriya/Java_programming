import java.util.Scanner;
public class odd_count{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();int c=0;
         int k=s.nextInt();
         int[] a=new int[n];
         for(int i=0;i<n;i++){
             a[i]=s.nextInt();}
             for(int i=0;i<n;i++){
             if(a[i]%2!=0){c++;
             }
             if(c==k) System.out.println(a[i]);}
     }
}