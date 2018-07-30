import java.util.ArrayList;
import java.util.Scanner;
public class Add {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="582109";int s=0,ans=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		int[] arr=new int[a.length()];
		for(int i=0;i<a.length();i++){
			arr[i]=Integer.parseInt(Character.toString(a.charAt(i)));}
			for(int k=0;k<a.length();k++){
			    for(int j=k;j<a.length();j++){
			        s+=arr[j];}
			        al.add(s);s=0;}
			        for(int i=0;i<a.length();i++){
			            ans=ans+al.get(i);}
			            System.out.println(ans);
	    
	}}
