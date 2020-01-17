import java.util.Vector;
import java.io.*;
class VectorFuncOld
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Vector v = new Vector(5);
		String s;
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

		//Doesn't raise error, if not present
		//Type of element to be removed should be of same type as the elements in vector
		//Returns  boolean value 

		System.out.println("After removing "+s+"...");
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.elementAt(i));
		}
		
	}
}