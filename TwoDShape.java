//3/09/2022
//TwoDShape Class in Module 1 Assignment


package Inheritance_Programs;

import java.lang.Math.*;
import java.util.Random;
public class TwoDShape implements Rotate
{
double width = 3, height = 4;

//main class for module 1 assignment
   enum Color
   {
      RED,
      GREEN,
      BLUE
   }

   public TwoDShape(double width, double height)
   {
      //constructor
      Color c = Color.RED;
      System.out.println(c);
   }
   public TwoDShape()
   {
   }


   public static double getArea(int sideA, int sideB)
   {

   //area formula for rectangles
      return ((sideA^2)*(sideB^2));
   }

/*
 * Implementation of "Rotate.java" */
   @Override
   public void rotate(double degree)
   {
      System.out.println("Rotated: " + degree);
   }
   
   @Override
   public void rotate90()
   {
      System.out.println("-" + width + ", " + height);
   }
   
   @Override
   public void rotate180()
   {
      System.out.println("-" + width + ", -" + height);
   }
/*
 *  */
   public static void main(String[] args)
   {
   //
      TwoDShape z = new TwoDShape();
      

      System.out.println("Module 1 Program");
      System.out.println("TwoDShape Class Area Method ");
      double a_r = getArea(4,5);
      System.out.println("Rectangle Area: " + a_r);

      z.rotate(90);

      
      Triangle t = new Triangle();

      t.Triangle();

      double a = t.getArea(3,4);
      System.out.println("Area of Triangle: " + a);
      String v = t.toString();
      System.out.println(v);
      z.rotate(45);
      


      
      Circle c = new Circle(3);

      double a_c = c.getArea(3,4);
      System.out.println("Area of Circle: " + a_c);
      String c_s = c.toString();
      System.out.println(c_s);
      z.rotate(90);
      

      
   }
}



