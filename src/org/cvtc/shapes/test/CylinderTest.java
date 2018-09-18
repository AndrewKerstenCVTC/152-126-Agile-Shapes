package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;

public class CylinderTest
{

    @Test
    public void testSurfaceArea()
    {
        Cylinder cylinder0 = new Cylinder(1, 1);
        assertEquals(12.57, cylinder0.surfaceArea(), 0.1);
        
        Cylinder cylinder1 = new Cylinder(2, 2);
        assertEquals(50.27, cylinder1.surfaceArea(), 0.1);
        
        Cylinder cylinder2 = new Cylinder(3, 3);
        assertEquals(113.1, cylinder2.surfaceArea(), 0.1);
    }

    @Test
    public void testVolume()
    {
        Cylinder cylinder0 = new Cylinder(1, 1);
        assertEquals(3.14, cylinder0.volume(), 0.1);
        
        Cylinder cylinder1 = new Cylinder(2, 2);
        assertEquals(25.13, cylinder1.volume(), 0.1);
        
        Cylinder cylinder2 = new Cylinder(3, 3);
        assertEquals(84.82, cylinder2.volume(), 0.1);
    }

    @Test
    public void testGetRadius()
    {
        Cylinder cylinder0 = new Cylinder(1, 2);
        assertEquals(1, cylinder0.getRadius(), 0.1);
    }

    @Test
    public void testGetHeight()
    {
        Cylinder cylinder0 = new Cylinder(1, 2);
        assertEquals(2, cylinder0.getHeight(), 0.1);
    }

    @Test(expected = IllegalArgumentException.class) 
    public void testCylinder()
    {
        Cylinder cylinder2 = new Cylinder(-1, -1);
    }

}
