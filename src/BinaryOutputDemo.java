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

public class BinaryOutputDemo
{
    
    public static void main(String[] args)
    {
        try
        {
            ObjectOutputStream outputStream = new ObjectOutputStream (new FileOutputStream("numbers.dat"));
            
            int n;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter nonneggative integers.");
            System.out.println("Place a negative number at the end.");
            
            do
            {
                n = keyboard.nextInt();
                outputStream.writeInt(n);
            } while(n>=0);
            
            System.out.println("Numbers and sentinel value");
            System.out.println("written to the file numbers.dat");
            
            
            
            outputStream.close();
        }
        catch (IOException e)
        {
            System.out.println("Problem with output to file numbers.dat.");
        }
        
    }
    
}
