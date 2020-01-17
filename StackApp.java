import java.io.*;
class stack
{
	private int max;
	private int[] st;
	private int top;
	public stack(int m)
	{
		max = m;
		st = new int[max];
		top = -1;
	}
	void push(int i)
	{
		if(top == max)
		{
			System.out.println("OVERFLOW");
			return;
		}	 
		st[++top]=i;
	}
	int peek()
	{
		if(top == -1)
		{
			System.out.println("EMPTY");
			return -1;
		}
		return st[top];
	}
	int pop()
	{
		if(top == -1)
		{
			System.out.println("OVERFLOW");
			return -1;
		}
		return st[top--];
	}
	boolean isEmpty()
	{
		return (top == -1);
	}
	boolean isFull()
	{
		return (top == max-1);
	}
}
class stackApp
{
	//throws IOException is required while using BufferedReader
	public static void main(String args[]) throws IOException
	{
		stack s = new stack(10);//All user defined classes are needed to have an object properly initialised. 
		String st = new String();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Stack Empty:"+s.isEmpty());
		while(!s.isFull())
		{
			System.out.println("Enter value :");
			st= br.readLine();
			s.push(Integer.parseInt(st));
			System.out.println("Status :"+s.isFull());
		}
		System.out.println("Inserted values...");
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}		
	}
}