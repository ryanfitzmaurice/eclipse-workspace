/**
 * Sneha Karla, Jeff Olah, Ryan Fitzmaurice
 * In Class Group Assignment 6
 * 10/15/17	
 */

import javax.swing.JOptionPane;

	public class Car
	{
		private int Speed = 0;
		private String Make = "Lexus";
		private int yearModel = 2005;
			
		/*
		 * Construct for new car object
		 * @param Make model name of car
		 * @param yearModel year the model was made
		 */
		public Car (String n, int Model)
		{	
			Make = n;
			yearModel = Model; 
		}
		
		/*
		 * Accessor to retrieve model year
		 * @return gets model year of car
		 */
		public int getyearModel ()
		{
			return yearModel;
		}
		
		/*
		 * Accessor to retrieve make of car
		 * @return gets make name of car
		 */
		public String getMake ()
		{
			return Make;
		}
		
		/*
		 * Accessor to retrieve speed of car
		 * @return gets speed of car
		 */
		public int getSpeed ()
		{
			return Speed;
		}	
			
		/*
		 * Mutator to increase car speed 
		 */
		public void accelerate ()
		{
				Speed = Speed + 5;
		}
		
		/*
		 * Mutator to decrease car speed
		 */
		public void brake ()
		{
				Speed = Speed - 5;
		}
	}
