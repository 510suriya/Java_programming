import java.util.Scanner;
public class Arr_find{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[7];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==3)
        System.out.println(a[i]);}
        
     }
}