public class DemoString {

	public static void main(String[] args) {
		
		int length;
		String newTestString;
		
		String testString = "This is a Test";
		String bigTestString = testString.toUpperCase();
		String smallTestString = testString.toLowerCase();
		
		newTestString = bigTestString + smallTestString;
		length = testString.length();
		
		System.out.println(testString);
		System.out.println("String in uppercase: " + bigTestString);
		System.out.println("String in lowercase: " + testString.toLowerCase());
		System.out.println("NewTestString is: " + newTestString);
		System.out.println("Length of String is: " + length);

	}

}
