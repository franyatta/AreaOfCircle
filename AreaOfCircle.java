// this program calculates the area of a circle
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		final double PI = 3.14; //constant
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to input the radius
		System.out.print("Enter radius: ");
		
		// Read the radius
		double radius = input.nextDouble();
		
		// Calculate the area
		double area = PI  * radius * radius;
		
		// Output the area
		System.out.print("Area = " + area);
		
	}

}
