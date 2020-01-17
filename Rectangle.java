class Rectangle
{
 		double length ;  // Instance Variable
 		double width ;   // Instance Variable
  		void GetData(double l, double w)  // Method Definition
  		{
    			length = l ;
    			width = w ;
  		}
  		void AreaRect( )    // Method Definition
  		{
    			double area = length * width ;
    			System.out.print(area);
  		}
} // End of the class definition
