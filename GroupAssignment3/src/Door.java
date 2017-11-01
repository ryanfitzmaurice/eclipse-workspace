/**
 * Sneha Karla, Jeff Olah, Ryan Fitzmaurice
 * 9/27/17
 * In-Class Group Assignment 3
 */

public class Door{
	
	private double length;
	private double width;
	
	/**Default Constructor sets length to 0 
	 * and width to 0
	 */
	
	public Door(){
		length = 0.0;
		width = 0.0;
	}
	
	/** Constructor
	 * 
	 * @param len The length of the rectangle
	 * @param wid the width of the rectangle
	 */
	public Door(double len, double wid){
		length = len;
		width = wid;
	}
	
	/** setLength methods sets the length of rectangle
	 * @param len The value to store the length
	 */
	public void setLength (double len){
		length = len;
	}
	
	/** setWidth method sets the width of rectangle
	 * 
	 * @param wid The value to store width
	 */
	public void setWidth (double wid){
		width = wid;
	}

	
	/** getLength method returns a Rectangle Object's length
	 *	@return The value in the length field
	 */
	
	public double getLength(){
		return length;
	}
	
	/** getWith method returns a Rectangles Object's length 
	 * 
	 * @return The value in the width field
	 */
	public double getWidth(){
		return width;
	}
	
	/** getArea method returns a Rectangles Object's area
	 * 
	 * @return the product length times width
	 */

	public double getArea(){
		return length * width;
	}
}