import java.util.*;
public class Nk_rep{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int c=0;
         int n=s.nextInt();
         int k=s.nextInt();
         int arr[]=new int[20];
         for(int i=0;i<n;i++)
         {
             arr[i]=s.nextInt();
         }
         for(int i=0;i<n;i++)
         {
             if(arr[i]==k){
             c++;
             }
         }
         System.out.println(c);
        
     }
}
