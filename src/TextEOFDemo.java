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
import java.util.*;

public class TextEOFDemo {
    public static void main (String[] args)
    {
        try
        {
            BufferedReader inputStream = new BufferedReader(new FileReader("story.txt"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("storyline.txt"));
            int count = 0;
            String line = inputStream.readLine();
            while (line!=null)
            {
                count++;
                outputStream.println(count + " " + line);
                line = inputStream.readLine();
            }
            inputStream.close();
            outputStream.close();;
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File opening problem");
        }
        catch (IOException e)
        {
            System.out.println("Error reading from file story.txt.");
        }
        
    }
    
}
