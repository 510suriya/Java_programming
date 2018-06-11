import java.util.*;
public class Sum_num{
    public static void main(String args[]){
    int n, sum = 0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
    System.out.println(sum);
    }
}
