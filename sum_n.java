import java.util.Scanner;
public class sum_n {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);int ans=0;
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int j=0;j<n;j++){
			ans=ans+a[j];
		}
		System.out.println(ans);
		
		

	}

}
