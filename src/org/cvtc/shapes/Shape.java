package org.cvtc.shapes;

/**
 * Shape abstract base object.  All shapes are children of this class.
 * @author Andrew Kersten
 */
public abstract class Shape
{
    private IDialog messageBox;
    
    protected IDialog getMessageBox()
    {
        return messageBox;
    }
    
    private void setMessageBox(IDialog messageBox)
    {
        this.messageBox = messageBox;
    }
    
    public Shape(IDialog messageBox)
    {
        setMessageBox(messageBox);
    }
    
	/**
	 * Returns a float representing the surface area of the shape.
	 * @return the surface area of the shape
	 */
	public abstract float surfaceArea();
	
	/**
	 * Returns a float representing the volume of the shape.
	 * @return the volume of the shape
	 */
	public abstract float volume();
}
