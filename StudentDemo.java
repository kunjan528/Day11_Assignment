/*
 * Implement a class "Student" with instance variables (name, rollNumber)
and a parameterized constructor. Inside the constructor, use the "this"
keyword to differentiate between instance variables and constructor
parameters. Write a java program to print the instance variable values.
 */

import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name :");
        String nm = sc.nextLine();
        System.out.print("Roll no:");
        int no = sc.nextInt();
        Student s = new Student(nm , no);
        s.display();

    }

    
}

class Student
{

     private String nm ; 
     private int no;
    public Student(String name , int roll)
    {
        this.nm = name;
        this.no = roll;
    }
    public void display()
    {
        System.out.println("Name : "+nm);
        System.out.println("Roll No :"+no);

    }
    

}
