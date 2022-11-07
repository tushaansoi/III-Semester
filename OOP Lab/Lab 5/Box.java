class Box{
	int h,w,d;
	
	Box(int height, int width, int depth)
	{
	h=height;
	w=width;
	d=depth;}

	int volume()
	{int v;
	v=h*w*d;
	return v;}

	public static void main(String args[]){
		Box bx = new Box(8,9,10);
		System.out.println(bx.volume());
	}

}