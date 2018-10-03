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
		Sphere sphere = new Sphere(new MessageBox(), 4);
		Cylinder cylinder = new Cylinder(new MessageBox(), 3, 5);
		Cuboid cuboid = new Cuboid(new MessageBox(), 3, 4, 5);
		
		// Render objects
		sphere.render();
		cylinder.render();
		cuboid.render();
		
		ShapeFactory factory = new ShapeFactory(new MessageBox());
		
		Shape factorySphere = factory.make(ShapeType.SPHERE);
		Shape factoryCylinder = factory.make(ShapeType.CYLINDER);
		Shape factoryCuboid = factory.make(ShapeType.CUBOID);
	}
}
