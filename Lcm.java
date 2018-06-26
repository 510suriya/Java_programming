import java.util.*;
public class lcm{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int g=0;
        for(int i=1;i<=n1&&i<=n2;++i){
       
      if(n1%i==0&&n2%i==0)g=i;}
      int lcm=(n1*n2)/g;
      System.out.println(lcm);
}
}
