class comp
{
	float i, r;
	comp()
	{}
	comp(float re, float im)
	{
		r=re;
		i=im;
	}
	void add(comp c1, comp c2)
	{
		r=c1.r+c2.r;
		i=c1.i+c2.i;
	}
	void mul(comp c1, comp c2)
	{
		r=(c1.r*c2.r)-(c1.i-c2.i);
		i=(c1.r*c2.i)+(c1.i*c2.r);
	}
	void disp()
	{
		if(i>=0)
		{
			System.out.println(r+"+"+i+" i\n");
		}
		else
		{
			System.out.println(r+i+" i\n");
		}
	}
}
class complex
{
	public static void main(String srgs[])
	{
		comp c1 = new comp();
		comp c2 = new comp(4.5f, 5.6f);
		comp c3 = new comp(7.8f, -3.4f);
		c1.add(c2, c3);
		System.out.println("After adding :-\n");
		c1.disp();
		c1.mul(c2, c3);
		System.out.println("After multiplying :-\n");
		c1.disp();
	}
}
