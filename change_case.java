package string_rev;
import java.util.*;
public class String_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			char c=words[i].charAt(0);
			char c1=words[i].charAt(words[i].length()-1);
			if(Character.isLowerCase(c)){
				c=Character.toUpperCase(c);
				//System.out.println(words[i].replace(words[i].charAt(0),c));
			}else
			{
				c=Character.toLowerCase(c);	
		
			}
			if(Character.isLowerCase(c1)){
				c1=Character.toUpperCase(c1);
				//System.out.println(words[i].replace(words[i].charAt(words[i].length()-1),c1));
			}else
			{
				c1=Character.toLowerCase(c1);
			}
			  words[i]=(words[i].replace(words[i].charAt(0),c));
		      words[i]=(words[i].replace(words[i].charAt(words[i].length()-1),c1));
		      System.out.print(words[i]+"\t");
		
		}

	}

}
