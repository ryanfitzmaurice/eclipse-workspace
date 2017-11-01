//Ryan Fitzmaurice
//Individual Assignment 4
//Programming Challenge 2 - Part 2

//imports Scanner utility for user input to test ColorMix.java
import java.util.Scanner;

public class TestColorMix {

	public static void main(String[] args) {
		
		
		//Calls the method for determining mix from ColorMix.java
		ColorMix color3 = new ColorMix();
		
		//Using the scanner for user input of colors
		Scanner inputs = new Scanner(System.in);
	
//prints a short description of the purpose of the program
System.out.println("The purpose of this program is to test the ColorMix.java class.");

//asks the user to enter two colors to mix
System.out.println("Please enter two colors to mix.");

String color1 = inputs.nextLine();
String color2 = inputs.nextLine();

//prints colors entered by user
System.out.println("The colors you entered are");

System.out.println(color1);
System.out.println(color2);

//prints mix result
System.out.println("These colors mix together as");
System.out.println(color3);


}
}