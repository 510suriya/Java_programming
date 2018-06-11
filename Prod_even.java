import java.util.*;
public class Prod_even{
    public static void main(String args[]){
    int n1,n2;
    Scanner s=new Scanner(System.in);
    n1=s.nextInt();
    n2=s.nextInt();
    int prod=n1*n2;
    if(prod%2==0)
    System.out.println("Even");
    else
    System.out.println("odd");
    }
}
