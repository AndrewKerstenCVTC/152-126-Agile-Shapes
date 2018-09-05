package org.cvtc.shapes;

/**
 * Tests all shapes.
 * @author Andrew Kersten
 */
public class ShapesTest
{
	public static void main(String[] args)
	{
	    // Initialize objects
		Sphere sphere = new Sphere(4);
		Cylinder cylinder = new Cylinder(3, 5);
		Cuboid cuboid = new Cuboid(3, 4, 5);
		
		// Render objects
		sphere.render();
		cylinder.render();
		cuboid.render();
	}
}
