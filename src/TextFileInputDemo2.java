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

public class TextFileInputDemo2 {
    public static void main(String[] args)
    {
        /* System.out.println("Enter file name:");
        Scanner keyboard = new Scanner(System.in);*/
        
        try
        {
            BufferedReader inputStream = new BufferedReader(new FileReader("C:/Users/KostasA/Desktop/data.txt"));
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
            System.out.println("File data.txt wat not found");
            System.out.println("or could not be opened");
        }
        catch (IOException e)
        {
            System.out.println("Error reading from file data.txt.");
        }        
    }
}
    

