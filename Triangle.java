// The triangle class in module 1 assignment

package Inheritance_Programs;

class Triangle extends TwoDShape
{


//variable declaration
   double side1 = 3, side2 = 3, side3 = 3;
   double width = 3;
   double base = Math.pow(width,2);
   double side2_format = Math.pow(side2,2);
   double height = ((base)*(side2_format));
   //constructor for Triangle Class
   public void Triangle()
   {
      //Triangle formulas 
      //height = Math.pow((width/2),2);
      double h = heronsHeight();
      System.out.println("Height of Triangle: " + h);
      System.out.println("Width of Triange: " + width);
      Color c = Color.RED;
      System.out.println("Color of Triangle: " + c);

   }
   //heronsHeight formula
   private double heronsHeight()
   {
      height = Math.pow((width/2),2);
      double getPerimeter = side1+side2+side3;   
      return height;
   }
   //getArea for Triangle
   public double getArea(double width, double height)
   {
         double Area = (height*width)/2;
         return Area;
   }
   //toString Redefinition 
   public String toString()
   {
      return "The Triangle Class implements 'heronsHeight', \n" + "Triangle Area, and Perimeter utilizing side1, side2, and side3 ints.";
   }
   
   


   
}
