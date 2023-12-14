/*
 * Create a class "Calculator" with overloaded methods for addition,
subtraction, multiplication, and division. Implement methods for both
integers and doubles. Write a java program to test the implementation.

 */

 import java.util.Scanner;
 public class Calculator_{

    public double sum(double a ,double b)
    {
        
            return (a + b);
    }
    public int sum(int a ,int b)
    {
        
            return (a + b);
    }
    public double sub(double a ,double b)
    {
        
            return (a - b);
    }
    public int sub(int a ,int b)
    {
        
            return (a - b);
    }
    public double mul(double a ,double b)
    {
        
            return (a * b);
    }
    public int mul(int a ,int b)
    {
        
            return (a * b);
    }
    public double div(double a ,double b)
    {
        
            return (a / b);
    }
    public int div(int a ,int b)
    {
        
            return (a / b);
    }


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the num1: ");
        double num1 = sc.nextDouble();
        System.out.println("Eneter the num3: ");
        int num3= sc.nextInt();
       
        System.out.println("Enter the num2:");
        double num2 = sc.nextDouble();
        System.out.println("Enter the num4:"); 
        int num4 = sc.nextInt();
     
        Calculator_  obj = new Calculator_();
        
        System.out.println("Addition In Double:"+obj.sum(num1 , num2));
         System.out.println("Addition In Int:"+obj.sum(num3 , num4));

        System.out.println("Substraction  In Double:"+obj.sub(num1 , num2));
        System.out.println("Substraction iN Int:"+obj.sub(num3 , num4));

        System.out.println("Multiplication  IN Double:"+obj.mul(num1 , num2));
        System.out.println("Multiplication IN Int:"+obj.mul(num3 , num4));

        System.out.println("Division :"+obj.div(num1 , num2));
         System.out.println("Division :"+obj.div(num3 , num4));
        

        
        
       
    }
 }
 
