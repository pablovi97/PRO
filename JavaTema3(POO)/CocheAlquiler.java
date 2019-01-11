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
public class CocheAlquiler {

    /*
     Práctica 26: Crear la clase CocheAlquiler como mínimo con atributos: String matricula,
     marca, modelo; double precio; int numDias; boolean alquilado; y la fecha de alquiler
     reflejada en tres valores enteros: dd, mm, aa
     Se deberá reflejar que hay una cantidad mínima de días de alquiler: 2
     Un constructor como mínimo que reciba matricula, marca, modelo y precio.
     Un método: double alquilar(int dias, int dd, int mm, int aa) que refleja la fecha de alquiler y
     el número de días del alquiler. En este método se deberá controlar si el coche ya está
     alquilado en cuyo caso devolverá -1. -2 si se intenta alquilar por menos días del mínimo
     establecido y el coste del alquiler en otro caso
     Un método: double devolver(int dias) que refleja que se ha devuelto el coche después de
     una cantidad de días. Este método devuelve -1 si el coche no está alquilado y la cantidad de
     sobrecoste que pudiera haber incurrido si sobrepasa los días de alquiler inicialmente
     establecidos
     Sobreescribir el método toString() que muestre los datos relevantes del alquiler
     */
    /**
     * 
     * @param matricula introduce la matricula
     * @param marca introduce la marca
     * @param modelo introduce el modelo del coche
     * @param precio introduce el precio del coche
     * @param alquilado  introduce si esta alquilado o no (TRUE/FALSE)
     */
    public CocheAlquiler(String matricula, String marca, String modelo, double precio , boolean alquilado) {

        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.alquilado = alquilado;
    }
/**
 * En este metodo hay que introducir la fecha y los dias que se va a alquilar
 * a partir de esa fecha te retornara un -2 si se alquila menos de dos dias
 * y un -1 si ya esta alquilado
 * @param dias
 * @param dd
 * @param mm
 * @param aa
 * @return
 */
    public double alquilar(int dias, int dd, int mm, int aa)  {
       fechAlquiler = dd +":"+mm+":"+aa;
       numDias = dias; 
        if(dias < 2){
            return -2;
        }else if(!alquilado){
            this.alquilado =true;
          return -1;
          
        }
        return 0;
    }
    
    /**
     * se comprobara si el numero de dias estipulado de alquiler es menor al que se lleva usando en el caso de
     * que se sobrepase este dia habra un sobrecoste
     * @param dias
     * @return 
     */
    public double devolver(int dias){
        
        if(alquilado == false){
           
            return -1;
        }else if(dias > numDias){
             this.precio+= 20;
        }
         return 0;   
    }
    String matricula;
    String marca;
    String modelo;
    double precio;
    int numDias;
    boolean alquilado;
    String fechAlquiler;
    @Override
     public String toString() {
        return "el coche de marca "+marca+ "y  modelo "+ modelo+ " con precio de "+ precio + " se alqulara desde el dia "+fechAlquiler+ "hasta "+numDias +"despues";
    }

}
