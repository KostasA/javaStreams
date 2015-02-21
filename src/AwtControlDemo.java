/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KostasA
 */
//http://www.tutorialspoint.com/awt/awt_event_handling.htm

import java.awt.*;
import java.awt.event.*;

public class AwtControlDemo
{
    private Frame mainFrame;
    private Label headerLabel;
    private Panel controlPanel;
    
    public AwtControlDemo()
    {
        prepareGUI();
    }
    
    public static void main(String[] args)
    {
        AwtControlDemo awtControlDemo = new AwtControlDemo();
        awtControlDemo.showEventDemo();
    }
    
    private void prepareGUI()
    {
        mainFrame = new Frame("Java AWT Examples"); 
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        headerLabel = new Label("ttt");
        headerLabel.setAlignment(Label.CENTER);
        //controlPanel = new Panel();
        //controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        //mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
        
    }
    
    private void showEventDemo()
    {
        
    }
            
    
    
    
    
}
