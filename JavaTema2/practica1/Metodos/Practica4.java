/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica4 {

    public static boolean usuarioAutorizado(String user , String password){
        String usuarioValido = "paco";
        String passValida = "pass";   
        return user.equals(usuarioValido) && password.equals(passValida);
   
        
    }
    
    
    public static void main(String[] args) {
        /*
        Crear un método llamado numeroValido(). El usuario debe introducir un
número entre 20 y 50 y ser múltiplo de 3. El main() del programa:
public static void main(String[] args) {
int num;
Scanner cin = new Scanner(System.in);
do{
System.out.println(“Introducir un número: “);
num = cin.nextInt();
}while( !numeroValido(num) );
System.out.println(“El número cumple los requisitos. Se puede continuar”);
}
         */

        //String usuario ="paco";
        //String pass = "mantenerelCODIGO";
        int num;
        Scanner cin = new Scanner(System.in);
        String usuario;
        String clave;
        do {
            System.out.println("Introducir usuario:");
            usuario = cin.nextLine();
          
            
            
            System.out.println("Introducir clave");
            clave = cin.nextLine();
        } while (!usuarioAutorizado(usuario , clave));
        System.out.println("Acceso concedido!!");
        //acceso a zona restringida
        int cuantia = 10000;
        System.out.println("Cuanta del proyectpo : " + cuantia);
    }
}
