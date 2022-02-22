// The triangle class in module 1 assignment

package Inheritance_Programs;

public class Triangle extends TwoDShape
{

//toString redefinition

   String toString = "Triangle Class";
   double side1 = 3, side2 = 3, side3 = 3;
   double width = 3;
   double base = Math.pow(width,2);
   double side2_format = Math.pow(side2,2);
   double height = ((base)*(side2_format));
   public void Triangle()
   {
   //Triangle formulas 
   height = Math.pow((width/2),2);
   double getArea = (height*width)/2;
   System.out.println("Triangle Area: " + getArea);
   System.out.println(toString);
   }
   private double heronsHeight()
   {
   double getPerimeter = side1+side2+side3;
   
   return height;
   }
   
   ///////////////////////////////////////////////////////////////////////////////////////////////

   public void rotate90()
   {
   }
   public void rotate180()
   {
   }
   public double Rotate(double degree)
   {
      return 20;
   }

   
}