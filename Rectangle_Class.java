class Rectangle_Class  // Class with main method
{
  	public static void main(String args[])
  	{
		Rectangle r1;
    	 	r1 = new Rectangle( ); // Creation of object r1 of type 					// Rectangle
    		r1.length = 25.12 ; // Accessing of variables
    		r1.width = 12.5 ;
    		System.out.println("\n The area of the rectangle r1 is: "                  		                                         + (r1.length * r1.width)     );
    		Rectangle r2 = new Rectangle( ) ; // Creation of object r2 of type 					// Rectangle
    		r2.GetData(12, 10); // Accessing of method
    		System.out.print("\n The area of the rectangle r2 is: ");
    		r2.AreaRect( );      // Accessing of method
      }
}
