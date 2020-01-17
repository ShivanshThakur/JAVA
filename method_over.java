class box
{
	int l, b, h;	
	box(int le, int br)
	{	
		l=le;
		b=br;
		h=0;
	}
	box(int le, int br, int he)
	{
		l=le;
		b=br;
		h=he;
	}
	void area()
	{
		System.out.println("\nArea :"+(l*b));
	}
	void volume()
	{
		System.out.println("\nVolume :"+(l*b*h));
	}
}
class method_over
{
	public static void main(String args[])
	{
		box b1 = new box(234, 67);
		box b2 = new box(456, 76, 45);
		System.out.println("\n------B1------");
		b1.area();
		b1.volume();
		System.out.println("\n\n------B2------");
		b2.area();
		b2.volume();
		System.out.println("\n\n--------------");
	}
}
	
