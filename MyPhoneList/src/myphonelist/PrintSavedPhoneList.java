/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonelist;

import java.io.BufferedReader;   //imported the BufferredReader
import java.io.File;              
import java.io.FileInputStream;     // imported FileInputStream
import java.io.InputStreamReader;

/**
 *
 * @author TEBALELO MADUMETSA
 */
public class PrintSavedPhoneList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String strLine;
        BufferedReader brReader = null;
    InputStreamReader isrReader = null;
    
    try
    {
        File file = new File("Details.txt");
        FileInputStream fisFin = new FileInputStream(file);
        isrReader = new InputStreamReader(fisFin);          //READS THE DATA IN THE DETAILS TEXTFILE. 
        brReader = new BufferedReader(isrReader);

        while((strLine = brReader.readLine()) != null)
        {    
            System.out.println(strLine);
        } 
       
        brReader.close();
        isrReader.close();
        fisFin.close();           
    }
    catch(Exception EX)
    {              
        
    }
    }
    
}
