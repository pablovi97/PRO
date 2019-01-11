/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Pablo Viera Martin
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     for (int i =0; i<255; i++){
        /*
           1:variable
           2:comparaciones
           3:acción
           */
           char c = (char)i;
           System.out.println(""+i+":"+c);//Te muestra toda la tabla (todos sus carcateres) askin hasta 255
           // i = c;
           
    }
        System.out.println('#' < 'j');
        
        
        boolean pregunta = true ;
        System.out.println(!pregunta);// "!" es negacion si es si lo transforma en no 
        
        
    int x=3, y=4;
    boolean condicion = x>y;
System.out.println( (condicion)?x:y );//la pregunta es primero la accion y segundo si la accion es verdad y tercero si es mentira

// (accion) ? si es verdad : si es mentira


int z = (int)Math.random();//dara un numero de 0 a 9
System.out.println(z);
int a = 10;
int b = 20;

int num;
num = (int)(1+Math.random()*5);

System.out.println(num);



        
    } 
    
}