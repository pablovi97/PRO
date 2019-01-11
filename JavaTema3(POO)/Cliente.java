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
public class Cliente {
    /*Practica11: Crear una clase llamada Cliente que emulará los gastos de un cliente de un
hotel. Como atributos tendrá como mínimo: int id, String nombre, String apellido, int
habitacion, double debe, int noches Como métodos como mínimo gastar(double) y
pagar(double) que reflejan cuando el cliente consume y aumenta su deuda así como pagar
parte de su cuenta. Tener en cuenta que como mínimo en el debe del cliente estará la cuantía
de alquilar la habitación por el número de noches que esté. Cuando se establezca el número
de la habitación también se deberá establecer el precio/noche de la habitación
*/
    
    int id;
    String nombre;
    String apellido;
    int habitacion;
    double debe;
    int noches;
    
    public Cliente(int ide , String nom , String ape , int habit ,double deb , int noch){
        id =ide;
        nombre=nom;
        apellido =ape;
        habitacion = habit;
        debe = deb;
        noches = noch;
    }
    public Cliente(){
         id =0;
        nombre=null;
        apellido =null;
        habitacion = 0;
        debe = 0;
        noches = 0;
    }
    
    public double gastar(double pago){
       
       pago += pago;
       return pago;
   }
  
  public double pagar(){
         double total = 0;
       total = this.gastar(debe) + debe;
       
       return total*noches;
   }
  /*
  Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema
  */
    @Override
  public String toString (){
        String mensaje="el cliente con ID " +id+" nombre "+ nombre + " y apellido "+ apellido + "con numero de habitacion "+habitacion+ "que ocupara "+ noches +" noches "+ "debera "+debe;
        return mensaje;
    }
    public static void main(String[] args) {
        Cliente cl = new Cliente (323 , "pepe" ,"carlos" , 234 , 34.60 ,4);
        System.out.println(cl.pagar());
    }
}
