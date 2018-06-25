import java.util.*;
public class Eve_odd {
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			long n=s.nextLong(),r;
			int arr[]=new int[10],index=0;
			for(int i=0;i<10;i++){
				r=n%10;
				arr[9-i]=(int)(r);
				n=n/10;
			}
			
			
			for(int j=index;j<10;j++){
				int sum=0;
				if(arr[j]%2==0 ){
					for(int i=j;i<10;i++){
						sum=sum+arr[i];
						j++;
						if(sum%2!=0 || i==j){
							System.out.println(sum);
							j--;
							break;
						}
					}
				}
				else {
					for(int i=j;i<10;i++){
						sum=sum+arr[i];
						j++;
						if(sum%2==0 || i==j){
							System.out.println(sum);
							j--;
							break;
						}
					}
				}
			}

	}
	}
