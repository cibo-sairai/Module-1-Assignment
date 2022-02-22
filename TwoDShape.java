//2/17/2022
//TwoDShape Class in Module 1 Assignment


package Inheritance_Programs;

import java.lang.Math.*;
import java.util.Random;
public class TwoDShape
{
//main class for module 1 assignment

String Color[] = {"RED","BLUE","GREEN","NONE"};
   public TwoDShape()
   {
   //constructor
   
   Random r = new Random();
   int rand = r.nextInt(4);
   System.out.println(Color[rand]);
   int width;
   double height;
   }
   public double getArea(int sideA, int sideB)
   {
   //area
      return ((sideA^2)*(sideB^2));
   }
   public void setHeight(double h)
   {
   
   }
   public static void main(String[] args)
   {
      System.out.print("TwoDShape Color: ");
      new TwoDShape();
      System.out.print("Triangle Color: ");
      Triangle t = new Triangle();
      System.out.print("Circle Color: ");
      Circle c = new Circle();
      


      
      
      t.Triangle();
      t.toString();
      

      
      
      c.getArea();
      c.toString();
      
   }
}

