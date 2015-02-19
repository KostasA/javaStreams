/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KostasA
 */

// Na ftiaksw to programma kai na ksanadimiourghsw to github
import java.io.*;
import java.util.*;

public class WordCounter
{
    
    public static void main (String[] args)
    {
        int count = 0;
        try
        {
            BufferedReader inputStream = new BufferedReader (new FileReader("C:/Users/KostasA/Desktop/data.txt"));
            String line = null;
            
            line = inputStream.readLine();
            StringTokenizer wordFinder = new StringTokenizer(line," \n.,");
            while (wordFinder.hasMoreTokens())
            {
                count++;
                System.out.println(wordFinder.nextToken());
            }
            
            System.out.println(count);
            /*while (line!=null)
            {
                line = inputStream.readLine();
                StringTokenizer wordFinder2 = new StringTokenizer(line,"\n.,");
                while (wordFinder2.hasMoreTokens())
                count++;
            }*/
            inputStream.close();
            System.out.println("The program ended successfully!");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File data.txt wat not found");
            System.out.println("or could not be opened");
        }
        catch (IOException e)
        {
            System.out.println("Error reading from file data.txt.");
        } 
        
    }
    
}
