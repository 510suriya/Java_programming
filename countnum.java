import java.util.*;
public class linec{
     public static void main(String args[]){
     int count=0;
     Scanner s=new Scanner(System.in);
     String a=s.nextLine();
     for(char c : a.toCharArray()) {
        if( c >= '0' && c<= '9') {
            ++count;
        }
    }
    System.out.println(count);
    }
    
}
