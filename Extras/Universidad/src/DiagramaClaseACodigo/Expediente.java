/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Expediente {
//    Estudiante estudiante;
    String expediente;

    public Expediente(String expediente) throws Exception {
        this.expediente = expediente;
        if (!this.validarExpediente()) {
           throw new Exception("Expediente no valido.");
        }
    }
    
    
    public boolean validarExpediente(){
        return expediente.matches("[A-Z][0-9]{3}-[0-9]{3}");
    }
    
    public static boolean validadorExpediente(String expediente){
        return expediente.matches("[A-Z][0-9]{3}-[0-9]{3}");
    }

    @Override
    public String toString() {
        return " expediente=" + expediente + ' ';
    }
    
}
