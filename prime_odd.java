import java.util.*;
import java.io.*;
public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=0,k,temp,a=0;
		int n[]=new int[15];
		System.out.println("Enter the num");
		int num=s.nextInt();
		String st=Integer.toString(num);
		for(int i=0;i<st.length();i++)
		{
			n[i]=Integer.parseInt(Character.toString(st.charAt(i)));
		}
		for(int j=0;j<n.length;j++)
		{
			m=n[j];
			
			for(k=2;k<=m/2;k++)
			{
				temp=m%k;
				if(temp==0)
				{
				break;}
				else{
					System.out.println(m);
					for(int h=k+1;h<n.length;h++)
					{
						if(n[h]%2!=0)
						{
							a=n[h];
							break;
							
						}
					}break;
				}
			}
		}
		System.out.println(a);
	}

}
