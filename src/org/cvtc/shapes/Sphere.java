package org.cvtc.shapes;

import java.text.DecimalFormat;

/**
 * Sphere representation.  Child of Shape.
 * @author Andrew Kersten
 */
public class Sphere extends Shape implements IRenderer
{
    /**
     * The radius of the sphere.
     */
    private float radius;
	
	/**
	 * Get the radius of the sphere.
	 * @return the radius of the sphere
	 */
	public float getRadius()
	{
		return radius;
	}

	/**
	 * Set the radius of the sphere.  Radius must not be less than zero.
	 * @param radius radius of the sphere
	 * @throws IllegalArgumentException if radius is less than zero
	 */
	private void setRadius(float radius)
	{
		if (radius < 0)
		{
			throw new IllegalArgumentException("Radius cannot be less than zero.");
		}
		
		this.radius = radius;
	}
	
	/**
	 * Initialize a sphere with a radius of radius.
	 * @param radius the radius of the sphere
	 */
	public Sphere(IDialog messageBox, float radius)
	{
	    super(messageBox);
	    
		setRadius(radius);
	}
	
	@Override
	public float surfaceArea()
	{
		// Formula for surface area: 4(pi)r^2
		return 4.0f * (float)Math.PI * (float)Math.pow(getRadius(), 2);
	}

	@Override
	public float volume()
	{
		// Formula for volume: (4/3)(pi)r^3
		return (4.0f / 3.0f) * (float)Math.PI * (float)Math.pow(getRadius(), 3);
	}
	
	public int render()
	{
	    return getMessageBox().show(toString(), "Sphere");
	}
	
	// Generate the textual representation of the sphere to be rendered.
	@Override
	public String toString()
	{
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setMaximumFractionDigits(2);
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Radius: ");
		builder.append(decimalFormat.format(getRadius()));
		builder.append('\n');
		
		builder.append("Surface Area: ");
		builder.append(decimalFormat.format(surfaceArea()));
		builder.append('\n');
		
		builder.append("Volume: ");
		builder.append(decimalFormat.format(volume()));
		
		return builder.toString();
	}
}
