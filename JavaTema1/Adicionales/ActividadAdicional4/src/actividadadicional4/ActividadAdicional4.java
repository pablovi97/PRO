/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadadicional4;

/**
 *
 * @author Pablo Viera Martin .
 */
public class ActividadAdicional4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tabla = 1;

        for (tabla = 1; tabla < 11; tabla++) {
            System.out.println("");
            System.out.println("TABLA DEL" + tabla);
            
            for (int i = 1; i < 11; i++) {
                System.out.println("tabla del " + tabla + " x " + i + " = " + (i *tabla));
            }
        }

    }

}
