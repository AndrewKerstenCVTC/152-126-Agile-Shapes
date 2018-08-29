package org.cvtc.shapes;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Cylinder extends Shape
{
	private float radius;
	private float height;

	public float getRadius()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        if (radius < 0)
        {
            throw new IllegalArgumentException("Radius cannot be less than zero.");
        }
        
        this.radius = radius;
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float height)
    {
        if (height < 0)
        {
            throw new IllegalArgumentException("Height cannot be less than zero.");
        }
        
        this.height = height;
    }
    
    public Cylinder(float radius, float height)
    {
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

	@Override
	public void render()
	{
	    JOptionPane.showMessageDialog(null, toString());
	}
	
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
