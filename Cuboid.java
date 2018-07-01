import java.util.Scanner;
public class Cuboid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		int sur=2*x*y+1*y*z+2*y*z;
		int vol=x*y*z;
		System.out.println(sur);
		System.out.println("\n");
		System.out.println(vol);

	}

}
