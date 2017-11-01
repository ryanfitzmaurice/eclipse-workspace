//returns the average of the test scores with lowest dropped
//drops each student's lowest score before averaging scores'
	public class Grader {
		
		private double[] grades;
		
		/*
		 * Constructor that will get array of scores and assign index values to grades
		 * @param grades the array that will receive values of testScores array
		 */
		public Grader (double[] testScores)
		{

			grades = new double[testScores.length];
			
		    for (int index = 0; index < testScores.length; index++)
		        grades[index] = testScores[index];
		    
		}
		
		/*
		 * Method to get total score
		 * @return the total of all entered scores
		 */
		public double getTotal()
		{
			double total = 0.0;
			
			for (int index = 0; index < grades.length; index ++)
				total += grades[index];
			
			return total;
		}
		/*
		 * Method to return lowest score in array
		 * @return the lowest score value in the array
		 */
		public double getLowestScore()
		{
			double lowestGrade = grades[0];
			
			for (int index = 1; index < grades.length; index++)
			{
				if (grades[index] < lowestGrade)
				{
					lowestGrade = grades[index];
				}
			}
			
			return lowestGrade;
		}
		
		/*
		 * Method to get average of array scores, lowest dropped
		 * @return average score counting all but lowest grade
		 */
		public double getAverage()
		{
		
			return (getTotal() - getLowestScore()) / grades.length;
		}

	}
