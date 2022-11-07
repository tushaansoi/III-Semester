class Factorial{

public static void main(String args[]){
	
	int n;
	n=Integer.parseInt(args[0]);
	
	int fact;
	fact=1;
	int i;
	i=1;
	
	
	for(i=1;i<=n;i++){
		fact=fact*i;
	}
	
	System.out.println("Factorial of " + n + "is: " + fact);
	
	}
}