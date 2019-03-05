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

/*
OTRA FORMA

public class Practica6d5 {

    public static void main(String[] args) {
        /*
        Práctica 6: Emular la suma de dos matrices. Se creará una clase: MatrizCuadrada con un
constructor que reciba el tamaño en filas de la matriz, digamos: n. Entonces el constructor
establece como atributo un array de n*n Se deberá crear un método llamado:
MatrizCuadrada suma(MatrizCuadrada) que sirve para hacer la suma de dos matrices
devolviendo la matriz suma ( la suma de dos matrices es una nueva matriz donde cada
compotenente es la suma de las componentes 
         */
        
        
        MatrizCuadrada mc = new MatrizCuadrada(4);
        MatrizCuadrada mc1 = new MatrizCuadrada(4);
        
        
       mostrarArray(mc.suma(mc, mc1));

    }
     public static void  mostrarArray( int[][]arr){
        for (int[] is : arr) {
            for (int i : is) {
                System.out.print(i +" ");
            }
            System.out.println("");
        }
    }

}

class MatrizCuadrada {

    int[][] arr;

    public MatrizCuadrada(int n) {
        filas = n;
        arr = new int[n][n];
           Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int[] fila = arr[i];
            for (int j = 0; j < fila.length; j++) {
               fila[j]=rnd.nextInt((99-1)+1)+1;
                
            }
            
        }
        

    }
    
    
    public int[][] suma(MatrizCuadrada c ,MatrizCuadrada k){
        
        int [][] newarr = new int[this.filas][this.filas];
        
        for (int i = 0; i < arr.length; i++) {
            int[] is = arr[i];
            for (int j = 0; j < is.length; j++) {
                int sum = c.arr[i][j] +k.arr[i][j];
                
                newarr[i][j]=sum;
                
            }
            
        }
        
        
        
        return newarr;
        
    }
    
    
    

    int filas;
}
*/
