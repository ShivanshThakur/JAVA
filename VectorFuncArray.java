import java.util.Vector;
import java.io.*;
class VectorFuncArray
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Vector v = new Vector(5);
		int a[]=new int[v.capacity()];
		String arr[] = new String[v.capacity()];
		for(int i=0; i<v.capacity(); i++)
		{
			String s= br.readLine();
			v.addElement(s);
		}
		System.out.println("\nValues stored...");
		for(int i=0; i<v.size(); i++)
		{
			System.out.println(v.elementAt(i));		
		}
		v.copyInto(arr); //Array used must be of the same type as the elements stored
		System.out.println("Values stored in string array...");
		for(int i=0; i<v.size(); i++)
			System.out.print(arr[i]+" ");
		System.out.println("\nConverting values into integer type...");
		for(int i=0; i<v.size(); i++)
		{
			try
			{
				a[i]=Integer.parseInt(arr[i]);
			}
			catch(NumberFormatException e)
			{
				a[i]=0;//Even if not provided automatically provides the values 0 to integer array
			}
		}
		System.out.println("After adding 5 to each element array becomes...");
		for(int i=0; i<v.size(); i++)
		{
			a[i]+=5;
			System.out.print(a[i]+" ");	
		}
		
	}
}