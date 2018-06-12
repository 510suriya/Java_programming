import java.util.*;
interface Bank{
	public void add_account(String name,int accno,int bal);
	public void withdraw(int amt);
	public void deposit(int amt);
	public void display();

}
class Indian implements Bank{
	String name;
	int accno,bal,amt;
	public void add_account(String name,int accno,int bal){
		this.name=name;
		this.accno=accno;
		this.bal=bal;
	}
	public void withdraw(int amt){
		bal=bal-amt;

	}
	public void deposit(int amt){
		bal=bal+amt;
	}
	public void display(){
		System.out.println("Ac holder:"+name);
		System.out.println("Acc no:"+accno);
		System.out.println("Balance:"+bal);
	}
	
}
class SBI implements Bank{
	String name;
	int accno,bal,amt;
	public void add_account(String name,int accno,int bal){
		this.name=name;
		this.accno=accno;
		this.bal=bal;
	}
	public void withdraw(int amt){
	
		bal=bal-amt;

	}
	public void deposit(int amt){
		bal=bal+amt;
	} 
	public void display(){
		System.out.println("Acc Holder:"+name);
		System.out.println("Acc no:"+accno);
		System.out.println("Balance:"+bal);
	}
	
}


public class Interface_imple {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bal=500,bank_ch=0;
		Scanner s=new Scanner(System.in);
		Bank sb=new SBI();
		Bank i=new Indian();
		System.out.println("1.Indian 2.SBI");
		bank_ch=s.nextInt();
		switch(bank_ch){
		case 1:
		System.out.print("Welcome to Indin bank service \n");	
		System.out.print("Enter the name\n");
		String name1=s.next();
		System.out.print("Enter the accno\n");
		int accno1=s.nextInt();
		i.add_account(name1,accno1,bal);
		int ch=0;
		while(ch>=0){
		System.out.println("1.withdraw 2.deposit\n" );
		ch=s.nextInt();
		switch(ch)
		{ 
		case 1:
		System.out.println("Enter the withdraw amt\n");
		int w_amt1=s.nextInt();
		if(w_amt1<=bal){
		i.withdraw(w_amt1);
		i.display();
		}
		else if(bal==500&&w_amt1<=500){
			System.out.println("min bal 500");
		}
		else{ 
			System.out.println("invalid ");
		}
		break;
		
		case 2:
		System.out.println("Enter the deposit amt\n");
		int d_amt1=s.nextInt();
		i.deposit(d_amt1);
		i.display();
		break;
		
		default:
			break;
		}ch++;
		}
		break;
		case 2:
			System.out.print("Welcome to SBI service\n");
			System.out.print("Enter the name\n");
			String name2=s.next();
			System.out.print("Enter the accno\n");
			int accno2=s.nextInt();
			sb.add_account(name2,accno2,bal);
			int ch1=0;
			while(ch1<=2){
			System.out.println("1.withdraw 2.deposit\n" );
			ch1=s.nextInt();
			switch(ch1)
			{ 
			case 1:
			System.out.println("Enter the withdraw amt\n");
			int w_amt2=s.nextInt();
			if(bal>500){
			sb.withdraw(w_amt2);
			sb.display();
			}
			else if(w_amt2<=500)
				System.out.println("min balance500 invalid ");
			else
				System.out.println("no amt");
			break;
			
			case 2:
			System.out.println("Enter the deposit amt\n");
			int d_amt2=s.nextInt();
			sb.deposit(d_amt2);
			sb.display();
			break;
			
			default:
				break;
			}ch1++;
			}
			break;
			default :
				break;
		
	}
		
		

	}

}

