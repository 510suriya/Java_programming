import java.util.*;
public class dif_oddeve{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int dif;
        int n1=s.nextInt();
        int n2=s.nextInt();
        if(n1>n2)
        {
              dif=n1-n2;
        }
        else
        dif=n2-n1;
        if(dif%2==0){
        System.out.println("even");
        }
        else
        System.out.println("odd");
     }  
       
     
}
