import java.util.Scanner;
public class decimal{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        float f;
        float l=s.nextFloat();
        float b=s.nextFloat();
        f=l*b;
        System.out.printf("%.5f",f);
}
}
