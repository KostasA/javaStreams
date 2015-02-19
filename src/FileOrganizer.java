/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KostasA
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileOrganizer extends JFrame implements ActionListener
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    public static final int NUMBER_OF_CHAR = 30;
    
    private JTextField fileNameField;
    private JTextField firstLineField;
    
    public static void main (String[] args)
    {
        FileOrganizer gui = new FileOrganizer();
        gui.setVisible(true);
    }
    
}
