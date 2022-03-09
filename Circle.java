//circle class in module 1 assignment

package Inheritance_Programs;

class Circle extends TwoDShape
{

   public final double Pi = 3.14;
   private double radius;
   //constructor for circle class
   public Circle(double radius)
   {
      radius = 4;
      Color c = Color.GREEN;
      System.out.println("Radius of Circle: " + radius);
      System.out.println("Color of Circle: " + c);
   }
   public double getArea(double radius, double r)
   {
      //formulas and toString for circle area
      
      
      //pi*r^2=circle area
      r = Math.pow(radius,2);
      double a = Pi*r;
      
      return r;
   }
   //toString redefinition
   public String toString()
   {
      return "The Circle Class calculates the area of the Circle, \n" + "utilizing radius, and Pi*r^2.";
   }

}
