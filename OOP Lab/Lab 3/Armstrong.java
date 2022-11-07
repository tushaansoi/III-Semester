import java.util.Scanner;

class Armstrong{
	public static void main(String args[]){

		int n,r,sum,t;
		sum=0;

		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		t=n;	
		while(n!=0){
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;}
		
		System.out.println("result is: "+ sum);

		if(t==sum)
			System.out.println(t +" is armstrong");
		else
			System.out.println(t +" is not armstrong");
					}
		}