import java.util.*;
public class fact {

    public static void main(String[] args) {

        int c, fact = 1;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (c = 1; c <= n; c++)
        fact = fact * c;
        System.out.println(fact);
    }
 
  
}
