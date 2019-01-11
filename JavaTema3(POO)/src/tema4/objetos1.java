/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Pablo Viera Martin .
 */
public class objetos1 {

    public static void main(String[] args) {
     
       // p.nombre = "ana";
       // p.apellido = "martin";

        // Persona q;
        // q = p;
        //q.nombre = "ana maria";
        //System.out.println(p.getNombreCompleto());
       // p.setDatos("pepe", "vinagre", 48);

      //  p.mostrar();
      
        // Persona p = new Persona("adan","martinez",35);
       

    }

}

class Persona {

    public String nombre;
    public String apellido;
    public int edad;

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String txt) {
        nombre = txt;
    }

    public void setApellido(String txt) {
        apellido = txt;
    }

    public void setEdad(int n) {
        edad = n;
    }

    public void setDatos(String nom, String ape, int ed) {
        nombre = nom;
        apellido = ape;
        edad = ed;

    }

    public void mostrar() {
        String resultado = "";
        resultado = "*" + nombre + " " + apellido + " " + edad + " años" + " * ";
        String ast = "";
        for (int i = 0; i < resultado.length() / 2; i++) {
            ast += "* ";

        }

        System.out.println(ast);
        System.out.println(resultado);
        System.out.println(ast);

    }
  /*  
    class casa{
    public String lugar;
    public int  metros;
    public String extras;
    public String diseño;
    public int precio;
    public int habitaciones;
    
    public String getDatosCasa(){
        return lugar +" "+metros+"cuadrados  "+precio+ "euros  " + extras +" "+ diseño; 
    }
    
   // public int  
}
*/
}