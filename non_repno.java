import java.util.*;
public class nonrep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		int n=s.nextInt();
		while(n!=0){
			al.add(n%10);
			n=n/10;
		}System.out.println(al);
		for(int i=0;i<al.size();i++){
		al1.add(Collections.frequency(al, al.get(i)));
		
		}System.out.println(al1);
		for(int i=0;i<al1.size();i++){
			if(al1.get(i)==1)System.out.println(al.get(i));
		}

	}

}
