/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myphonelist;

import java.io.File;        
import java.io.FileWriter;    
import java.io.IOException;     
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TEBALELO MADUMETSA
 */
public class MyPhoneList {

    /**
     * @param args the command line arguments
     */
    
    // DECLARED VARIABLES
   static String strfirstname, strlastname, intPhoneNumber;    
   
   
    
    public static void main(String[] args) {
       try {
           
           
           Scanner sc = new Scanner(System.in);
           
           // CREATED A FILE 
           File file = new File("Details.txt");       
           file.createNewFile();
           
            // CREATED A FILEWRITER
           FileWriter bw = new FileWriter(file, true);
           System.out.println("Enter your first name");
           strfirstname = sc.nextLine();
           
           System.out.println("Enter your last name");
           strlastname = sc.nextLine();
           
           System.out.println("Enter your Phone number");
           intPhoneNumber = sc.nextLine();
           
           System.out.println("Hello " + strfirstname + " " +strlastname);
           System.out.println("Your contact: " + intPhoneNumber);
           
           bw.write(strfirstname + " " + strlastname + " " +intPhoneNumber);
           bw.close();
           
       } catch (IOException ex) {
           Logger.getLogger(MyPhoneList.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
    
}
