//Ryan Fitzmaurice
//Individual Assignment 4
//Programming Challenge 2 - Part 1

public class ColorMix {

//final constants: String COLOR = "color";
String BLUE = "blue";
String RED = "red";
String YELLOW = "yellow";

//instant variables for color inputs
String color1;
String color2;
String color3;

//constructs
public ColorMix() {}
public ColorMix(String col1, String col2) {}

//mutators
public void setColor1 (String col1) {}
public void setColor2 (String col2) {}
public void setColor3 (String col3) {}

//accessors
public void getColor1() {}
public void getColor2() {}
public void getColor3() {}

//a method that uses if statements in conjunction with logical operators to print the outcome of mixing the colors
public void mixColor() {

//the outcome includes 5 results
if (color1.compareTo(color2) == 0)
System.out.print("entered same colors");
		
if (((color1.compareTo(RED) == 0) && (color2.compareTo(BLUE) == 0)) ||
((color1.compareTo(BLUE) == 0) && (color2.compareTo(RED) == 0)))
System.out.print("Color Purple");

if (((color1.compareTo(RED) == 0) && (color2.compareTo(YELLOW) == 0)) ||
((color1.compareTo(YELLOW) == 0) && (color2.compareTo(RED) == 0)))
System.out.print("Color Orange");

if (((color1.compareTo(BLUE) == 0) && (color2.compareTo(YELLOW) == 0)) ||
((color1.compareTo(YELLOW) == 0) && (color2.compareTo(BLUE) == 0)))
System.out.print("Color Green");

else System.out.print("no color combination possible");

}
}