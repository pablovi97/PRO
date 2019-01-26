/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author pablo
 */
public class Telegrama {

    /*
    Práctica 21: Crear la clase Telegrama con atributos: String texto, String remitente, String
    receptor, double precioPalabra Deberá tener como mínimo un constructor. La longitud del
    atributo texto determina el coste del telegrama al multiplicarlo por precioPalabra. Deberá
    haber un método: double coste() y un método toString() que ponga una cabecera que diga
    quién es el remitente, a quién va dirigido y luego el texto del telegrama. Crear un programa
    que use la clase telegrama donde el usuario introduzca los datos de cada telegrama y estos
    queden insertados ordenados por coste en una lista. Se debe crear una nueva clase:
    ComparadorTelegrama que implemente Comparator para mantener la lista ordenada
     */
    public Telegrama(String texto, String remitente, String receptor, double precioPalabra) {
        this.texto = texto;
        this.remitente = remitente;
        this.receptor = receptor;
        this.precioPalabra = precioPalabra;
    }
    public Telegrama(){
        
    }
     public void introducirTelegrama(String texto, String remitente, String receptor, double precioPalabra) {
        this.texto = texto;
        this.remitente = remitente;
        this.receptor = receptor;
        this.precioPalabra = precioPalabra;
    }

  
  

    String texto;
    String remitente;
    String receptor;
    double precioPalabra;
    double cost;

    public double coste() {
        String text = this.texto;
        int numPalabras = text.split("\\s+|\n").length;
        
        this.cost =  precioPalabra * numPalabras;
        return this.cost;
    }

    @Override
    public String toString() {
        return "el remitente de esta carta es " + remitente + " que va dirigda a " + receptor + "  con el siguiente texto ( " + texto + ")";
    }

}

class ComparadorTelegrama extends Telegrama {

        TreeMap<Integer, String> t = new TreeMap<>();
    
    public ComparadorTelegrama(){
      
    }
    
    public void introducitdatos(int coste , String texto){
      
        t.put(coste,texto);
    }
    
    public void introducirTexto(){
        
    }
    
   public void imprimirLista(){
         Iterator it = t.entrySet().iterator();
         while (it.hasNext()) {
            Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it.next();
            System.out.println("Costee=" + entry.getKey() + ", texto=" + entry.getValue());

        }
    }

    public static void main(String[] args) {
        Telegrama tl = new Telegrama();
        tl.introducirTelegrama("hola que tal", "alfredo", "quintero", 2.6);
     
        System.out.println(tl.toString());
        System.out.println(tl.coste() +" €");
        
        tl.introducirTelegrama("hola como esta mi gente de ecuador" , "pepe" ,"carlos" , 3.4);
         System.out.println(tl.toString());
        System.out.println(tl.coste() +" €");
        
         tl.introducirTelegrama("hola como estas " , "pep" ,"carl" , 7.6);
         System.out.println(tl.toString());
        System.out.println(tl.coste() +" €");
        
        ComparadorTelegrama ct = new ComparadorTelegrama();
        ct.introducitdatos(23," hola como esta mi gente de ecuador " );
        ct.introducitdatos(8 , " hola que tal ");
         ct.introducitdatos( 3 ,"hola como estas ");
        ct.imprimirLista();
      
        
        

    }

}
