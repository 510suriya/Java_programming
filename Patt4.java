public class Patt4 {
	public static void main(String args[]){
		int n=5,i,j,r,m=2,f=1;
		for(i=1;i<=n;i++){
			for(j=n-i;j>0;j--){
				System.out.print(" ");
			}if(i==1)System.out.print("1");
			else{
				for(r=1;r<i+m;r++){
					if(r<=m)
					System.out.print(r);
					else{int s=m-f;
					s=s+64;
					char c=(char)s;
						System.out.print(c);
						f++;
					}
				}m++;f=1;
				}System.out.println();
		}
	}

}

