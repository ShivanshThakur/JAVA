import java.io.*;
class var_size_array
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a[][] = new int[3][];
		a[0]=new int[3];
		a[1]=new int[1];
		a[2]=new int[2];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print("Enter :");
				String s=br.readLine();
				try
				{
					a[i][j]	= Integer.parseInt(s);
				}
				catch(NumberFormatException e)
				{}
			}
		}
		System.out.println("\nValues stored...");
		for(int i=0; i<a.length; i++)
		{	
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}		