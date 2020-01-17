class object
{
	static int count;
	object()
	{
		count++;
	}
	void disp()
	{
		System.out.println("Count :"+count);
	}
}
class static_count
{
	public static void main(String args[])
	{
		object o1=new object();
		System.out.println("\n------O1------");
		o1.disp();	
		object o2=new object();
		System.out.println("\n\n------O1------");
		o1.disp();
		object o3=new object();
		System.out.println("\n\n------O1------");
		o1.disp();
	}
	
}