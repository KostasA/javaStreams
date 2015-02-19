/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KostasA
 */

import java.io.*;

public class TextFileObjectOutputDemo {
    
    public static void main (String[] args)
    {
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(new FileOutputStream("species.records"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening species.records.");
            System.exit(0);
        }
        
        Species oneRecord = new Species ("Calif. Condor", 27, 0.02);
        outputStream.println(oneRecord.toString());
        outputStream.println();
        outputStream.println(oneRecord);
        outputStream.close();
        System.out.println("End of Program.");
    }
    
}
