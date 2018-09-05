package org.cvtc.shapes;

/**
 * Shape abstract base object.  All shapes are children of this class.
 * @author Andrew Kersten
 */
public abstract class Shape
{
	/**
	 * Returns a float representing the surface area of the shape.
	 * @return the surface area of the shape
	 */
	public abstract float surfaceArea();
	
	/**
	 * Returns a float representing the volume of the shape.
	 * @return the volume of the shape
	 */
	public abstract float volume();
	
	/**
	 * Displays the shape's dimensions, surface area, and volume in a message box.
	 */
	public abstract void render();
}
