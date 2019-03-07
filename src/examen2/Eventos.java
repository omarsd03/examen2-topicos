/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import com.itextpdf.text.DocumentException;
import static examen2.Ventana.btnPDF;
import static examen2.Ventana.btnRealizar;
import static examen2.Ventana.cbHoroscopos;
import static examen2.Ventana.lblRes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar
 */
public class Eventos implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(btnRealizar)) {
            
            String c = (String) cbHoroscopos.getSelectedItem();
            System.out.println(c);
            
            try {
                new Archivos().Escribir(new Datos().Guardar());
            } catch (IOException ex) {
                Logger.getLogger(Eventos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (c.equals("Cancer") || c.equals("Piscis") || c.equals("Escorpio")) {
                //System.out.println("Es un signo de Agua");
                lblRes.setText("Es un signo de Agua");
            }
            
            if (c.equals("Aries") || c.equals("Leo") || c.equals("Sagitario") ) {
                //System.out.println("Es un signo de Fuego");
                lblRes.setText("Es un signo de Fuego");
            }
            
            if (c.equals("Tauro") || c.equals("Virgo") || c.equals("Capricornio") ) {
                //System.out.println("Es un signo de Tierra");
                lblRes.setText("Es un signo de Tierra");
            }
            
            if (c.equals("Geminis") || c.equals("Libra") || c.equals("Acuario") ) {
                //System.out.println("Es un signo de Aire");
                lblRes.setText("Es un signo de Aire");
            }
            
        }
        
        if (e.getSource().equals(btnPDF)) {
            
            try {
                new ArchivoPDF();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Eventos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(Eventos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}
