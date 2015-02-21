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
    
    public FileOrganizer()
    {
        setSize(WIDTH,HEIGHT);
        //WindowDestroyer listener = new WindowDestroyer();
        //addWindowListener(listener);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        JButton showButton = new JButton("Show first line");
        showButton.addActionListener(this);
        contentPane.add(showButton);
        
        JButton removeButton = new JButton("Remove file");
        removeButton.addActionListener(this);
        contentPane.add(removeButton);
        
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(this);;
        contentPane.add(resetButton);
        
        fileNameField = new JTextField(NUMBER_OF_CHAR);
        contentPane.add(fileNameField);
        fileNameField.setText("Enter the file name here.");
        
        firstLineField = new JTextField(NUMBER_OF_CHAR);
        contentPane.add(firstLineField);        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand();
        
        if (actionCommand.equals("Show first line"))
            showFirstLine();
        else if (actionCommand.equals("Remove file"))
            removeFile();
        else if (actionCommand.equals("Reset"))
        {
            fileNameField.setText("Enter file name here.");
            firstLineField.setText("");
        }
        else
            firstLineField.setText("Unexpected error");
    }
    
    public void showFirstLine()
    {
        BufferedReader fileInput;
        String firstLine;
        String fileName = fileNameField.getText();
        File fileObject = new File(fileName);
        
        if ( ! fileObject.exists())
            firstLineField.setText("No such file");
        else if ( ! fileObject.canRead())
            firstLineField.setText("That file is not readable.");
        else
        {
            try
            {
                fileInput = new BufferedReader(new FileReader(fileObject));
                firstLine = fileInput.readLine();
                firstLineField.setText(firstLine);
                fileInput.close();
            }
            catch (IOException e)
            {
                firstLineField.setText("Problem reading from file.");
            }
        }
    }
    
    public void removeFile()
    {
        BufferedReader fileInput;
        String firstLine;
        String fileName = fileNameField.getText();
        File fileObject = new File(fileName);
        
        if ( ! fileObject.exists())
            firstLineField.setText("No such file");
        else if ( ! fileObject.canWrite())
            firstLineField.setText("Permission denied.");
        else
        {
            if (fileObject.delete())
                firstLineField.setText("File deleted.");
            else
                firstLineField.setText("Could not delete file.");
        }
    }
    
            
    
}
