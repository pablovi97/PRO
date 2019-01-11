/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema4;

/**
 *
 * @author pablo
 */
public class Factura {
    /*
    Práctica 17: Crear una clase Factura que tenga como mínimo los atributos: double total,
String detalle y los métodos agregar(String articuloConsumido, double precio) e imprimir()
así como un constructor de copia
agregar() permite añadir al String detalle el nombre del artículo que se ha consumido y el
precio de ese artículo a la vez que añade al total el precio.
imprimir() devuelve un String que muestra los artículos consumidos y el precio de cada uno
de ellos así como el total de la factura
    */

    public Factura(double total, String detalle) {
        this.total = total;
        this.detalle = detalle;
    }
    
    double total;
    String detalle;
    public void agregar (String articulo ,double precio){
        
       this.detalle += " y "+ articulo;
       this.total += precio;
    }
    public String imprimir(){
        return "el precio de " +this.detalle +" tiene un total de  "+ this.total +"€";
        
    }
   /* Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema*/
    @Override
    public String toString (){
        String mensaje = "el producto es"+ detalle+ " con precio ";
        return mensaje;
    }
    public static void main(String[] args) {
        Factura fc = new Factura(10.50 ,"cocacola");
        fc.agregar("pastel",5.70);
        System.out.println(fc.imprimir());
        
        
    }
    
    
    
}
