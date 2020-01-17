import java.util.Vector;
import java.io.*;
class VectorFuncNew
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Vector v = new Vector(5);
		String s;
		int j;
		System.out.println("isEmpty :"+v.isEmpty());
		for(int i=0; i<v.capacity(); i++)
		{
			s= br.readLine();
			v.addElement(s);
		}
		System.out.println("\nValues stored...");
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.elementAt(i));		
		}
		System.out.println("Enter element to be removed :");
		s=br.readLine();
		System.out.println("Status :"+v.removeElement(s));
		System.out.println("Enter index and element to be added :");
		j=Integer.parseInt(br.readLine());
		s=br.readLine();
		v.insertElementAt(s, j);
		System.out.println("isEmpty :"+v.isEmpty());
		System.out.println("After editing vector "+s+"...");
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.elementAt(i));
		}
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.removeAllElements();
		System.out.println("isEmpty :"+v.isEmpty());		
	}
}