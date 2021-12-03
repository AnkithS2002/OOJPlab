
import java.util.*;
class Account
{
	Scanner sc=new Scanner(System.in);
	String name,type;
	double deposit;
	double draw;
	long acc_no;
	double bal=0.0;
	
	void input()
	{
		System.out.println("Enter customer name, acc no. and type of account: ");
		name=sc.nextLine();
		acc_no=sc.nextLong();
		sc.nextLine();
		type=sc.nextLine();
	}
	void display()
	{
		System.out.println("Amount in the bank initially: "+deposit);
		System.out.println("Current Balance: "+bal);
	}
	void deposit()
	{
		System.out.println("Enter the amount to be deposited: ");
		deposit=sc.nextDouble();
		sc.nextLine();
		bal=bal+deposit;
	}
	void withdraw()
	{
		System.out.println("Enter the amount to be withdrawn: ");
		draw=sc.nextDouble();
		sc.nextLine();
		bal=bal-draw;
	}	
}
class Sav_acct extends Account
{
	final double r=5;
	int t;
	double interest;
	Scanner s=new Scanner(System.in);
	void input()
	{
		super.input();
		System.out.println("Enter the number of years: ");
		t=s.nextInt();
		s.nextLine();
	}

	void interestCal()
	{

		interest=bal*(Math.pow((1+(r*0.01)),t)) - bal;
		bal=bal+interest;
	}
	void display()
	{

		System.out.println("Interest : "+interest);
		super.display();
	}
}
class Curr_acct extends Account
{
	Scanner sc=new Scanner(System.in);
	final double min=5000.00;
	final double ser=500.00;
	void input()
	{
		super.input();
	}
	void service()
	{
		if(bal<min)
		bal=bal-ser;
	}
	void display()
	{
		super.display();
	}
}
class Bank
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose: 1.Savings account  2.Current account");
		int ch=sc.nextInt();
		sc.nextLine();

		if(ch==1){
			Sav_acct ob1=new Sav_acct();
			ob1.input();
			ob1.deposit();
			ob1.withdraw();
			ob1.interestCal();
			
			ob1.display();

		}
		else_if(ch==2){
			Curr_acct ob2=new Curr_acct();
			ob2.input();
			ob2.deposit();
			ob2.withdraw();
			ob2.service();
			ob2.display();
		}
		else{
			System.out.println("Invalid input");
		}

	}
}
