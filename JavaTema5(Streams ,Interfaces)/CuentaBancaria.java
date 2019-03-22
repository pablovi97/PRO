/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosier6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class CuentaBancaria {

    /*
    Práctica 10: Crear una clase llamada Cuenta que refleje una cuenta bancaria. Tiene por
atributos: String numero, String titular, double saldo Así como los métodos ingresar() y
retirar() que servirán para añadir o quitar saldo
     */
    public CuentaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public CuentaBancaria(String titular) {
        this("", titular);
        Random rnd = new Random();
        numero = "";
        for (int i = 1; i < 25; i++) {
            if (i % 4 == 0) {
                numero += " ";
            } else {
                numero += rnd.nextInt(10);

            }

        }
        this.titular = titular;
    }
    public String concepto;
    public String numero;
    public String titular;
    public double saldo;
    protected ArrayList<String> Movimiento = new ArrayList<>();
    protected HashMap<String, ArrayList< Movimiento>> indiceMovimiento;

    public void ingreso(String concepto, double cantidad) throws Exception {
        Movimiento m = new Movimiento(concepto, cantidad);

        if (cantidad > 0) {
            ArrayList<Movimiento> subarray = indiceMovimiento.get(concepto);
            if (subarray == null) {
                subarray = new ArrayList<Movimiento>();
                indiceMovimiento.put(concepto, subarray);
                this.saldo += cantidad;
                subarray.add(m);
            }

        } else {
            throw new Exception("no se puede ingresar esa cantidad");
        }

    }

    public void retiro(String concepto, double cantidad) throws Exception {

        if (cantidad > saldo) {
            Movimiento m = new Movimiento(concepto, cantidad);
            ArrayList<Movimiento> subarray = indiceMovimiento.get(concepto);
            if (subarray == null) {
                subarray = new ArrayList<Movimiento>();
                indiceMovimiento.put(concepto, subarray);
                this.saldo -= cantidad;
            }
            subarray.add(m);
        } else {
            throw new Exception("no se puede retirar dinero insuficiente");
        }

    }

    public void listado() {
        for (ArrayList<Movimiento> valor : indiceMovimiento.values()) {
            for (Movimiento mov : valor) {
                System.out.println(mov.cantidad + " , " + mov.concepto);
            }
        }

        /*
      
        Iterator it = indiceMovimiento.entrySet().iterator();

while (it.hasNext()) {
Map.Entry<String, Double> entry = (Map.Entry<String, Double>) it.next();
System.out.println("Clave="+entry.getKey()+", Valor="+entry.getValue());
         */
    }

    public boolean verificarDigitoControl() {
        boolean result = false;
        int[] digitos = {1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 4};
        int suma = 0;
        for (int i = 1; i < digitos.length; i++) {

            suma += (int) (numero.charAt(i)) * digitos[i];

        }
        suma = 11 - (suma % 11);

        if (suma == 10) {
            suma = 1;
        } else if (suma == 11) {
            suma = 0;
        }

        int control = Integer.parseInt(numero.substring(8, 9));
        if (control != suma) {
            result = false;

        } else {
            result = true;
        }
        return result;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double retirar(double cantidad, String concepto) throws Exception {
        double resultado = 0;
        if (cantidad > this.saldo || cantidad < 0) {
            throw new Exception("no se puede hacer esta opracion , falta dinero o es negativa la cantidad");

        } else {

            this.saldo -= cantidad;
            resultado = this.saldo;

            Movimiento.add(concepto + ": " + "-" + cantidad);

        }
        return resultado;

    }

    public double retirar1(double cantidad) throws Exception {
        double resultado = 0;
        if (cantidad > this.saldo || cantidad < 0) {
            throw new Exception("no se puede hacer esta opracion , falta dinero o es negativa la cantidad");

        } else {

            this.saldo -= cantidad;
            resultado = this.saldo;

        }
        return resultado;

    }

    public void ingresar(double cantidad, String concepto) throws Exception {

        if (cantidad >= 0) {
            this.saldo += cantidad;
            Movimiento.add(concepto + ": " + "+" + cantidad);

        } else {
            throw new Exception("no se adimiten cantidades negativas");
        }
    }

    public void ingresar1(double cantidad) throws Exception {

        if (cantidad >= 0) {
            this.saldo += cantidad;

        } else {
            throw new Exception("no se adimiten cantidades negativas");
        }
    }

    public void listado(int num) {

        String result = "";
        for (int pos = Movimiento.size() - num; pos < Movimiento.size(); pos++) {
            result += Movimiento.get(pos) + "\n";

        }
        System.out.println(result);
    }

    /*
    Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema
     */
//    @Override
//    public String toString() {
//        String mensaje = "el titular es" + titular + "con numero " + numero + " y saldo " + saldo;
//        return mensaje;
//    }
}

class Movimiento {

    public Movimiento(String concepto, double cantidad) {
        this.concepto = concepto;
        this.cantidad = cantidad;
    }
    String concepto;
    double cantidad;
}

class CuentaBTC extends CuentaBancaria {

    /*
    Práctica 7: Tomando la clase Cuenta que definimos en la UT sobre clases y objetos:
atributos: String numero, String titular, double saldo, ingresar(), retirar() Crear una clase
hija llamada CuentaBCTT que refleja las cuentas del banco BCTT Este banco por cada
ingreso retiene en comisión 0.50€ y por cada retirada de efectivo un 0.02% del dinero
retirado. Hacer uso de la palabra reservada super
     */
    private static final double COMISION_INGRESO = 0.50;
    private static final double COMISION_DESCUENTO = 2 / 100;

    public CuentaBTC(String numero, String titular) throws Exception {
        super(numero, titular);
        if (!numero.substring(0, 3).equals("7214")) {
            throw new Exception("el numero de cuenta esta mal");
        }
    }

    public CuentaBTC() {
        super("anonimo");
    }

    public CuentaBTC(String titular) {
        super(titular);
        this.numero = "7214" + " " + this.numero.substring(4);
    }

    @Override
    public void ingresar1(double cantidad) throws Exception {
        if (cantidad >= COMISION_INGRESO) {
            double nuevaCantidad = cantidad - COMISION_INGRESO;

            super.ingresar1(nuevaCantidad);

        } else {
            throw new Exception("el saldo es insuficiente");
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double retirar1(double cantidad) throws Exception {
        Double nuevaCantidad = cantidad - COMISION_DESCUENTO;

        return super.retirar1(nuevaCantidad); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) throws Exception {
        // CuentaBTC cb = new CuentaBTC("pepe");
        // cb.ingresar(100);
        // System.out.println(cb.numero);
        // System.out.println(cb.retirar(50));
//        CuentaBancaria cl = new CuentaBancaria("pepe");
//cl.ingresar(200, "venta de avion");
//cl.retirar(50, "pago de comida");
//cl.ingresar(200, "venta de coche");
//cl.listado();

        CuentaBancaria bc = new CuentaBancaria("pepe");

        bc.ingreso("alcampo", 34);
        bc.retiro("hoy", 13);
        bc.listado();

    }
}
