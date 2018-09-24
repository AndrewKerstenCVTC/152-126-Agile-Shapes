package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class MessageBox implements IDialog
{
    public MessageBox()
    {
    }
    
    @Override
    public int show(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        return JOptionPane.OK_OPTION;
    }
}
