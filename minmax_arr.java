import java.util.*;
public class bigarr{

     public static void main(String []args){
         
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int min = a[0]; 
		int max = a[0];
        for (int j= 1; j < a.length; j++)  
		{
			if (a[j] > max) 
			{
				max = a[j];
			}
			if (a[j] < min) 
			{
				min = a[j];
			}
		}
		System.out.println(min);
		System.out.println(max);
        
     }
     
}
