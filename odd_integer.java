import java .util.*;
public class odd_ip{
      public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int m=0;
            int n[]=new int[15];
		int num=s.nextInt();
		String st=Integer.toString(num);
		for(int i=0;i<st.length();i++)
		{
			n[i]=Integer.parseInt(Character.toString(st.charAt(i)));
		}
		for(int j=0;j<n.length;j++)
		{
			m=n[j];
			if(m%2!=0)
			{
			      System.out.print("\t"+m);
			}
		}
            
                  
      }
}
