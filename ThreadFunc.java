class A extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Start A");
			if(i==1)
				yield();
			System.out.println("i ="+i);
		}
		System.out.println("Exiting A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=0; j<5; j++)
		{
			System.out.println("Start B");
			if(j==3)
				stop();
			System.out.println("j ="+j);
		}
		System.out.println("Exiting B");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=0; k<5; k++)
		{
			System.out.println("Start C");
			if(k==1)
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e){}
		}
		System.out.println("Exiting C");
	}
}
class ThreadFunc
{
	public static void main(String args[])
	{
		A thA = new A();
		B thB = new B();
		C thC = new C();
		System.out.println("Running A");
		thA.start();
		System.out.println("Running B");
		thB.start();
		System.out.println("Running C");
		thC.start();
	}
}
