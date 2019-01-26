/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

/**
 *
 * @author pablo
 */
public class Matriz2x2 {
    //NO ACABADA
    /*
    Práctica 20: Tomando la clase MatrizCuadrada de la práctica 6 Ahora Crearemos una
Clase: Matriz2x2 que hace referencia a las matrices cuadradas de dimensión 2. El usuario
tendrá la posibilidad de agregar una nueva matriz a la lista, quitar una matriz de la lista.
Cada vez que realice una operación se le mostrará la lista completa de matrices que quede
después de la operación
Para el funcionamiento de este programa se utilizará la estructura dinámica que se considere
conveniente. La Clase Matriz2x2 debe tener un método toString() que facilite que se
muestre la matriz correctamente en pantalla al mostrar la lista de matrices
La lista de matrices siempre se mostrará ordenada. El orden entre matrices cuadradas de
dimensión dos lo va a establecer el determinante de la matriz. Ej
a b
c d determinante = a*d - c*b
    */
    
     public static void mostrarArray(int almacen[][]){
           
        for (int i = 0; i < almacen.length; i++) {
            int fila[] =almacen[i];
            for (int j = 0; j < fila.length; j++) {
                System.out.print(fila[j]);
                
            }
            System.out.println("");

        }
      
            

    
  }
       public Matriz2x2(int n){
    this.filas = n;
       }
    int filas;
    
 
    
    int array[][]; 
    public  Matriz2x2 (int a, int b, int  c , int d){
        array =  new int[2][2];
        array[0][0] = a;
        array[0][1] = b;
        array[1][0] = c;
        array[1][1] = d;
        
       
    }
    public static Matriz2x2 suma(Matriz2x2 c , Matriz2x2 d){
        Matriz2x2 resultado = new Matriz2x2(
                c.array[0][0]+ d.array[0][0],
                c.array[0][1] + d.array[0][1],
                c.array[1][0] + d.array[1][0],
                c.array[1][1] + d.array[1][1]);
        
        return resultado;
    }
}

