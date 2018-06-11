import java.util.*;
import java.lang.*;
public class digits{
    public static void main(String aa[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String str=String.valueOf(n);
    char b[]=str.toCharArray();
    for(int i=0;i<b.length;i++){
         System.out.printf("%c\t",b[i]);
     }
  }
}
