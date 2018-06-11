import java.util.*;
public class Words{
    public static void main(String args[]){
    int n, num = 0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    while(n != 0)
    {
        num = (num * 10) + (n % 10);
        n /= 10;
    }
    while(num != 0)
    {
        switch(num % 10)
        {
            case 0: 
                System.out.print("Zero ");
                break;
            case 1: 
                System.out.print("One ");
                break;
            case 2: 
                System.out.print("Two ");
                break;
            case 3: 
                System.out.print("Three ");
                break;
            case 4: 
                System.out.print("Four ");
                break;
            case 5: 
                System.out.print("Five ");
                break;
            case 6: 
                System.out.print("Six ");
                break;
            case 7: 
                System.out.print("Seven ");
                break;
            case 8: 
                System.out.print("Eight ");
                break;
            case 9: 
                System.out.print("Nine ");
                break;
        }
        
        num = num / 10;
    }

}
}
