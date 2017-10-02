import java.text.DecimalFormat;

/**
 * Spherocylinder values of label, radius, & height are given
 * from user. These values are used to find circumference,
 * surface area, and volume of the Spherocylinder after setting
 * values.
 * @author LoganDuck
 *
 */
public class Spherocylinder {
	private String label = "";
	private double radius = 0.0;
	private double height = 0.0;
	 
	/**
	 * Constructor for creating shape.
	 * @param labelIn - name for the Spherocylinder.
	 * @param radiusIn - radius for the Spherocylinder.
	 * @param heightIn - height for the Spherocylinder.
	 */
	public Spherocylinder(String labelIn, double radiusIn, double heightIn) {
		setLabel(labelIn);
		setRadius(radiusIn);
		setCylinderHeight(heightIn);
	}
	
	/*Gets the label for current Spherocylinder.*/
	public String getLabel() { 
		return label; 
	}
	
	/**
	 * Sets the label for specific Spherocylinder.
	 * @param labelIn - name of Spherocylinder.
	 * @return true if label is set, false otherwise.
	 */
	public boolean setLabel(String labelIn) {
		if (labelIn == null) {
			return false;	
		}
		label = labelIn.trim();
		return true;
	}
	
	/*Gets the radius for current Spherocylinder.*/
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Sets the radius for specific Spherocylinder.
	 * @param radiusIn - radius of Spherocylinder.
	 * @return true if radius is set, false otherwise.
	 */
	public boolean setRadius(double radiusIn) {
		if (radiusIn < 0) {
			return false;
		}
		radius = radiusIn;
		return true;
	}
	 
	/*Gets the height for current Spherocylinder.*/
	public double getCylinderHeight() {
		return height;
	}
	
	/**
	 * Sets the height for specific Spherocylinder.
	 * @param heightIn - height of Spherocylinder.
	 * @return true if height is set, false otherwise.
	 */
	public boolean setCylinderHeight(double cylinderHeightIn) {
		if (cylinderHeightIn < 0) {
			return false;
		}
		height = cylinderHeightIn;
		return true;
	}
	 
	/**
	 * Calculates circumference for values from the Spherocylinder.
	 * @return circumference
	 */
	public double circumference() {
		double c = 2 * Math.PI * radius;
		return c;
	}
	 
	/**
	 * Calculates surface area for values from the Spherocylinder.
	 * @return surface area
	 */
	public double surfaceArea() {
		double sa = 2 * Math.PI * radius * (2 * radius + height);
		return sa;
	}
	 
	/**
	 * Calculates volume for values from the Spherocylinder.
	 * @return volume
	 */
	public double volume() {
		double v = Math.PI * Math.pow(radius, 2) * (1.33333333333 * radius + height);
		System.out.println();
		return v;
	}
	 
	/**
	 * Output summary for Spherocylinders.
	 */
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,##0.0##");
		String output = "Spherocylinder " + "\"" + getLabel() + "\"" + " with radius "
				+ getRadius() + " and cylinder height " + getCylinderHeight() + " has: "
		 		+ "\n\tcircumference = " + format.format(circumference()) + " units"
		 		+ "\n\tsurface area = " + format.format(surfaceArea()) + " square units"
		 		+ "\n\tvolume = " + format.format(volume()) + " cubic units\n";
		return output;
	}	 
}