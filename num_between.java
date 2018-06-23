import java.util.*;
public class num_bet{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=s.nextInt();
        int r=s.nextInt();
        for(int i=l+1;i<=r-1;i++)
        {
              if(n==i)
              System.out.println("yes");
              else
              System.out.println("no");
        }
      
     } 
     
}
