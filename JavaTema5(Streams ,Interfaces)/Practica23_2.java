package Dosier6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class Practica23_2 {

    /*
    Práctica 23: Copiar y ejecutar el Ejemplo Operaciones. Ya que las interfaces funcionales
aceptan métodos con código ( métodos default) agregar a la interfaz un método llamado:
default public void miNombre() que muestre tu nombre. En el main escribir la sentencia:
suma.miNombre(); y ejecutar el código ¿funciona?
Crear otro método default llamado: misApellidos() que en este caso mostrarían tus
apellidos ¿puedes ejecutarlo? Entonces ¿ se puede tener más de un método default? 
     */
    /*
    Práctica 24: agrega el método: public abstract String toString(); ¿ lo acepta ? ¿cómo es
que lo acepta si únicamente se podía un único método abstracto?
Ahora añade el método: public abstract int otroAbstracto(); ¿lo acepta? (toma captura de
pantalla) ¿qué error muestra? Comenta la línea con: @FunctionalInterface ¿sigue
quejándose? ¿por qué lo acepta ahora?
    */
    
 
    public static void mostrarResultado(int x, int y, Operaciones op) {
        System.out.println(op.operacion(x, y));
    }

    public static void main(String[] args) {
        Operaciones<Integer> suma = (a, b) -> "x + y=" + (a + b);
        Operaciones<Integer> resta = (a, b) -> "x - y=" + (a - b);
        Operaciones<Integer> multiplica = (a, b) -> "x * y=" + (a * b);
        mostrarResultado(2, 3, suma);
        mostrarResultado(5, 1, resta);
        mostrarResultado(4, 7, multiplica);
        suma.miNombre();
        suma.miApellido();
    }
   

}

@FunctionalInterface
interface Operaciones<T> {

    String operacion(T a, T b);
    
    
    default public void miNombre(){
        System.out.println("Pablo");
    }
     
    default public void miApellido(){
        //Se puede tener mas de dos metodos default
        System.out.println("Viera");
    }
    public abstract String toString();
    
    
   // public abstract int otroAbstracto();
    
}

