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
public class Dni {

    String dni;
    private final static String LETRAS_POSIBLES = "TRWAGMYFPDXBNJZSQVHLCKE";

    public Dni(String dni) throws Exception {
        this.dni = dni;
        if (!this.validar()) {
            throw new Exception("DNI no valido.");
        }

    }
    
    public boolean validar() throws Exception {
        {
            boolean resultado = false;
            if (dni.length() != 9) {
                throw new Exception("No es un dni.");
            } else {
                int num = Integer.parseInt(dni.substring(0, dni.length() - 1));
                int posicion = num % 23;
                char letra = dni.toUpperCase().charAt(dni.length() - 1);
                if (letra < 'A' || letra > 'Z') {
                    throw new Exception("El último caracter no es una letra.");
                }
                resultado = letra == LETRAS_POSIBLES.charAt(posicion);
            }
            return resultado;
        }
    }

    @Override
    public String toString() {
        return " dni=" + dni + ' ';
    }
    
    

}
