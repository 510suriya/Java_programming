import java.util.Scanner;

import java.lang.*;

public class Inter{

     
public static void main(String []args){
         
Scanner s=new Scanner(System.in);
         
int p=s.nextInt();
         
int n=s.nextInt();
         
int t=s.nextInt();
         
double i=(p*n*t)/100;
         
System.out.println(Math.floor(i));
        
     
}
}