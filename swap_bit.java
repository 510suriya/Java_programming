import java.util.Scanner;
public class Swap {
 
public static void main(String args[]) {
    int a,b;
    Scanner in = new Scanner(System.in);
    a = in.nextInt();
    b = in.nextInt();
    a = a ^ b; 
    b = a ^ b; 
    a = a ^ b; 
    System.out.println( + a);
    System.out.println( + b);
}
}
