package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.cvtc.shapes.Cuboid;
import org.junit.Test;

public class CuboidTest
{

    @Test
    public void testSurfaceArea()
    {
        Cuboid cuboid0 = new Cuboid(new MessageBoxSub(), 1, 2, 3);
        assertEquals(22, cuboid0.surfaceArea(), 0.1);
        
        Cuboid cuboid1 = new Cuboid(new MessageBoxSub(), 4, 5, 6);
        assertEquals(148, cuboid1.surfaceArea(), 0.1);
        
        Cuboid cuboid2 = new Cuboid(new MessageBoxSub(), 7, 8, 9);
        assertEquals(382, cuboid2.surfaceArea(), 0.1);
    }

    @Test
    public void testVolume()
    {
        Cuboid cuboid0 = new Cuboid(new MessageBoxSub(), 1, 2, 3);
        assertEquals(6, cuboid0.volume(), 0.1);
        
        Cuboid cuboid1 = new Cuboid(new MessageBoxSub(), 4, 5, 6);
        assertEquals(120, cuboid1.volume(), 0.1);
        
        Cuboid cuboid2 = new Cuboid(new MessageBoxSub(), 7, 8, 9);
        assertEquals(504, cuboid2.volume(), 0.1);
    }

    @Test
    public void testGetWidth()
    {
        Cuboid cuboid0 = new Cuboid(new MessageBoxSub(), 1, 2, 3);
        assertEquals(1, cuboid0.getWidth(), 0.1);
    }

    @Test
    public void testGetHeight()
    {
        Cuboid cuboid0 = new Cuboid(new MessageBoxSub(), 1, 2, 3);
        assertEquals(2, cuboid0.getHeight(), 0.1);
    }

    @Test
    public void testGetDepth()
    {
        Cuboid cuboid0 = new Cuboid(new MessageBoxSub(), 1, 2, 3);
        assertEquals(3, cuboid0.getDepth(), 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCuboid()
    {
        Cuboid cuboid0 = new Cuboid(new MessageBoxSub(), -1, -1, -1);
    }
    
    @Test
    public void testRender()
    {
        Cuboid cuboid0 = new Cuboid(new MessageBoxSub(), 1, 2, 3);
        assertEquals(JOptionPane.OK_OPTION, cuboid0.render());
    }

}
