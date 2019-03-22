/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier6;

/**
 *
 * @author pablo
 */
public abstract class Persona12 implements OrdenableP17<Persona12> {


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
    public Persona12(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
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

        /*
        Práctica 15: Toma las clases Persona, Hombre, Mujer de la práctica 12 y crea un pequeño
programa que le de la posibilidad al usuario de introducir tantos hombres y mujeres como
quiera. Esos datos se insertarán en un ArrayList de tipo Persona. Finalmente recorrer el
ArrayList y mostrar el toString() de cada elemento. ¿ qué toString() está usando ? ¿ el de
Persona, el de Hombre, el de Mujer ?

         */
 /*
        Persona12 persona[] = new Persona12[4];

        persona[0] = new Mujer1("andrea ", "machado", "pepe", 20, 180, 60);
        persona[1] = new Hombre1("pepe", "estevez", "carlos", 18, 175, 73);
        persona[2] = new Hombre1("pep", "estev", "carl", 1, 17, 7);
        persona[3] = new Mujer1("anna", "perera", "perez,", 56, 56, 46);

        for (Persona12 person : persona) {
            System.out.println(person);
        }
         */
        OrdenableP17 elemento1 = new Hombre1("unnom", "unape", "otro", 25, 178, 75);
        OrdenableP17 elemento2 = new Mujer1("otronom", "ape1", "ape2", 20, 165, 60);
        if (elemento1.esMayorQue(elemento2)) {
            System.out.println("elemento1 es mayor que elemento2");
        } else {
            System.out.println("elemento1 no es mayor que elemento2");
        }

    }

    @Override
    public boolean esMayorQue(Persona12 p) {

        return this.nombre.compareTo(p.nombre) > 0;
    }

    @Override
    public boolean esMenorQue(Persona12 p) {

        return this.nombre.compareTo(p.nombre) < 0;
    }

    @Override
    public boolean esIgualQue(Persona12 p) {
        return this.edad == p.edad;
    }

}

class Hombre1 extends Persona12 {

    public Hombre1(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
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

class Mujer1 extends Persona12 {

    public Mujer1(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
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
