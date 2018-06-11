import java.util.*;
public class Prod_even{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int c1=0,c2=0;
    String s=scan.next();
    for(int i=0;i<s.length();i++){
	char ch=s.charAt(i);
 	//System.out.println(c);
    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
        c1=1;
    }
    else if((ch >= '0' && ch <= '9')){
        c2=1;
    }
    }
    if(c1==1 && c2==1)
    {
        System.out.println("yes");
    }
    else
    System.out.println("no");
        
    }

}
