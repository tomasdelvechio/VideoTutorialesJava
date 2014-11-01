/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerPrograma;

import java.util.StringTokenizer;

/**
 *
 * @author tomas
 */
public class Tokenizator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("This is a sentence.  This is a question, right?  Yes!  It is.", " .?!,");
        while (tokenizer.hasMoreTokens()) {
            String term = tokenizer.nextToken();
            System.out.println(term);
        }
    }
}
