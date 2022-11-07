import java.util.Scanner;

class Employee{

	String name;
	String city;
	int basic;
	int da;
	int Total;
	int hra;

	Scanner sc = new Scanner(System.in);

	void getdata(){
	System.out.println("enter data: ");
	name=sc.nextLine();
	city=sc.nextLine();
	basic=sc.nextInt();
	da=sc.nextInt();
	hra=sc.nextInt();}

	void calculate(){
	Total=basic+(basic*da/100)+(basic*hra/100);}

	void display(){
	System.out.println("name: "+name);
	System.out.println("city: "+city);
	System.out.println("basic: "+basic);
	System.out.println("dearness allowance: "+da+"%");
	System.out.println("house rent: "+hra +"%");
	System.out.println("given data: "+Total);}

	public static void main(String args[]){
	Employee emp = new Employee();
	emp.getdata();
	emp.calculate();
	emp.display();}


}