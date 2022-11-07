class AreaRectangle{

public static void main(String args[]){
	
		int length, breadth;
		length=Integer.parseInt(args[0]);
		breadth=Integer.parseInt(args[1]);
		int area=length*breadth;
		int perimeter=2*(length+breadth);
		
		System.out.println("length is="+ length);
		System.out.println("breadth is="+ breadth);
		System.out.println("area is="+ area);
		System.out.println("perimeter is="+ perimeter);
	}


}