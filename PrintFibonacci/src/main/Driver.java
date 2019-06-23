package main;

import java.util.Scanner;
import application.*;

/**
 * <h1>PrintFibonacci</h1>
 * Prints the Fibonacci sequence up to the nth item provided by the user
 * 
 * @author Matt Ricci
 */
public class Driver
{

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.print("Please enter the amount of items you want in the sequence: ");
        int count = sc.nextInt();
        
        Fibonacci fib = new Fibonacci();
        String result = fib.run(count);
        
        System.out.println(String.format("The Fibonacci sequence to %d items is\n%s", count, result));
    }

}
