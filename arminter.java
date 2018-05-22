import java.util.*;
public class Armstrong {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        for(int number = n1+1; number <n2; ++number) {

            if (checkArmstrong(number))
                System.out.print(number + " ");
        }
    }

    public static boolean checkArmstrong(int num) {
        int digits = 0;
        int result = 0;
        int originalNumber = num;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }
        originalNumber = num;
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }
        if (result == num)
            return true;
         return false;
    }
}
