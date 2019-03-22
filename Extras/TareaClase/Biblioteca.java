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
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Biblioteca {

    /*
    Basándose en la actividad descrita en la práctica9 del dossier Se realizará una clase Biblioteca
    La clase biblioteca debe tener como mínimo un constructor que reciba una String que será el nombre de la biblioteca
    Como biblioteca que es tiene un conjunto de volumenes de libros biblioteca ( clase VolumenLibroBiblio. Lo lógico es que esta clase herede de VolumenLibro )
    ( observar que en esta ocasión el atributo propietario coincidirá con el nombre de la biblioteca y que será necesario un atributo préstamo que estará a null si no está en préstamo o 
    tendrá el nombre de una persona para identificar a quién se le ha prestado )
    Para dar con la estructura apropiada para mantener el conjunto de VolumenLibroBiblio pensar que se va a buscar por título y se obtendrá una estructura de VolumenLibroBiblio 
    de los que tienen el mismo título
    Se debe crear un método llamado: prestar() que se le pasa un VolumenLibroBiblio y el nombre de la persona que lo va a tener en préstamo. Observar que si el volumen ya
    está prestado esta operación no se realizará y devolverá false avisando de que no fue posible el préstamo
    Crear un método llamado: devolver() que recibe un VolumenLibroBiblio y hace que ya quede liberado y prestable para otro usuario ( el atributo con el nombre del que 
    tenía el préstamo vuelve a ser null )
    crear un método llamado agregarLibro() para agregar un VolumenLibroBiblio a nuestra biblioteca
    Hacer una clase llamada Main  que va a tener el main() del programa
    Este main() tendrá un menú para:
    - agregar un libro a la biblioteca
    - buscar los volumenes para un título
    Esa última opción nos dejará elegir entre los diferentes volumenes para poder prestar o devolver un volumen
     */
    public Biblioteca(String nombreBinlio) {
        this.nombreBiblio = nombreBiblio;
    }
    protected HashMap<String, ArrayList< VolumenLibro>> libros;
    protected ArrayList<String> VolumenLibro = new ArrayList<>();
    String nombreBiblio;
    String prestamo = null;

    public void agregarLibro(String titulo, String resumen, int paginas, String... autores) {
        String nombrebiblio = this.nombreBiblio;

        volumenLibroBiblio vl = new volumenLibroBiblio(nombrebiblio, titulo, resumen, paginas, autores);
        ArrayList<VolumenLibro> subarray = libros.get(titulo);

        subarray = new ArrayList<>();
        subarray.add(vl);
        libros.put(titulo, subarray);

    }

    public void Buscarvolumenes(String titulo) {

        for (ArrayList<VolumenLibro> valor : libros.values()) {
            for (VolumenLibro arr : valor) {
                if (arr.titulo == titulo) {
                    System.out.println(arr.titulo + " , " + arr.autores + " ," + arr.resumen);
                }
            }
        }
    }

    public void listado() {

        for (ArrayList<VolumenLibro> valor : libros.values()) {
            for (VolumenLibro arr : valor) {

                System.out.println(arr.titulo + " , " + arr.autores + " ," + arr.resumen);

            }
        }
    }

    public boolean prestar(String nomprestamo, String titulo, String resumen, int paginas, String... autores) {
        String nombrebiblio = this.nombreBiblio;

        boolean resultado = false;
        volumenLibroBiblio vl = new volumenLibroBiblio(nombrebiblio, titulo, resumen, paginas, autores);

        if (prestamo == null) {
            ArrayList<VolumenLibro> subarray = libros.get(nomprestamo);
            subarray = new ArrayList<VolumenLibro>();
            prestamo = nomprestamo;

            subarray.add(vl);
            libros.put(titulo, subarray);
            resultado = true;
        } else {
            resultado = false; 
        }

        return resultado;
    }

    public static void main(String[] args) {
        Biblioteca bc = new Biblioteca("la vera");
        bc.agregarLibro("la bruja", "viene una señora y se cae por un pozo", 45, "erenesto ", "pepe");
        bc.agregarLibro("la bujia", "viene una señora por un pozo", 43, "eren ", "pep");

        bc.listado();
    }
}

class volumenLibroBiblio extends VolumenLibro {

    public volumenLibroBiblio(String propietario, String titulo, String resumen, int paginas, String... autores) {

        super(propietario, titulo, resumen, paginas, autores);
    }

}
