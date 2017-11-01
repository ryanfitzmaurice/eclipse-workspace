import java.util.Scanner;

/**
 * Sneha Karla, Jeff Olah, Ryan Fitzmaurice
 * In Class Group Assignment 6
 * 10/15/17	
 */

public class DriveCar {

	public static void main(String[] args) {
		
		String make, input;
		int yearModel, speed;
		
		Car car1 = new Car("Honda", 2010);
		
		Scanner carModel = new Scanner(System.in);
		System.out.println("What is the model year of your car?: ");
		yearModel = carModel.nextInt();
		//car.close();
		
		Scanner carMake = new Scanner(System.in);
		System.out.println("What is the name of the make of your car?: ");
		make = carMake.nextLine();
		//carMake.close();
		
		Scanner speedChange = new Scanner(System.in);
		System.out.println("How many times is the car accelerating?(1-10): ");
		speed = speedChange.nextInt();
		
		while (speed >=1 && speed <= 10)
		{
			if (speed >=1 && speed <=10)
			{
				car1.accelerate();
				System.out.println("Your " + yearModel + " " + make + " accelerated " + speed + " times." );
				System.out.println("The current speed of the car is: " + car1.getSpeed());
				speed++;
			}
			else
			{
				System.out.println("Please enter a valid number (1-10)");

			}
		}
			
		
		

	}

}
