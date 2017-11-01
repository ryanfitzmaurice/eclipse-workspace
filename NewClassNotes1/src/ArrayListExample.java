import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> myStrings = new ArrayList<>();
		
		int i = 0;
		while(true) {
			System.out.print("Enter word " + (i+1) + ": ");
			String nextInput = input.nextLine();
			if(!nextInput.equals("q")) {
				myStrings.add(nextInput);
				i++;
			}
			else break;
		}//end of while loop
		
		System.out.println(myStrings);
		
		input.close();
	}//end of main method
}//end of ArrayListExample