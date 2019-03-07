/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Omar
 */
public class Ventana {
    
    static JComboBox cbHoroscopos;
    static JButton btnRealizar, btnPDF;
    static JLabel lblRes;
    
    Ventana() {
        
        Componentes c = new Componentes();
        
        JFrame f = new JFrame();
        
        f.setSize(300, 300);
        f.setTitle("Mi Ventana");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(4, 4, 8, 4));
        
        cbHoroscopos = new JComboBox();
        cbHoroscopos.addItem("Aries");
        cbHoroscopos.addItem("Tauro");
        cbHoroscopos.addItem("Geminis");
        cbHoroscopos.addItem("Cancer");
        cbHoroscopos.addItem("Leo");
        cbHoroscopos.addItem("Virgo");
        cbHoroscopos.addItem("Libra");
        cbHoroscopos.addItem("Escorpio");
        cbHoroscopos.addItem("Sagitario");
        cbHoroscopos.addItem("Capricornio");
        cbHoroscopos.addItem("Acuario");
        cbHoroscopos.addItem("Piscis");
        
        f.add(cbHoroscopos);
        
        lblRes = c.getLabel("Resultado");
        f.add(lblRes);
        
        btnRealizar = c.getButton("Realizar");
        btnRealizar.addActionListener(new Eventos());
        
        btnPDF = c.getButton("Generar PDF");
        btnPDF.addActionListener(new Eventos());
        
        f.add(btnRealizar);
        f.add(btnPDF);
        
        f.setVisible(true);
        
    }
    
}
