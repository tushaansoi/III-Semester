import java.util.Scanner;
import java.lang.Math;


class Acc{

	String name;
	String acctype;
	int accno;
	double balance;
	
	Scanner sc = new Scanner(System.in);
	
	void input(){
		System.out.println("Enter customer name: \n");
		name = sc.nextLine();
		System.out.println("Enter account number: \n");
		accno = sc.nextInt();
		System.out.println("Enter c for current, or s for savaings account: \n");
		acctype = sc.nextLine();
		System.out.println("Enter balance: \n");
	}
	
	void output(){
		System.out.println("\nCustomer name: " + name + "\n");
		System.out.println("Account number: " + accno);
		System.out.println("Account type: " + acctype);
		System.out.println("Balance remaining: " + balance);
	}
	
	void deposit(){
		int amt1;
		System.out.println("Enter amount to deposit: \n");
		amt1 = sc.nextInt();
		balance+=amt1;
		System.out.println("New balance is: \n" + balance);
	}
	
	void withdraw(){
		int amt2;
		System.out.println("\nEnter amount to withdraw: \n");
		amt2 = sc.nextInt();
		balance-=amt2;
		System.out.println("New balance is: \n" + balance + "\n");
	}

}


class Savings extends Acc{
	
	Savings(){
		super();
		System.out.println("Savings account.");
		this.acctype = "Savings";
		System.out.println("Enter amount to deposit: ");
		deposit(sc.nextInt());
		System.out.println("Enter amount to withdraw: ");
		withdraw(sc.nextInt());
		interest();
	}
		
	void interest(){
		balance*=0.06;
	}
}


class Current extends Acc{
	
	Current(){
		super();
		System.out.println("Current account.");
		this.acctype = "Current";
		System.out.println("Enter amount to deposit: ");
		deposit(sc.nextInt());
		System.out.println("Enter amount to withdraw: ");
		withdraw(sc.nextInt());
		service();
	}
	
	void service(){
		if(this.balance<10000){
			balance*=0.9;
		}
	}
}


public class accounting{
	public static void main(String[] args){
		Savings s1 = new Savings();
		s1.input();
		s1.output();
		s1.deposit();
		s1.interest();
		s1.output();
		
		Current c1 = new Current();
		c1.input();
		c1.output();
		c1.withdraw();
		c1.service();
		c1.output();
	}
}