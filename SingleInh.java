class rec
{
	float l, b;
	rec()
	{
		l=0.0f;
		b=0.0f;
	}
	rec(float le, float br)
	{
		l=le;
		b=br;
	}
	void disp_a()
	{
		System.out.println("Area :"+(l*b));
	}
}
class cub extends rec
{
	float h;
	cub()
	{
		super();
		h=0.0f;
	}
	cub(float l, float b, float he)
	{
		super(l, b);
		h=he;
	}
	void disp_v()
	{
		System.out.println("Volume :"+(l*b*h));
	}
}
class SingleInh
{
	public static void main(String args[])
	{
		rec r = new rec(23.4f, 45.6f);
		r.disp_a();
		cub c = new cub(23.4f, 45.6f, 76.8f);
		c.disp_v();
	}
}		