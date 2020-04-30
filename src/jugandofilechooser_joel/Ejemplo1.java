/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugandofilechooser_joel;

import javax.swing.JFileChooser;

/**
 *
 * @author Joel
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser selectorFicheros = new JFileChooser("C:\\Users\\Joel\\Downloads");
String aux = "Dale Carla";
//        selectorFicheros.showOpenDialog(null);
//        selectorFicheros.showSaveDialog(null);
         selectorFicheros.showDialog(null, aux);
    }
    // invoca con showSaveDialog
    // invoca con showDialog
}
