/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosier6;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */


class Padre1 {

    public static void display() {
        System.out.println("Método static pertenciente a clase: Padre");
    }
}

class Hija extends Padre1 {

    public static void display() {
        System.out.println("Método static pertenciente a clase: Hija");
    }

}

public class Test {

    public static void main(String[] args) {
        Hija obj = new Hija();
//hemos creado un objeto de clase Hija cuando lanzamos
//el método nos informa que pertence a la clase Hija
        obj.display();
//Observar que estamos TOMANDO LA MISMA DIRECCIÓN DE MEMORIA donde
// estaba almacenado el objeto de la clase Hija
//en esta ocasión en lugar de funcionar el polimorfismo
//y que nos desencandene el método de la clase Hija
//nos lanza el método de la clase Padre
        Padre1 padreObj = obj;
        padreObj.display();
    }
}
