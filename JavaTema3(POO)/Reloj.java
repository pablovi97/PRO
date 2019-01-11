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
public class Reloj {

    /*
    Práctica 20: Crear una clase Reloj con atributos: int hora, int minuto, int segundo crear un
    constructor como mínimo con los 3 parámetros. Un constructor de copia, un método: String
    mostrar() que devolverá un texto con los datos del reloj en el formato:
    hora:minuto:segundo. Por ejemplo: 20:17:00
    los metodos agregarMinutos(int), agregarHoras(int), agregarSegundos(int) que sumarán lo
    correspondiente al reloj.
    Observar que cuando supere 60minutos, 60segundos se agrega en la siguiente unidad.
    Sobrecargar los métodos agregarHoras(double) , agregarMinutos(double) que si tienen una
    parte decimal calcula el equivalente en la unidad correspondiente y lo agrega
     */
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Reloj(Reloj reloj){
          this.hora = reloj.hora;
        this.minuto = reloj.minuto;
        this.segundo = reloj.segundo;
    }
    int hora;
    int minuto;
    int segundo;
    public String mostrar(){
        return +this.hora+":"+this.minuto+":"+this.segundo;
    }
    
    public int agregarhoras(int hora){
         this.hora +=hora ;
        return this.hora;
    }
    public int agregarMinutos(int minutos){
        int resultado = 0;
        int suma = this.minuto +minutos;
        int resto = 0;
        if(suma > 60){
            
            int result = suma/60;
            resto = suma%60;
            resultado = this.hora+=result;
             if(resto > 0){
                
               resultado = this.minuto+=resto;
            }
        }else{
            return this.minuto +=minuto;
        }
        return resultado;
    }
    
    public int  agregarSegundo(int segundo){
       int  resultado = 0;
         int suma = this.segundo +segundo;
         int resto = 0;
        if(suma > 60){
            
            int result = suma/60;
            resto = suma % 60;
           resultado =  this.minuto+=result;
            if(resto > 0){
                
               resultado = this.segundo+=resto;
            }
        }else{
           
            resultado = this.segundo +=segundo;
        }
        return resultado ;
    }
    @Override
    public String toString() {
        return this.hora+":"+this.minuto+":"+this.segundo;
    }
    public static void main(String[] args) {
        Reloj rj = new Reloj(23 ,30 ,45);
        System.out.println(rj.mostrar());
        rj.agregarMinutos(76);
         rj.agregarSegundo(1234);
        System.out.println(rj.mostrar());
    }
}
