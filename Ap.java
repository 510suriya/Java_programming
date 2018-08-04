import java.util.Scanner;
public class AP{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int d=s.nextInt();
        int n=s.nextInt();
        System.out.println(sum(a,d,n));}
     public static int sum(int a,int d,int n ){int sum=0;
         for(int i=0;i<n;i++){
             sum+=a;
             a+=d;
         }return sum;}}