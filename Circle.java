//circle class in module 1 assignment

package Inheritance_Programs;

public class Circle extends TwoDShape
{
//toString redefinition
String toString = "Circle Class";

   public void getArea()
   {
      //formulas and toString for circle area
      double radius = 3;
      final double Pi = 3.14;
      //pi*r^2=circle area
      double r = Math.pow(radius,2);
      double a = Pi*r;
      
      System.out.println("Circle Area: " + a);
      System.out.println(toString);
   }
   
}