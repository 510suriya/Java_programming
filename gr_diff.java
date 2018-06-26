import java.util.Scanner;
public class diff{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int ans=0;
        int n1=s.nextInt();
        int n2=s.nextInt();
        if(n1>n2)
        {ans=n1-n2;}
        else
        ans=n2-n1;
        System.out.println(ans);
}
}
