
import java.util.*;
import java.io.*;
public class Fac_add {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int d,temp=0,d1,d2,d3,lar=0,sma=0,f,lar1=0,dn;
		int a[]=new int[3];
		int ch[]=new int[3];
		int arr[]=new int[3];
		System.out.println("Enter the 3 nos");
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		for(int j=0;j<a.length;j++){
			String st=Integer.toString(a[j]);
			for(int k=0;k<st.length();k++){
				ch[k]=Integer.parseInt(Character.toString(st.charAt(k)));
				
				d1=ch[0];
				d2=ch[1];
				d3=ch[2];
				if(d1>d2 && d1>d3)
				{
					lar=d1;
				}
				else if(d2>d3)
				{
					lar=d2;
				}
				else
					lar=d3;
				if(d1<d2 && d1<d3)
				{
					sma=d1;
				}
				else if(d2<d3)
				{
					sma=d2;
				}
				else
					sma=d3;

					
				}System.out.print(lar);
				System.out.print("\t"+sma);
			    Fac_add o=new Fac_add();
				int factorial=o.fact(sma);
				System.out.print("\t"+factorial);
				int addition=o.add(factorial,lar);
				arr[j]=addition;
				System.out.println(j);
				System.out.println("\t"+arr[j]);
				
				}
		
			
			Arrays.sort(arr);
			
			for(dn=0;dn<arr.length;dn++){
				System.out.println(arr[dn]);
			}System.out.println(arr[arr.length-1]);
			
			
		}
	int fact(int f)
	{int fa=1;

		for(int c=1;c<=f;c++){
		fa=fa*c;
		}
		return fa;}
	int add(int a1,int a2){
		int a3=a1+a2;
		return a3;
	}
	}


		

	


