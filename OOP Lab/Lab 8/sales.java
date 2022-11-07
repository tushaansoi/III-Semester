import java.util.Scanner;

interface Market{
	final Scanner sc = new Scanner(System.in);
	void sales();
}

class software implements Market{
	String type;
	String OS;
	
	software(){
		System.out.println("Enter the type: ");
		type = sc.nextLine();
		System.out.println("Enter the operating system: ");
		OS = sc.nextLine();
	}
	
	public void sales(){
		System.out.println("total sales: 130");
	}	
}

class hardware implements Market{
	String category;
	String manufacturer;
	
	hardware(){
		System.out.println("Enter the category: ");
		category = sc.nextLine();
		System.out.println("Enter the manufacturer: ");
		manufacturer = sc.nextLine();
	}
	
	public void sales(){
		System.out.println("total sales: 140");
	}
}

public class sales{
	public static void main(String[] args){
		Market m1 = new hardware();
		m1.sales();
		
		Market m2 = new software();
		m2.sales();
	}
}