/**
 * Sneha Karla, Jeff Olah, Ryan Fitzmaurice
 * 9/27/17
 * In-Class Group Assignment 3
 * This version of the Generic Paint Cost program uses the scanner class and uses formatted output.
 */

import java.util.Scanner;

public class GenericPaintCost2 {

	public static void main(String[] args) {
		
		Scanner inputs = new Scanner(System.in);
		
		/*
		 * Input collection for building address
		 */
		System.out.println("Enter building address: ");
		String address = inputs.nextLine();
		
		/*
		 * Input collection for the building dimensions
		 */
		System.out.println("Enter length of building: ");
		double buildLength = inputs.nextDouble();
		System.out.println("Enter width of building: ");
		double buildWidth = inputs.nextDouble();
		System.out.println("Enter hight of building: ");
		double buildHight = inputs.nextDouble();

		/*
		 * Creation of walls based on dimensional input
		 */
		WallDimension ExternalWalls =
		new WallDimension(buildLength, buildWidth, buildHight);

		/*
		 * Input collection for the length and width of the main door
		 */
		System.out.println("Enter length of main enterance door: ");
		double mdoorLength = inputs.nextDouble();
		System.out.println("Enter width of main enterance door:  ");
		double mdoorWidth = inputs.nextDouble();

		/*
		 * Creation of door based on dimensional input
		 */
		Door MainEnterance = new Door(mdoorLength, mdoorWidth);

		/*
		 * Creation of side doors based on dimensional input
		 */
		System.out.println("Enter length of side door: ");
		double sdoorLength = inputs.nextDouble();
		System.out.println("Enter width of side door:  ");
		double sdoorWidth = inputs.nextDouble();

		/*
		 * Creation of the side doors
		 */
		Door SideDoor = new Door(sdoorLength, sdoorWidth);

		/*
		 * Collection of input for windows
		 */
		System.out.println("Enter length of window: ");
		double windowLength = inputs.nextDouble();
		System.out.println("Enter width of window:  ");
		double windowWidth = inputs.nextDouble();

		/*
		 * Creation of window object
		 */
		Door Window = new Door(windowLength, windowWidth);

		/*
		 * Collection of cost of paint
		 */
		System.out.println("Enter the cost of paint: ");
		double paintCost = inputs.nextDouble();

		/*
		 * Collecting all area of doors, windows, and sides
		 */
		double mainDoor = MainEnterance.getArea();
		double sideDoor = SideDoor.getArea();
		double window = Window.getArea();
		double wallArea = ExternalWalls.getArea();

		/*
		 * Calculation of total area to be painted
		 */
		double paintedArea = wallArea - (2*mainDoor + 2*sideDoor + 30*window);

		/*
		 * Calculated cost of area to be painted
		 */
		double calculatedCost = paintCost * paintedArea;

		/*
		 * Display formatted output
		 */
		System.out.println("Building Address: " + address);
		System.out.println("Total area covered by doors: " + (2*mainDoor + 2*sideDoor));
		System.out.println("Total area covered by windows: " + 30*window);
		System.out.println("Total area to paint: " + paintedArea);
		System.out.println("Cost of paint: $" + calculatedCost);
		

		System.out.println( String.format( "%.2f", "Cost of paint: $" + calculatedCost) );
	}

}
