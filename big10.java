import java.util.Scanner;
public class highestnumber {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        for(int i = 0, temp = 0; i < 10; i++){
            temp = scan.nextInt();
            if(temp > max) max = temp;
        }
        System.out.println(max);
    }
}
