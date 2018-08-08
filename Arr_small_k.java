import java.util.Scanner;
public class small_arr{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int k=s.nextInt();int temp=0;
         int[] a=new int[n];
         for(int i=0;i<n;i++){
             a[i]=s.nextInt();
         }
         for (int i=0;i<n;i++){ 
            for (int j=i+1;j<n;j++){
                if (a[i] > a[j])   
                {  temp = a[i];  
                   a[i] = a[j];  
                   a[j] = temp;} 
                   if(j==k)
            System.out.println(a[i]); break;}}
     }
}