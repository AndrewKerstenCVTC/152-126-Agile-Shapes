package org.cvtc.shapes;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Sphere extends Shape
{
    private float radius;
	
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
	
	public Sphere(float radius)
	{
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
		
		builder.append("Surface Area: ");
		builder.append(decimalFormat.format(surfaceArea()));
		builder.append('\n');
		
		builder.append("Volume: ");
		builder.append(decimalFormat.format(volume()));
		
		return builder.toString();
	}
}
