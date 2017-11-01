public class PrimitivesObjects {

	public static void main(String[] args) {
		Double myDoubleObject = new Double(10.0); //Double object
		double myDoublePrimitive = 9.0; //double primitive type
		System.out.println("Double = " + myDoubleObject + " double = " + myDoublePrimitive);
		if(myDoubleObject.compareTo(myDoublePrimitive) == 0) System.out.println("They are the same");
		else if(myDoubleObject.compareTo(myDoublePrimitive) < 0) System.out.println("The primitive is larger");
		else System.out.println("The object is larger");
		System.out.println("");
		
		myDoublePrimitive = myDoubleObject;
		System.out.println("Double = " + myDoubleObject + " double = " + myDoublePrimitive);
		if(myDoubleObject.compareTo(myDoublePrimitive) == 0) System.out.println("They are the same");
		else if(myDoubleObject.compareTo(myDoublePrimitive) < 0) System.out.println("The primitive is larger");
		else System.out.println("The object is larger");
		System.out.println("");
		
		myDoublePrimitive = 11.0;
		System.out.println("Double = " + myDoubleObject + " double = " + myDoublePrimitive);
		if(myDoubleObject.compareTo(myDoublePrimitive) == 0) System.out.println("They are the same");
		else if(myDoubleObject.compareTo(myDoublePrimitive) < 0) System.out.println("The primitive is larger");
		else System.out.println("The object is larger");
		System.out.println("");
		
		myDoubleObject = myDoublePrimitive;
		System.out.println("Double = " + myDoubleObject + " double = " + myDoublePrimitive);
		if(myDoubleObject.compareTo(myDoublePrimitive) == 0) System.out.println("They are the same");
		else if(myDoubleObject.compareTo(myDoublePrimitive) < 0) System.out.println("The primitive is larger");
		else System.out.println("The object is larger");
		System.out.println("");
	}//end of main method
}//end of PrimitiveObjects class