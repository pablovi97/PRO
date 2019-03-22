/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaClase;

import dosier6.*;
import java.util.HashSet;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 *
 *
 */



class Libro {

    HashSet<String> autores;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "autores=" + autores + ", titulo=" + titulo + ", resumen=" + resumen + ", paginas=" + paginas + '}';
    }

    public Libro(String titulo, String resumen, int paginas, String... autores) {
        this.autores = new HashSet<String>();
        this.titulo = titulo;
        this.resumen = resumen;
        this.paginas = paginas;

        if (autores == null) {
            this.autores.add("anonimo");
        } else {
            for (String autor : autores) {
                this.autores.add(autor);

            }
        }
    }
    String titulo;
    String resumen;
    int paginas;

    boolean libroGrande() {
        return this.paginas > 500;
    }
}

class VolumenLibro extends Libro {

    enum EstadoConservacion {
        BUENO,
        REGULAR,
        MALO

    }

    public VolumenLibro( String propietario , String titulo, String resumen, int paginas, String... autores) {
        super(titulo, resumen, paginas, autores);
        estado = EstadoConservacion.BUENO;
        this.propietario =propietario;
        id = ++contador;
      variosTomos = super.libroGrande();
        
    }
    EstadoConservacion estado;
   private static  int contador;
   private int id;
    String propietario;
    boolean variosTomos ;
    
    public String toString(){
        return "propietario    "+propietario + "   id " + id + "    estado conservacion   " + estado +"   " + super.toString();
    }

}

public class LibroP9 {
    /*
    Práctica 9: Crear la clase Libro con atributos String []autor, String titulo, String resumen,
int paginas aparte de getter y setter un método boolean libroGrande() que comprueba que el
número de páginas es mayor de 500. Crear VolumenLibro que hereda de Libro y tiene
adicionalmente String propietario, estadoConservacion que será un enum: bueno, regular,
malo y un id de tipo entero. Sobreescribir el toString() en ambas clases . VolumenLibro
también tiene un atributo boolean variosTomos que está a true si el libro es de más de
500páginas
     */
    
   
    public static void main(String[] args) {
            VolumenLibro vl= new VolumenLibro("pepe","la casa","va un tio y se arrisca",300,"pep","juan","pedro","luis");
           System.out.println(vl);
           System.out.println(vl.libroGrande());
    }
    

}
