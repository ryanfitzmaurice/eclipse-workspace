/**
 * Sneha Karla, Jeff Olah, Ryan Fitzmaurice
 * 9/27/17
 * In-Class Group Assignment 3
 */

public class WallDimension {
			
		private double length;
		private double width;
		private double hight;
		
		/**Default Constructor sets length to 0 
		 * and width to 0
		 */
		
		public WallDimension(){
			length = 0.0;
			width = 0.0;
			hight = 0.0;
		}
		
		/** Constructor
		 * 
		 * @param len The length of the rectangle
		 * @param wid the width of the rectangle
		 * @param high the width of the rectangle
		 */
		public WallDimension(double len, double wid, double high){
			length = len;
			width = wid;
			hight = high;
		}
		
		/** setLength methods sets the length of rectangle
		 * @param len The value to store the length
		 */
		public void setLength (double len){
			length = len;
		}
		
		/** setWidth method sets the width of rectangle
		 * @param wid The value to store width
		 */
		public void setWidth (double wid){
			width = wid;
		}

		/** setHight methods sets the hight of rectangle
		 * @param len The value to store the hight
		 */
		public void setHight (double high){
			hight = high;
		}
		
		/** getLength method returns a Rectangle Object's length
		 *	@return The value in the length field
		 */
		
		public double getLength(){
			return length;
		}
		
		/** getWith method returns a Rectangles Object's width 
		 * 
		 * @return The value in the width field
		 */
		public double getWidth(){
			return width;
		}
		
		/** getHight method returns a Rectangle Object's hight
		 *	@return The value in the hight field
		 */
		
		public double getHight(){
			return hight;
		}
		
		/** getArea method returns a Rectangles Object's area
		 * 
		 * @return the product length times width
		 */

		public double getArea(){
			double area = 2*(length * hight) + 2*(width * hight);
			return area;
		}
}
