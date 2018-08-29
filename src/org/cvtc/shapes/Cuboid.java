package org.cvtc.shapes;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Cuboid extends Shape
{
    private float width;
    private float height;
    private float depth;
    
    public float getWidth()
    {
        return width;
    }

    public void setWidth(float width)
    {
        if (width < 0)
        {
            throw new IllegalArgumentException("Width cannot be less than zero.");
        }
        
        this.width = width;
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

    public float getDepth()
    {
        return depth;
    }

    public void setDepth(float depth)
    {
        if (depth < 0)
        {
            throw new IllegalArgumentException("Depth cannot be less than zero.");
        }
        
        this.depth = depth;
    }
    
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
