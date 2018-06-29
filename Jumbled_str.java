package jumpled;
import java.util.*;

public class Jumbled_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);String ss="";char c;
		String str=s.nextLine();
		String word[]=str.split(" ");
		for(int i=0;i<word.length;i++){
			ss=word[i];
			char[] ch=ss.toCharArray();
			for(int j=0;j<ch.length;j++){if(j%2==0){System.out.print(ch[j]);}}
			for(int k=0;k<ch.length;k++){if(k%2!=0){System.out.print(ch[k]);}}
			System.out.print(" ");}}}
