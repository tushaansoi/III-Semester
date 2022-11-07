import java.util.Scanner;

class Time{

	int hour;
	int minute;
	int second;
	
	Time(){
	hour=0;
	minute=0;
	second=0;}

	Time(int h, int m, int s){
	hour = h;
	minute = m;
	second = s;
	}

	void display(){
	System.out.println(hour + ":" + minute + ":" + second);}

	Time add(Time x, Time y){
	Time z = new Time();

	z.second = x.second + y.second;
	z.minute = x.minute + y.minute;
	z.hour = x.hour + y.hour;
	
	return z;
	}

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter time for 1: ");
        int h1 = sc.nextInt();
	int m1 = sc.nextInt();
	int s1 = sc.nextInt();
	Time t1 = new Time(h1,m1,s1);
	
	System.out.println("Enter time for 2: ");
	int h2 = sc.nextInt();
	int m2 = sc.nextInt();
	int s2 = sc.nextInt();
	Time t2 = new Time(h2,m2,s2);
	
	t1.display();
	t2.display();

	Time t3 = new Time();
	Time t4 = new Time();
	t4=t3.add(t1,t2);
	t4.display();	
	
	}

}
