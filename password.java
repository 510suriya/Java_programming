import java.util.Scanner;
public class password {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();char ss;int sum=0;
		int rno=s.nextInt();String sc=Integer.toString(rno);int t[]=new int[7];
		ss=str.charAt(str.length() - 1);
		for(int i=0;i<sc.length();i++){
		t[i]=Integer.parseInt(Character.toString(sc.charAt(i)));}
		int two=t[sc.length()-2];
		int three=t[sc.length()-1];
		while(rno!=0){
			int rem=rno%10;
			sum=sum+rem;
			rno=rno/10;
		}
		char sym[]={'!','@' ,'#', '$', '%' ,'^' ,'*' ,',' ,'(',')'};
		char st='\n';
		for(int i=0;i<sym.length;i++){
			if(i==two){
				st=sym[i];
			}
		
			}
			
	System.out.print(sum);System.out.print(st);
	System.out.print(three);System.out.print(ss);

}}
