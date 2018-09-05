package org.cvtc.shapes;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Cuboid representation.  Child of Shape.
 * @author Andrew Kersten
 */
public class Cuboid extends Shape
{
    /**
     * The width of the cuboid.
     */
    private float width;
    
    /**
     * The height of the cuboid.
     */
    private float height;
    
    /**
     * The depth of the cuboid.
     */
    private float depth;
    
    /**
     * Get the width of the cuboid.  Guaranteed to be greater than or equal to zero.
     * @return the width of the cuboid
     */
    public float getWidth()
    {
        return width;
    }

    /**
     * Set the width of the cuboid.  Must be greater than zero.
     * @param width the width of the cuboid
     * @throws IllegalArgumentException if width is less than zero
     */
    private void setWidth(float width)
    {
        if (width < 0)
        {
            throw new IllegalArgumentException("Width cannot be less than zero.");
        }
        
        this.width = width;
    }

    /**
     * Get the height of the cuboid.  Guaranteed to be greater than or equal to zero.
     * @return the height of the cuboid
     */
    public float getHeight()
    {
        return height;
    }
    
    /**
     * Set the height of the cuboid.  Must be greater than zero.
     * @param height the height of the cuboid
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

    /**
     * Get the depth of the cuboid.  Guaranteed to be greater than or equal to zero.
     * @return the depth of the cuboid
     */
    public float getDepth()
    {
        return depth;
    }

    /**
     * Set the depth of the cuboid.  Must be greater than zero.
     * @param depth the depth of the cuboid
     * @throws IllegalArgumentException if depth is less than zero
     */
    private void setDepth(float depth)
    {
        if (depth < 0)
        {
            throw new IllegalArgumentException("Depth cannot be less than zero.");
        }
        
        this.depth = depth;
    }
    
    /**
     * Initialize a cylinder with width width, height height, and depth depth.
     * @param width the width of the cylinder
     * @param height the height of the cylinder
     * @param depth the depth of the cylinder
     */
    public Cuboid(float width, float height, float depth)
    {
        setWidth(width);
        setHeight(height);
        setDepth(depth);
    }

    @Override
    public float surfaceArea()
    {
        // Formula surface area: 2(dw + dh + hw)
        return 2.0f * (getDepth() * getWidth() + getDepth() * getHeight() + getHeight() + getWidth());
    }

    @Override
    public float volume()
    {
        // Formula volume: whd
        return getWidth() * getHeight() * getDepth();
    }

    @Override
    public void render()
    {
        JOptionPane.showMessageDialog(null, toString());
    }
    
    // Generate the textual representation of the cuboid to be rendered.
    @Override
    public String toString()
    {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        
        StringBuilder builder = new StringBuilder();
        
        builder.append("Width: ");
        builder.append(decimalFormat.format(getWidth()));
        builder.append('\n');
        
        builder.append("Height: ");
        builder.append(decimalFormat.format(getHeight()));
        builder.append('\n');
        
        builder.append("Depth: ");
        builder.append(decimalFormat.format(getDepth()));
        builder.append('\n');
        
        builder.append("Surface Area: ");
        builder.append(decimalFormat.format(surfaceArea()));
        builder.append('\n');
        
        builder.append("Volume: ");
        builder.append(decimalFormat.format(volume()));
        
        return builder.toString();
    }
}
