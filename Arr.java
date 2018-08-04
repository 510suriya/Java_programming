import java.util.Scanner;
public class Array_ret{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=s.nextInt();}
        for(int i=1;i<=n;i++){
            if(i==k){System.out.print(a[i]);}
            
        }}}