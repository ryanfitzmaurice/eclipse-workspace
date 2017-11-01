/*
 * Ryan Fitzmaurice - Individual Assignment 3
 */

/*imports all standard java utilities*/

import java.util.*;

/*creates public class "Calculator"*/

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        /*creates integers for all required functions*/
        
        int num1;
        int num2;        
        int sum;
        int difference;
        int product;
        int average;        
        int distance;
        int max;
        int min;
        
        /*prompts the user to input the two integers*/
        
        System.out.println("Enter the first number ");
        num1 = input.nextInt();

        System.out.println("Enter the second number ");
        num2 = input.nextInt();
        
        /*establishes all mathematical operations for variables to function correctly*/
        
        sum = num1 + num2;
        difference = Math.abs(num1 - num2);
        product = num1 * num2;
        average = sum / 2;
        
        /*absolute value used for difference and distance because they involve subtraction, which avoids negative number results*/
        
        distance = Math.abs(num1 - num2);
        
        /*if statements to ensure min and max operate correctly*/
        
        max = num1;
        min = num1;

        if(num2 > max)
            max = num2;

        if(num2 < min)
            min = num2;
        
        /*prints all of the information once the two integers are entered, formatted with spacing*/
        
        System.out.println("Sum:          " + sum);
        
        System.out.println("Difference:   " + difference);
        
        System.out.println("Product:      " + product);
        
        System.out.println("Average:      " + average);
        
        System.out.println("Distance:     " + distance);

        System.out.println("Max:          " + max );
        	
        	System.out.println("Min:          " + min );

    }
}