import java.util.Scanner;
public class Prim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int count,num;
		num=s.nextInt();
		for (int i = 1; i <= num; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				count++;}}
			   if (count == 2) 
			   {
				System.out.println(i);
			   } }

s.close();
	}

}
