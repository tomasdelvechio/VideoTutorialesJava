/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerPrograma;

/**
 *
 * @author tomas
 */
public class SplitString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "This is a sentence.  This is a question, right?  Yes!  It is.";
        String delims = "[ .,?!]+";
        String[] tokens = str.split(delims);
        int i;
        
        for (i = 0; i < tokens.length; i++) {
            Object next = tokens[i];
            System.out.println(next);
        }
    }
}
