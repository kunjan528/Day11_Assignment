/*
 * Create a class "Geometry" with overloaded methods to calculate the area
of a square, rectangle, and circle. Use appropriate parameters for each
method. Write a java program to test the implementation.
 */

import java.util.Scanner;

public class Geometry_ {

    public double Area(double radius)
    {
            return (3.14 * radius);
    }
    public float Area(float side)
    {
            return (side * side);
    }
    public double Area(double length , double breadth)
    {
            return(length * breadth);
    }




    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter radius of circle :");
        double radius = sc.nextDouble();

        System.out.println("Enter the side :");
        int side = sc.nextInt();

        System.out.println("Enter the length & breath");
        double length =sc.nextDouble();
        double breadth = sc.nextDouble();

        Geometry_ geo = new Geometry_();
        System.out.println("Area Of Circle :"+geo.Area(radius));
        System.out.println("Area Of Circle :"+geo.Area(side));
        System.out.println("Area Of Circle :"+geo.Area(length,breadth));
        
        

    }
    
}
 