package org.cvtc.shapes;

public class ShapesTest
{
	public static void main(String[] args)
	{
		Sphere sphere = new Sphere(4);
		Cylinder cylinder = new Cylinder(3, 5);
		Cuboid cuboid = new Cuboid(3, 4, 5);
		
		sphere.render();
		cylinder.render();
		cuboid.render();
	}
}
