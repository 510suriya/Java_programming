import java.util.Scanner;
public class Rev_no {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem;
		while(n!=0){
			rem=n%10;
			System.out.print(rem);
			n=n/10;
		}

	}

}
