/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaClase;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author pablo
 */
public class Biblioteca1 {
    String nombrebiblio;
    String prestamo = null;
    HashMap<String, ArrayList< VolumenLibroBiblio1>> libros;

    public Biblioteca1(String nombrebiblio) {
        this.nombrebiblio = nombrebiblio;
        libros = new HashMap<>();
    }
    
    // protected ArrayList<String> VolumenLibro = new ArrayList<>();


    public void agregarLibro(String titulo, String resumen, int paginas, String... autores) {

        String propietario = this.nombrebiblio;
       
        if (libros.get(titulo) == null) {

            libros.put(titulo, new ArrayList<>());

        }
        ArrayList<VolumenLibroBiblio1> substring = libros.get(titulo);

        substring.add(new VolumenLibroBiblio1(propietario, titulo, resumen, paginas, autores));
    }

    public void listarVolumen() {
        for (ArrayList<VolumenLibroBiblio1> arr : libros.values()) {
            for (VolumenLibroBiblio1 valor : arr) {
                System.out.println(valor.autores + " ," + valor.propietario + " ," + valor.titulo);
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca1 b1 = new Biblioteca1("la vera");
        b1.agregarLibro("pepe y su mano", "el libro trata de el amor de un hombre por su mano", 56, "pepe", "juan javier jimenez");
       b1.agregarLibro("pepe y la mano", "el libro trapor su mano", 76, "pep", "juan  jimenez");
        b1.listarVolumen();
    }

}

class VolumenLibroBiblio1 extends VolumenLibro {

    public VolumenLibroBiblio1(String propietario, String titulo, String resumen, int paginas, String... autores) {
        super(propietario, titulo, resumen, paginas, autores);
    }

}
