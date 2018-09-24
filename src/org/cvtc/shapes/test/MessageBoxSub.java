package org.cvtc.shapes.test;

import javax.swing.JOptionPane;

import org.cvtc.shapes.IDialog;

public class MessageBoxSub implements IDialog
{
    public MessageBoxSub()
    {
    }
    
    @Override
    public int show(String message, String title)
    {
        return JOptionPane.OK_OPTION;
    }
}
