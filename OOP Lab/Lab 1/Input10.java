javaimport java.io.*;
class Input10{

public static void main(String args[])throws Exception{ 
	
	DataInputStream z=new DataInputStream(System.in);
	int arr[]=new int[10];
	int i;
	for(i=0;i<10;i++){
	arr[i]=Integer.parseInt(z.readLine());}	
		
	for(i=0;i<10;i++){
	System.out.println("numbers are"+ arr[i]);}
	
	int a=0,b=0,c=0;
	
	for(i=0;i<10;i++){
		if (arr[i]==0){
			a=a+1;}
			
		if (arr[i]>0){
			b=b+1;}
		
		if (arr[i]<0){
			c=c+1;}
			
	}
			
	System.out.println("number of zeroes are= "+ a);
	System.out.println("number of positive integers are= "+ b);
	System.out.println("number of negative integers are= "+ c);

	}

}