import java.util.*;
public class prime{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int count=0;
        int n=s.nextInt();
        int m=n/2;
         if(n==0||n==1){  
             System.out.println("no"); 
             
         }else{
             for(int i=2;i<=m;i++){
                 if(n%i==0){
                     System.out.println("no"); 
                     count=1;
                     break;
                     
                 } 
             }
             if(count==0)  { System.out.println("yes"); }  
             
         }
     }
}
