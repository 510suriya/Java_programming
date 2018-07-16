import java.util.Scanner;
public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		for(int i=1;i<=no;i++){
			for(int sp=1;sp<=no-i;sp++){
				System.out.print(" ");
				}
			for(int j=i;j<=i;j++){
				for(int c=1;c<=j;c++){
					System.out.print(j);
				}
				for(int l=1;l<j;l++){
					System.out.print(j);
				}
			}System.out.print("\n");
		}

	}

}
