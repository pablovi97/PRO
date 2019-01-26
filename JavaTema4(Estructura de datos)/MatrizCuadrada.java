/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

/**
 *
 * @author pablo viera martin
 */
public class MatrizCuadrada {
    /*
    Práctica 6: Emular la suma de dos matrices. Se creará una clase: MatrizCuadrada con un
constructor que reciba el tamaño en filas de la matriz, digamos: n. Entonces el constructor
establece como atributo un array de n*n
Se deberá crear un método llamado:
MatrizCuadrada suma(MatrizCuadrada) que sirve para hacer la suma de dos matrices
devolviendo la matriz suma ( la suma de dos matrices es una nueva matriz donde cada
compotenente es la suma de las componentes
    */
    
    
  public MatrizCuadrada(int n){
    this.filas = n;
    
  }
    int filas;
    
 
    
    int array[][]; 
    public  MatrizCuadrada (int a, int b, int  c , int d){
        array =  new int[2][2];
        array[0][0] = a;
        array[0][1] = b;
        array[1][0] = c;
        array[1][1] = d;
        
       
    }
    public static MatrizCuadrada suma(MatrizCuadrada c , MatrizCuadrada d){
        MatrizCuadrada resultado = new MatrizCuadrada(
                c.array[0][0]+ d.array[0][0],
                c.array[0][1] + d.array[0][1],
                c.array[1][0] + d.array[1][0],
                c.array[1][1] + d.array[1][1]);
        
        return resultado;
    }
    
}
