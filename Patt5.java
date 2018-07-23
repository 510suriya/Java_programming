public class Patt5{
	public static void main(String args[]){
		int n=5,i,j,r,m=2;
		for(i=1;i<=n;i++){
			for(j=n-i;j>0;j--){
				System.out.print(" ");
			}if(i==1)System.out.print("1");
			else{
				for(r=1;r<i+m;r++){
					if(r<=m)
					System.out.print(r);
					else{
						System.out.print("*");}
				}m++;
				
			}System.out.println();
		}
		n=5;m=4;int f=4;
		for(i=4;i>=1;i--){
			for(j=n-i;j>0;j--){
				System.out.print(" ");
			}if(i==1)System.out.print("1");
			else{
				for(r=1;r<i+m;r++){
					if(r<=m-1)
					System.out.print("*");
					else{
						System.out.print(f);
						f--;
					}
				}m--;f=m;
				
			}System.out.println();
		}
	}

}


