package org.cvtc.shapes;

public class ShapeFactory
{
    private IDialog dialog;
    
    public ShapeFactory(IDialog dialog)
    {
        setDialog(dialog);
    }

    private IDialog getDialog()
    {
        return dialog;
    }

    private void setDialog(IDialog dialog)
    {
        this.dialog = dialog;
    }
    
    public Shape make(ShapeType type)
    {
        switch (type)
        {
            case SPHERE:
            {
                return new Sphere(getDialog());
            }
            case CYLINDER:
            {
                return new Cylinder(getDialog());
            }
            case CUBOID:
            {
                return new Cuboid(getDialog());
            }
            default:
            {
                throw new IllegalArgumentException();
            }
        }
    }
}
