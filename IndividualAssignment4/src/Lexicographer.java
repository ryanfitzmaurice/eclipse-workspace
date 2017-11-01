//Ryan Fitzmaurice
//Individual Assignment 4
//Programming Challenge 1

//importing the java utility Scanner to accept user input of strings for alphabetical sorting
import java.util.Scanner;

public class Lexicographer {
	
    public static void main(String[] args) {
    	
    		//establishing variable and string
        int n;
        String temp;
        
        //activating Scanner for use
        Scanner s = new Scanner(System.in);
        
        //asking user, accepting input for amount of strings
        System.out.print("Please enter the number of strings you want to sort:");
        n = s.nextInt();
        
        //method call
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        
        //user input again, this time accepting the strings to be sorted
        System.out.println("Enter all the strings:");
        for(int i = 0; i < n; i++)
        {
            names[i] = s1.nextLine();
        }
        
        //using our variable and mathematical function to sort the input strings
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        //returns alphabetized list of strings using for statement with continuously increasing integer function for sorting alphabetically
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i < n - 1; i++) 
        {
        	//formatting for output
            System.out.print(names[i] + ",");
        }
        System.out.print(names[n - 1]);
    }
}