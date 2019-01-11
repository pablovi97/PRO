/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Random;

/**
 *
 * @author Pablo Viera Martin .
 */
public class CuentaBancaria {

    /*
    Práctica 10: Crear una clase llamada Cuenta que refleje una cuenta bancaria. Tiene por
atributos: String numero, String titular, double saldo Así como los métodos ingresar() y
retirar() que servirán para añadir o quitar saldo
     */

    public CuentaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    public CuentaBancaria(String titular){
        this("",titular);
        Random rnd = new Random();
       // numero = "";
        for (int i = 1; i < 25; i++) {
            if(i%4==0){
                numero+=" ";
            }else{
               numero += rnd.nextInt(10);
               
            }
            
        }
      //  this.titular = titular;
    }
  
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double retirar(double cantidad) throws Exception {
        double resultado = 0;
        if (cantidad > this.saldo || cantidad <0) {
            throw new Exception("no se puede hacer esta opracion , falta dinero o es negativa la cantidad");

        } else if (cantidad > 0) {
            this.saldo -= cantidad;
            resultado = this.saldo;

        } 
        return resultado;

    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad >= 0) {
            this.saldo += cantidad;
        } else {
            throw new Exception("no se adimiten cantidades negativas");
        }
    }
    /*
    Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema
    */
    @Override
    public String toString (){
        String mensaje="el titular es"+titular+"con numero "+numero +" y saldo "+saldo;
        return mensaje;
    }

}
