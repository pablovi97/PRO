/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;


import java.util.HashSet;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Titulaciones {
    static HashSet<String> titulaciones = new HashSet<>();
    static void agregarTitulación(String titulacion){
        titulaciones.add(titulacion.toUpperCase());
    }
    
    static String mostrarTitulaciones(){
        String res = "Titulaciones Gobierno: \n";
        
        for (String titulacion : titulaciones) {
            res += titulacion+"\n";
        }
        return res;
    }

    @Override
    public String toString() {
        String resultado = "";
         
        for (String titulacion : titulaciones) {
            resultado += titulacion+"\n";
        }
        return resultado;
    }
}
