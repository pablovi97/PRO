/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema4;

/**
 *
 * @author pablo
 */
public class DNI {
    /*
    Práctica 18: Crear una clase DNI con atributo: int dniNum y atributo String letrasPosibles
el atributo letrasPosibles tiene por valor: "TRWAGMYFPDXBNJZSQVHLCKE" que nos
sirve para calcular la letra de un dni sabiendo su número.
Basta con dividir el número del DNI por 23 y tomar el resto. La letra que ocupe la posición
correspondiente en el String letrasPosibles es la letra apropiada
https://www.letranif.com/formula-para-calcular-la-letra-del-dni/
Crear los métodos: validarDNI(String dni) calcularLetra(int num)
validarDNI() verifica que un DNI tenga la letra que le corresponde ( para este método se
puede hacer uso de: Integer.parseInt() para extraer un número de un texto y substring() que
nos sirve para extraer la subcadena que contiene el número sin incluir la letra
calcularLetra() devuelve un char con la letra correspondiente al número que se le pase.
Crear un constructor que reciba un entero que será el número del DNI, y un constructor de
copia
    */
   
    public DNI(int dniNum ) {
        this.dniNum = dniNum;
        this.letrasPosibles = "TRWAGMYFPDXBNJZSQVHLCKE";
    }
    int dniNum;
    String letrasPosibles;
    char letra ;
    
    public char calcularletra(){
       int total = this.dniNum %23;
       letra = this.letrasPosibles.charAt(total);
       return letra;
    }
    
    public boolean validarDNI(String dni){
        boolean resultado = false;
       int num = Integer.parseInt(dni.substring(0,8));
        
       String letra = dni.substring(8);
        int num1 = num%23;
       if(this.letrasPosibles.charAt(num1) == letra.charAt(0)){
          
           resultado = true;
       }else{
           resultado = false;
       }
       return resultado;
    }
    
    
      /*
    Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema
    */
    @Override
    public String toString (){
       
        String mensaje="El DNI es " + dniNum + " con letra " + letra;
        return mensaje;
    }
    
    public static void main(String[] args) {
        DNI dni = new DNI(43379064);
        System.out.println(dni.calcularletra());
        System.out.println(dni.validarDNI("43379064Y"));
        System.out.println(dni.toString());
        
        
    }
    
}
