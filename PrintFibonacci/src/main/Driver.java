package main;

import java.util.Scanner;

import application.*;

/**
 * @author Matt Ricci
 */
public class Driver
{

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.print("Please enter the amount of items you want in the sequence: ");
        int count = sc.nextInt();
        
        Fibonacci fib = new Fibonacci();
        String result = fib.run(count);
        
        System.out.println(result);
    }

}
