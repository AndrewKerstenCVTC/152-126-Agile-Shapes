package org.cvtc.shapes.test;

import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.junit.Test;

public class ShapeFactoryTest
{

    @Test
    public void testShapeFactory()
    {
        ShapeFactory factory = new ShapeFactory(new MessageBoxSub());
    }

    @Test
    public void testMake()
    {
        ShapeFactory factory = new ShapeFactory(new MessageBoxSub());
        
        factory.make(ShapeType.SPHERE);
        factory.make(ShapeType.CYLINDER);
        factory.make(ShapeType.CUBOID);
    }

}
