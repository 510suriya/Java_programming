import java.util.Scanner;
public class add_py {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int ans=0;
		int n=s.nextInt();
		int inc=s.nextInt();
		int row=s.nextInt();
		for(int i=0;i<row;i++){
	    for(int j=0;j<=i;j++){
	    	ans=ans+n;                                                                                                                       
	    }n=n+inc;
		}System.out.println(ans);

	}

}
