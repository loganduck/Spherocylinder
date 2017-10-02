import java.util.Scanner;
import java.util.InputMismatchException;

public class SpherocylinderApp {
	static Scanner scan = new Scanner(System.in);
	static String label = "";
	static double radius = 0.0;
	static double height = 0.0;
	
	public static void main(String[] args) {	
		System.out.print("Enter label, radius, and cylinder height"
				+ " for a Spherocylinder.\n\tlabel: ");
		label = scan.nextLine();
		System.out.print("\t"
				+ "radius: ");
		try {
			radius = scan.nextDouble();
			if (radius > 0) {
				System.out.print("\tcylinder height: ");
				height = scan.nextDouble();
				if (height > 0) {
					Spherocylinder s = new Spherocylinder(label, radius, height);
					System.out.println(s.toString());
				} else {
					System.out.println("Error: cylinder height must be non-negative.");
				}
				
			} else {
				System.out.println("Error: radius must be non-negative.");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Error: non-number value entered.");
		}
	}
}