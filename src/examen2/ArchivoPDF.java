/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Omar
 */
public class ArchivoPDF {
    
    ArchivoPDF() throws FileNotFoundException, DocumentException {
        
        Document documento = new Document();
        FileOutputStream ficheroPdf = new FileOutputStream("C:\\Users\\Omar\\Desktop\\horoscopos\\examen2.pdf");
        PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);
        documento.open();
        
        String parrafo = new Archivos().Leer();

        Paragraph p = new Paragraph(parrafo);
        documento.add(p);
        
        documento.close();
        
    }
    
}
