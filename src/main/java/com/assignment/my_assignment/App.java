package com.assignment.my_assignment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator cal = new Calculator();
        System.out.println(cal.sum(30, 40));
        System.out.println(cal.divide(3, 3));
        System.out.println(cal.subtract(40, 40));
    }
}
