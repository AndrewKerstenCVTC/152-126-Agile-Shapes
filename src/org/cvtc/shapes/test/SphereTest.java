package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest
{

    @Test
    public void testSurfaceArea()
    {
        Sphere sphere0 = new Sphere(new MessageBoxSub(), 1);
        assertEquals(12.57, sphere0.surfaceArea(), 0.1);
        
        Sphere sphere1 = new Sphere(new MessageBoxSub(), 3);
        assertEquals(113.1, sphere1.surfaceArea(), 0.1);
        
        Sphere sphere2 = new Sphere(new MessageBoxSub(), 5);
        assertEquals(314.16, sphere2.surfaceArea(), 0.1);
    }

    @Test
    public void testVolume()
    {
        Sphere sphere0 = new Sphere(new MessageBoxSub(), 1);
        assertEquals(4.19, sphere0.volume(), 0.1);
        
        Sphere sphere1 = new Sphere(new MessageBoxSub(), 3);
        assertEquals(113.1, sphere1.volume(), 0.1);
        
        Sphere sphere2 = new Sphere(new MessageBoxSub(), 5);
        assertEquals(523.6, sphere2.volume(), 0.1);
    }

    @Test
    public void testGetRadius()
    {
        Sphere sphere = new Sphere(new MessageBoxSub(), 5);
        assertEquals(5.0, sphere.getRadius(), 0.1);
    }

    @Test(expected = IllegalArgumentException.class) 
    public void testSphere()
    {
        Sphere sphere = new Sphere(new MessageBoxSub(), -1);
    }
    
    @Test
    public void testRender()
    {
        Sphere sphere0 = new Sphere(new MessageBoxSub(), 1);
        assertEquals(JOptionPane.OK_OPTION, sphere0.render());
    }

}
