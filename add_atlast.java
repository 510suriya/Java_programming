import java.util.Scanner;
public class addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		addition obj=new addition();
		obj.divide(n);
	}
	void divide(int n){
	int rem=0,a=0;
	while(n!=0){
		rem=n%10;
		a=a+rem;
		n=n/10;
	}
	if(a>9){
			divide(a);
			}
	else
	System.out.println(a);
	}


}
