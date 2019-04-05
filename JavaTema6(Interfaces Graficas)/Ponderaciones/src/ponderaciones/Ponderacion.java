/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponderaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Ponderacion {

    ArrayList<Nota> notas;
ArrayList<Nota> notas1;
    public Ponderacion() {
        notas = new ArrayList<>();
    }

    public void agregarNota(double valor, String dat) {

        double ponderacion = valor;
        String datos = dat;
        notas.addAll((ArrayList<Nota>) Arrays.stream(datos.split("\\s"))
                .filter(p -> p.matches("[0-9.]+[^,][0-9]|[0-9]"))
                .map(p -> {
                    Nota dato = new Nota(ponderacion, Double.parseDouble(p));
                    return dato;
                }).collect(Collectors.toList())
                
        );

    }
    
    

    public String listarNota() {
        String notas1 = "";
        for (Nota nota : notas) {
            notas1+= nota.nota +" ";
        }
        return notas1;
    }
    
    
    public void clear(){
        notas.clear();
    }
  double suma = 0;
  double pondes = 0;
    public double Calcularmedia() {
       
        for (Nota nota : notas) {
            suma += nota.nota * nota.ponde;
            pondes += nota.ponde;
            
        }
        return suma/pondes;
    }

    public static void main(String[] args) {
        Ponderacion p = new Ponderacion();

        p.agregarNota(0.25, "7 8 3 9 6");
        p.listarNota();
    }

}

class Nota {

    public Nota(double ponde, double nota) {
        this.nota = nota;
        this.ponde = ponde;
    }
    double nota;
    double ponde;
}
