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
public class TrecParsing {
    
    public static void main(String[] args) {
        // Tags importantes
        String startDocTag = "<DOC>";
        String endDocTag = "</DOC>";
        String startDocIdTag = "<DOCNO>";
        String endDocIdTag = "</DOCNO>";
        
        // Documento
        String line = "<DOC><DOCNO>1255235</DOCNO>perro casa, \ntermo futbol dia</DOC>";
        
        // Obtener DocId
        int startDocIdIdx = line.indexOf(startDocIdTag) + startDocIdTag.length();
        int endDocIdIdx = line.indexOf(endDocIdTag);
        String docId = line.substring(startDocIdIdx, endDocIdIdx);
        
        System.out.println(startDocIdIdx);
        System.out.println(endDocIdIdx);
        System.out.println(docId);
        
        // Recuperar contenido del Documento
        int startDocContentIdx = line.indexOf(endDocIdTag) + endDocIdTag.length();
        int endDocContentIdx = line.indexOf(endDocTag);
        String docContent = line.substring(startDocContentIdx, endDocContentIdx);
        
        System.out.println(startDocContentIdx);
        System.out.println(endDocContentIdx);
        System.out.println(docContent);
    }
}
