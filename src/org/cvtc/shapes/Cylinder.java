package org.cvtc.shapes;

import java.text.DecimalFormat;

/**
 * Cylinder representation.  Child of Shape.
 * @author Andrew Kersten
 */
public class Cylinder extends Shape implements IRenderer
{
    
	/**
	 * The radius of the cylinder.
	 */
	private float radius;
	
	/**
	 *  The height of the cylinder.
	 */
	private float height;

	/**
	 * Get the radius of the cylinder.  Guaranteed to be greater than or equal to zero.
	 * @return the radius of the cylinder
	 */
	public float getRadius()
    {
        return radius;
    }

	/**
	 * Set the radius of the cylinder.  Radius must not be less than zero.
	 * @param radius the radius of the cylinder
	 * @throws IllegalArgumentException if height is less than zero
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
     * Get the height of the cylinder.  Guaranteed to be greater than or equal to zero.
     * @return the height of the cylinder
     */
    public float getHeight()
    {
        return height;
    }

    /**
     * Set the height of the cylinder.  Height must not be less than zero.
     * @param height the height of the cylinder
     * @throws IllegalArgumentException if height is less than zero
     */
    private void setHeight(float height)
    {
        if (height < 0)
        {
            throw new IllegalArgumentException("Height cannot be less than zero.");
        }
        
        this.height = height;
    }
    
    public Cylinder(IDialog messageBox)
    {
        super(messageBox);
        
        setRadius(0);
        setHeight(0);
    }
    
    /**
     * Initialize a cylinder with radius radius and height height.
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     */
    public Cylinder(IDialog messageBox, float radius, float height)
    {
        super(messageBox);
        
        setRadius(radius);
        setHeight(height);
    }
    
    @Override
    public float surfaceArea()
    {
        // Formula for surface area: 2(pi)rh + 2(pi)r^2
        float endsSurfaceArea = 2.0f * (float)Math.PI * (float)Math.pow(getRadius(), 2);
        float sideSurfaceArea = 2.0f * (float)Math.PI * getRadius() * getHeight();
        
        return endsSurfaceArea + sideSurfaceArea;
    }

    @Override
	public float volume()
	{
		// Formula for volume: (pi)r^2h
        return (float)Math.PI * (float)Math.pow(getRadius(), 2) * getHeight();
	}
    
    public int render()
    {
        return getMessageBox().show(toString(), "Cylinder");
    }
	
	// Generate the textual representation of the cylinder to be rendered.
	@Override
    public String toString()
    {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        
        StringBuilder builder = new StringBuilder();
        
        builder.append("Radius: ");
        builder.append(decimalFormat.format(getRadius()));
        builder.append('\n');
        
        builder.append("Height: ");
        builder.append(decimalFormat.format(getHeight()));
        builder.append('\n');
        
        builder.append("Surface Area: ");
        builder.append(decimalFormat.format(surfaceArea()));
        builder.append('\n');
        
        builder.append("Volume: ");
        builder.append(decimalFormat.format(volume()));
        
        return builder.toString();
    }
}
