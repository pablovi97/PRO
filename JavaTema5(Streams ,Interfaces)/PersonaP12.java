/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosier6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public abstract class PersonaP12 {

    /*
    Práctica 12: Crear una clase Persona que es abstracta y que tiene atributos: nombre,
apellido1,apellido2, int edad, int altura, double peso La altura está pensada en cm y el peso
en kg debe tener al menos un constructor con esos 6 parámetros. Sobreescribir toString()
para que muestre los datos de la persona. Crear el método protected double calcularIMC()
que devuelve el IMC de la persona. Crear también un método abstracto calcularPesoIdeal()
Crear las clases Hombre y Mujer y para obtener calcularPesoIdeal tener en cuenta la
fórmula:
peso ideal = altura - 100 - ( (100 - 150)/k )
siendo k=4 si hombre y k=2 si mujer
el toString() de hombre y mujer debe hacer uso del toString() de Persona y agregar el
resultado del peso ideal
     */
    public PersonaP12(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    String nombre;
    String apellido1;
    String apellido2;
    int edad;
    int altura;//cm
    double peso;//Kg

    @Override
    public String toString() {
        String imc = String.format("%.3f", CalcularIMC());
        return "nombre :" + nombre + "|  apellidos:  " + apellido1 + "  " + apellido2 + " " + "| Edad :" + edad + "|   Altura:" + altura + "|  Peso :" + peso + "| IMC :" + imc;

    }

    protected double CalcularIMC() {

        double alturaM = this.altura / (double) 100;

        return this.peso / (alturaM * alturaM);

    }
    

    protected abstract double calcularPesoIdeal();

    public static void main(String[] args) {
//       Hombre hm = new Hombre("pepe","estevez","carlos",18,175,73);
//       Mujer mj = new Mujer("andrea " ,"machado" ,"pepe" ,20 ,180 ,60);
//        System.out.println(mj);
//        System.out.println(hm);
//        
        //POLIFORMISMO

        PersonaP12 persona[] = new PersonaP12[4];

        persona[0] = new Mujer("andrea ", "machado", "pepe", 20, 180, 60);
        persona[1] = new Hombre("pepe", "estevez", "carlos", 18, 175, 73);
        persona[2] = new Hombre("pep", "estev", "carl", 1, 17, 7);
        persona[3] = new Mujer("anna", "perera", "perez,", 56, 56, 46);

//        for (PersonaP12 person : persona) {
//            System.out.println(person);
//        }

/*
EJEMPLO STREAM
*/
        ArrayList<PersonaP12> personas = new ArrayList(Arrays.asList(persona));
        
        
        
        
        ArrayList<String> resultados;
        resultados = (ArrayList)personas.stream().filter(x -> x.edad >= 18)
                .sorted((p1, p2) -> p1.nombre.compareTo(p2.nombre))
                .map(p -> p.nombre)
                .collect(Collectors.toList());
        
        System.out.println(resultados);
    }
       

}

class Hombre extends PersonaP12 {

    public Hombre(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        super(nombre, apellido1, apellido2, edad, altura, peso);
    }

    @Override
    public String toString() {
        return "H |" + super.toString() + "|   con peso ideal : " + calcularPesoIdeal();
    }

    @Override
    protected double calcularPesoIdeal() {

        return this.altura - 100 - ((this.altura - 150) / 4.0) + ((this.edad - 20) / 4.0);
    }

}

class Mujer extends PersonaP12 {

    public Mujer(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        super(nombre, apellido1, apellido2, edad, altura, peso);
    }

    @Override
    protected double calcularPesoIdeal() {
        return this.altura - 100 - ((this.altura - 150) / 2.0) + ((this.edad - 20) / 2.0);
    }

    @Override
    public String toString() {
        return "M  |" + super.toString() + " " + "|  Con peso ideal : " + calcularPesoIdeal();
    }

}
