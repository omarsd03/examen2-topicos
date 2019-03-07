/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Archivos {
    
    File f = new File("C:\\Users\\Omar\\Desktop\\horoscopos\\examen2.txt");
    
    public void Escribir(String mensaje) throws IOException {
        
        try (FileWriter fw = new FileWriter(f, true)) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println(mensaje);
            fw.close();
        }
    
    }
    
    public String Leer() throws FileNotFoundException {
        
        Scanner s = new Scanner(f);
        String contador = "";
        
        while(s.hasNextLine()) {
            //System.out.println(s.nextLine());
            contador = contador + "\n" + s.nextLine();
        }
        
        return contador;
        
        //return s.nextLine();
        
    }
    
}
