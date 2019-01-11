/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio28 {

    public static void main(String[] args) throws Exception {
        /*
         para cualesquier cifra de dinero >= 12 que cueste una carta ocurre que se
puede conseguir franquear con sellos de 4 y 5. Ej 12 = 4, 4, 4 13 = 4, 4, 5 14 = 4, 5, 5
Encontrar un algoritmo recursivo que resuelva el problema
         */
        sellos(19, 19);
        //System.out.println("sellar = "+sellar(100));
    }

    public static String sellos(int num, int n) throws Exception {
        String result = "";
        switch (num) {

            case 12:
                if (n == 12) {
                    System.out.println("4,4,4"+result);
                } else {
                    System.out.println(n + "= 4,4,4,4");
                }

                break;
            case 13:
                if (n == 13) {
                    System.out.println("4,4,5"+result);
                } else {
                    System.out.println(n + "= 4,4,4,5");
                }

                break;
            case 14:
                if (n == 14) {
                    System.out.println("4,5,5"+result);
                } else {
                    System.out.println(n + "= 4,4,5,5");
                }

                break;
            case 15:
                if (n == 15) {
                    System.out.println("15=5,5,5"+result);
                } else {
                    System.out.println(n + "= 4,5,5,5");
                }

                break;
            default:
                if (num < 12) {
                    throw new Exception("No se ha introducido un numero mayor de 12");
                } else {
                    result += sellos(num - 4, n)+"4";

                }
                
        }
        return  result;
    }
  public static String sellar(int cant) throws Exception{
      //Corregido
      String resultado = "";
      if(cant <12){
          throw new Exception("debes introducir un numero mayor de 12");
          
      }else{
          if(cant==12){
              resultado += "4+4+4"; 
          }else if(cant==13){
              resultado +="4+4+5";
          }else if(cant==14){
              resultado +="4+5+5";
              
          }else if(cant == 15){
              resultado+="5+5+5";
          }
          else if(cant == 16){
              resultado+="4+4+4+4";
          }else{
              resultado +=sellar(cant-5)+"+5";
          }
          return resultado;
      }
  }  

}
