/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import static examen2.Ventana.cbHoroscopos;

/**
 *
 * @author Omar
 */
public class Datos {
    
    public String Guardar() {
        String auxiliar = (String) cbHoroscopos.getSelectedItem();
        return auxiliar;
    }
    
}
