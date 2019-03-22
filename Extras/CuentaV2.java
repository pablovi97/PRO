
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pablo
 */
class Movimiento {

    String concepto;

    double movimiento;

//    double comision;
    public Movimiento(String Concepto, double movimiento) {

        this.concepto = Concepto;

        this.movimiento = movimiento;

    }

    @Override

    public String toString() {

        return concepto + " " + movimiento;

    }

    public class CuentaV2 {

        protected String numero;

        protected String titular;

        protected double saldo;

        protected LinkedList<Movimiento> movimientos;

        protected HashMap<String, ArrayList<Movimiento>> movConceptos;

        public CuentaV2() {

            this("anonimo"); // Para usar this como constructor, siempre debe ser la primera sentencia del constructor.

        }

        public CuentaV2(String titular) {

            this("", titular);

//        numero = "";  // Esto no hace falta porque ya esta inicializado.
            Random rnd = new Random();

            for (int i = 1; i <= 20; i++) {

                if (i % 4 == 0) {

                    numero += " ";

                }

                numero += rnd.nextInt(10);

            }

        }

        protected boolean verificarCuenta(String numeroCuenta) {

            String resultado;

            // [0-9]{8}-[0-9]{2}-[0-9]{10}|[0-9]{20}|[0-9]{8} [0-9]{2} [0-9]{10}
            // Usar este regex para controlar que sea un numero de cuenta.
            int[] valores = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};

            int suma = 0;

            numeroCuenta = "00" + numeroCuenta.replaceAll("\\s", "");

            numeroCuenta = numeroCuenta.replace("-", "");

            // Con .replaceAll("\\s", "") eliminamos los espacios de la cadena, si los tuviese.
            for (int i = 0; i < valores.length; i++) {

                suma += valores[i] * Integer.parseInt(numeroCuenta.substring(i, i + 1)); // numeroCuenta.charAt(i)-'0'

            }

            suma = 11 - (suma % 11);

//        if (suma == 11) {
//            suma = 0;
//        } else if (suma == 10) {
//            suma = 1;
//        }

            /*

            Evitamos el if con un ternario, cuando dc sea mayor de 9,

            sera 11-suma, y si no el mismo número obtenido.

            11-10 = 1

            11 - 11 = 0

             */
            suma = (suma > 9) ? 11 - suma : suma;

            resultado = "" + suma;

            suma = 0;

            String numeroPersonalCuenta = numeroCuenta.substring(12);

            //Cogemos la cadena sin los dos 0, los 8 caracteres ya analizados y los 2 digitos de control(10,11).
            for (int i = 0; i < valores.length; i++) {

                suma += valores[i] * Integer.parseInt(numeroPersonalCuenta.substring(i, i + 1));

            }

            suma = 11 - (suma % 11);

//
//        if (suma == 11) {
//            suma = 0;
//        } else if (suma == 10) {
//            suma = 1;
//        }
            suma = (suma > 9) ? 11 - suma : suma;

            resultado = resultado + suma;

            return numeroCuenta.substring(10, 12).equals(resultado);

        }

        public CuentaV2(String numero, String titular) {

            this.numero = numero;

            this.titular = titular;

            movimientos = new LinkedList<>();

            movConceptos = new HashMap<>();

        }

        @Override

        public String toString() {

            return "Titular: " + titular + " Numero: " + numero + " Saldo: " + saldo + "€";

        }

        public String listado() {

//        String resultado= "";
//        for (Movimiento movimiento : movimientos) {
//            resultado += movimiento + "\n";
//        }
            return listado(movimientos.size());

        }

        public String listado(int cantidad) {

            String resultado = "";

            for (int i = movimientos.size() - cantidad; i < movimientos.size(); i++) {

                resultado += movimientos.get(i) + "\n";

            }

            return resultado;

        }

        public String listadoConcepto() {

            StringBuilder resultado = new StringBuilder();

            for (ArrayList<Movimiento> valor : movConceptos.values()) {

                for (Movimiento movimiento : valor) {

                    resultado.append(movimiento).append("\n");

                }

            }

            return resultado.toString();

        }

        public String listadoConceptoEntry() {

            StringBuilder resultado = new StringBuilder();

            for (Map.Entry<String, ArrayList<Movimiento>> mov : movConceptos.entrySet()) {

                resultado.append(mov.getKey()).append(": \n");

                for (Movimiento movimiento : mov.getValue()) {

                    resultado.append("\t").append(movimiento.movimiento).append("\n");

                }

            }

            return resultado.toString();

        }

        public void ingresar(double ingreso) throws Exception {

            this.ingresar(ingreso, "*");

        }

        public void ingresar(double ingreso, String concepto) throws Exception {

            if (ingreso >= 0) {

                saldo += ingreso;

                movimientos.add(new Movimiento(concepto, ingreso));

                if (movConceptos.get(concepto) == null) {

                    movConceptos.put(concepto, new ArrayList<>());

                }

                ArrayList<Movimiento> mov = movConceptos.get(concepto);

                mov.add(new Movimiento(concepto, ingreso));

            } else {

                throw new Exception("No admite esta cantidad.");

            }

        }

        public void retirar(double retirada) throws Exception {

            this.ingresar(retirada, "*");

        }

        public void retirar(double retirada, String concepto) throws Exception {

            if (retirada >= 0) { // si colocamos ademas "&& retirada <= this.saldo" podemos controlar ambos con la misma excepcion.

                if (saldo - retirada < 0) {

                    throw new Exception("No tiene suficiente saldo.");

                } else {

                    saldo -= retirada;

                    movimientos.add(new Movimiento(concepto, -retirada));

                    if (movConceptos.get(concepto) == null) {

                        movConceptos.put(concepto, new ArrayList<>());

                    }

                    ArrayList<Movimiento> mov = movConceptos.get(concepto);

                    mov.add(new Movimiento(concepto, -retirada));

                }

            } else {

                throw new Exception("No admite esta cantidad.");

            }

        }

    }
}
