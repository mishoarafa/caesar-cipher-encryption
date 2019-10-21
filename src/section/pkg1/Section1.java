/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section.pkg1;

import java.util.Scanner;

/**
 *
 * @author Arafa
 */
public class Section1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public static String encrypt(String plainText, int key){            //voice   ->  3
        String encryptedText = "";                                      
        for (int i = 0; i < plainText.length(); i++){                   
            encryptedText += ((char) (key + plainText.charAt(i)));      //yrlfh
        }
        return encryptedText;                                           //"yrlfh"
    }
    
    public static String decrypt(String ciphertext, int key){    //y
        String plaintext = "";
        for (int i = 0; i < ciphertext.length(); i++){
            plaintext += ((char) (ciphertext.charAt(i) - key));   //v
        }
        return plaintext;
    }
}