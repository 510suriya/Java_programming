
import java.util.Scanner;

public class WordCount 
{
    public static void main(String[] args) 
    {
        int word=1;
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        for(int i=1;i<str.length();i++)
            {
                if(str.charAt(i)==' ' && str.charAt(i-1)!=' ')
                word++;
            }
       System.out.println(+word);
    }
}
