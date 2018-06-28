import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


public class repeated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		TreeSet<Integer> t = new TreeSet<Integer>();
		int n=s.nextInt();
		while(n!=0){
			al.add(n%10);
			n=n/10;
		}System.out.println(al);
		for(int i=0;i<al.size();i++){
			t.add(al.get(i));
		}System.out.println(t);
		

	}

}
