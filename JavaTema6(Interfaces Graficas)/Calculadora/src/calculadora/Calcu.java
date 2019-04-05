/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myapplication2;


/**
 *
 * @author pablo
 */
public class Calcu {

    public Calcu() {
        pivot = true;
        cont = 0;

    }

    double operacion;
    int cont;

    public void setNumante(int numante) {
        this.numante = numante;
    }

    public void setNumact(int numact) {
        this.numact = numact;
    }
    double numante;
    double numact;
    String operador;
    boolean pivot;
    

    public void cargarNumero(int num) {
        if (cont < 2) {
            if (pivot) {
                this.setNumante(num);
                pivot = false;

            } else {
                this.setNumact(num);
                pivot = true;

            }
        } else {
            this.setNumact(num);
        }

        cont++;

    }

    public String limpiar() {
        cont = 0;
        numante = 0;
        numact = 0;
        operacion=0;
        operador = "";
        return  "";
    }

    public void operador(String op) {
        operador = op;

    }

    public String resultado() {
       
        switch (operador) {

            case "+":
                if (cont > 2) {
                    operacion += numact;
                } else {
                    operacion = numante + numact;
                }

                break;
            case "-":
                if (cont > 2) {
                    operacion -= numact;
                } else {
                    operacion = numante - numact;
                }
                break;
            case "X":
                if (cont > 2) {
                    operacion = operacion * numact;
                } else {
                    operacion = numante * numact;
                }
                break;
            case "/":
                if (cont > 2) {
                    operacion /= numact;
                } else {
                    operacion = numante / numact;
                }
         

            default:
        }

        return this.operacion + "";

    }

 
  
}
