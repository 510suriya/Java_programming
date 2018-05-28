import java.util.Scanner;

public class WordCount 
{
    public static void main(String[] args) 
    {
        int count=0;
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        for(int i = 0; i < str.length(); i++)
        {
        if(Character.isWhitespace(str.charAt(i))) 
        count++;
        }
        System.out.println(+count);
    } 
}
