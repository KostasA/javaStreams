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

public class TextFileInputDemo {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader inputStream = new BufferedReader(new FileReader("data.txt"));
            String line = null;
            line = inputStream.readLine();
            System.out.println("The first line in data.txt is: ");
            System.out.println(line);

            line = inputStream.readLine();
            System.out.println("The second line in data.txt is: ");
            System.out.println(line);
            inputStream.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File data.txt wat nnot found");
            System.out.println("or could not be opoened");
        }
        catch (IOException e)
        {
            System.out.println("Error reading from file data.txt.");
        }
        
    }
    
    
}
