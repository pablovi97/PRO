/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosier6;

import java.util.ArrayList;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
@FunctionalInterface
interface AcumularEnteros {

    Integer acumular(Integer a, Integer b);

    default Integer sumar(ArrayList<Integer> array) {
        Integer resultado = 0;
        for (Integer integer : array) {
            resultado += integer;
        }
        return resultado;
    }
}
@FunctionalInterface
interface Prueba{
    Integer miPruebita(Integer a);
       
        
    
}

public class LambdaVsAnonima {

    public static void main(String[] args) {
        /*
        PARA CUANDO NO RECIBA PARAMETROS
          Prueba prueba = () ->{
          
          return 5;
        };
        PARA CUANDO SON DOS PARAMETROS
         Prueba prueba = (datito1 ,datito2) ->{
            datito =datito*4;
          return  datito/2;
        };
          Prueba prueba =(Integer datito) ->{
            datito =datito*4;
          return  datito/2;
        };
        
        */
        
        Prueba prueba = datito ->{
            datito =datito*4;
          return  datito/2;
        };
        AcumularEnteros objetoAnonimo = (Integer a, Integer b) -> {
            Integer resultado = 0;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(a);
            arr.add(b);
            // resultado = this.sumar(arr); //esta línea no posible con lambda
            return resultado;
        };

    
    }
}
