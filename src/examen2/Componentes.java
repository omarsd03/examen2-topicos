/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Omar
 */
public class Componentes {
    
    public JButton getButton(String titulo) {
        JButton b = new JButton(titulo);
        // b.setText(titulo);
        return b;
    }
    
    public JLabel getLabel(String titulo) {
        JLabel e = new JLabel(titulo);
        return e;
    }
    
}
