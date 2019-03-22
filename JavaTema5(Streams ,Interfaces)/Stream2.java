/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosier6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Stream2 implements Comparator {

    static String apellidos[] = {"estevez", "viera", "martin", "alcazar"};

    public static Hombre crearHombre() {

        String nombre[] = {"pepe", "alvaro", "juan", "juan Antonio", "alberto"};
        Random rnd = new Random();

        int altura = rnd.nextInt(40) + 155;
        int edad = rnd.nextInt(90);
        int peso = rnd.nextInt(40) + 65;
        String apellido = apellidos[rnd.nextInt(apellidos.length)];
        String nombres = nombre[rnd.nextInt(nombre.length)];
        return new Hombre(nombres, apellido, apellido, edad, altura, peso);

    }

    public static Mujer CrearMujer() {

        String nombre[] = {"pepa", "alvarita", "juana", "juani", "albertita"};
        Random rnd = new Random();

        int altura = rnd.nextInt(40) + 155;
        int edad = rnd.nextInt(90);
        int peso = rnd.nextInt(40) + 65;
        String apellido = apellidos[rnd.nextInt(apellidos.length)];
        String nombres = nombre[rnd.nextInt(nombre.length)];
        return new Mujer(nombres, apellido, apellido, edad, altura, peso);

    }

    public static void main(String[] args) {
        /*
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> lista = numeros.stream()
                .filter(n -> {//se queda con aquellos elementos cuya expresion acepte
                    System.out.println("filtrando " + n);
                    return n % 2 == 0;//te muestra los que son multiplos de dos en el array y hasta que sea 0 no sigue hacia abajo
                })
                .map(n -> {//es lo que se va a guardar en la lista
                    System.out.println("mapping " + n);
                    return n * n;
                })
                .limit(2)//te lo corta en las dos primeras ocurrencias y si se pasa del limite te muestra todo te busca dos del map y vuelve arriba por cada
                .collect(toList());//al final lo mete en una lista 
        System.out.println(lista);//te enseña limit guardandote el mapeo
         */
        //mostrar las personas de mas edad

        ArrayList<PersonaP12> personas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            if (rnd.nextInt(2) == 0) {
                personas.add(Stream2.CrearMujer());

            } else {
                personas.add(Stream2.crearHombre());
            }

        }

        // 40 -Mostrar las 3 personas de más edad
        System.out.println("___________");
        System.out.println("PRACTICA 40");
        personas.stream().sorted((p, q) -> Integer.compare(p.edad, q.edad)).limit(3).forEach(System.out::println);

        // 41 -Mostrar las personas que tienen menos peso que el que le corresponde(Y se guarda en un array)
        System.out.println("_________________");
        System.out.println("PRACTICA 41");
        ArrayList<PersonaP12> rest = new ArrayList<>();
        personas.stream().filter((PersonaP12 p) -> {
            return p.peso < p.calcularPesoIdeal();
        })
                .forEach(p -> {
                    System.out.println(p.nombre + " " + p.apellido1 + "le falta peso");
                    rest.add(p);
                });

        //lo mismo con collect te lo mete en en un hashset (todos los que son hashset son hijos de set)
        //peek coje el objeto del stream sin modificarlo  es como un foreach pero que no es terminal
        //filter siempre tiene que acabar con una operacion terminal
        Set rest2 = personas.stream().filter((PersonaP12 p) -> {
            return p.peso < p.calcularPesoIdeal();
        })
                .peek(p -> {
                    System.out.println(p.nombre + " " + p.apellido1 + "le falta peso");
                })
                .collect(Collectors.toSet());

        //Obtener con una sola sentencia de stream (una sentencia es de una llave a una llave o un punto y coma a otro) ,obtener un set con las mujeres y una lista con los hombres
        ArrayList<PersonaP12> hombre = new ArrayList<>();
        HashSet<Mujer> mujer = new HashSet<>();
        personas.stream()
                .forEach(p -> {
                    if (p instanceof Hombre) {
                        hombre.add((Hombre) p);

                    } else {
                        mujer.add((Mujer) p);
                    }

                }
                );

        Map<Boolean, List<PersonaP12>> agrupacion = personas.stream().collect(Collectors.groupingBy(p -> p instanceof Mujer));

        agrupacion.keySet().stream().forEach(p -> {
            System.out.println(agrupacion.get(p));

        });

        //Práctica 42:   Mostrar una persona de 27 años si hay alguna
        System.out.println("_____________");
        System.out.println("PRATICA 42 ");

        personas.stream().forEach((PersonaP12 p) -> {
            if (p.edad == 27) {
                System.out.println(p);

            }

        });

        /*
        Práctica 43: Crear un arraylist de hombres con un elemento hombre por cada persona del
array original

         */
        System.out.println("PRACTICA43");

        ArrayList<Hombre> hombres1 = new ArrayList<>();

        personas.stream().forEach(p -> {
            if (p instanceof Hombre) {
                hombres1.add((Hombre) p);
            }

        });

        System.out.println(hombres1);

        // Practica 44 : Calcular el peso medio de las mujeres del arraylist
        System.out.println("_____________");
        System.out.println("PRATICA 44 ");

        personas.stream().filter((PersonaP12 p) -> {
            return p instanceof Mujer;
        }).mapToDouble((PersonaP12 p) -> p.peso).average().ifPresent(System.out::println);

        //Práctica 45: Mostrar las personas que tienen más edad que la media
        System.out.println("_____________");
        System.out.println("PRATICA 45 ");

        personas.stream().mapToDouble((PersonaP12 p) -> p.edad).average().ifPresent(media -> {
            personas.stream().filter(p -> p.edad > media).forEach(System.out::println);
        });

        //Práctica 46: Mostrar por cada persona cuántas personas tienen su misma edad
        System.out.println("_________________-");
        System.out.println("PRACTICA46");

        personas.stream().forEach((PersonaP12 p) -> personas.stream().filter(q -> q.edad == p.edad).count());

        //average devuelve un optional
        //Práctica 47: Obtener el imc mínimo ( el número ) y mostrar por cada persona su imc
        System.out.println("_____________");
        System.out.println("PRATICA 47 ");
        personas.stream().min((a, b) -> Double.compare(a.CalcularIMC(), b.CalcularIMC())).ifPresent(min -> {
            System.out.println(min);
            personas.stream().forEach(p -> System.out.println(p.nombre + " " + (int) p.CalcularIMC()));

        });

        //Ordenar por peso
        System.out.println("ORDENAR POR PESO");

        personas.stream().sorted((o1, o2) -> Double.compare(o1.peso, o2.peso)).forEach(Prueba3::pruebita);

        // EL MAXIMO
        System.out.println("ORDENAR POR ALTURA MAYOR");
        Optional<PersonaP12> opt = personas.stream().max((a, b) -> Integer.compare(a.altura, b.altura));
        opt.ifPresent(System.out::println);//ifPresent es un metodo de optional NO DE STREAM
        //ifPresent es igual a if p !=null

        if (opt.isPresent()) {
            int alturaMax = opt.get().altura;
        }
        //isPresent devuelve un boolean si es tiene algo o esta vacio
        System.out.println("DEVUELVE TODAS MUEJERES CON ALLMATCH");

        ArrayList<Mujer> arr = null;
        if (personas.stream().allMatch(p -> p instanceof Mujer)) {
            arr = (ArrayList<Mujer>) personas.stream().map(p -> (Mujer) p).collect(Collectors.toList());
        }
        System.out.println(arr);
        System.out.println("_____________");
        System.out.println("PRACTICA 34");

        if (personas.stream().anyMatch(p -> p.peso < 50)) {

        }
        System.out.println("______________");
        //findFirst te encuentra el primero  y es terminal es como limit(1) pero sin ser terminal tambien devuelve un optional
        System.out.println("PRACTICA 35");
        //Práctica 35: Utiliza findFirst() y Optional.ifPresent() para mostrar a un Hombre llamado:
        ///“Luis” que debes primero agregar al arraylist personas.
        personas.add(new Hombre("Luis", "ortega", "ortega", 13, 123, 78));

        Optional<PersonaP12> opt1 = personas.stream().filter(x -> "Luis".equals(x.nombre)).findFirst();

        opt1.ifPresent(System.out::print);
//        System.out.println(
//        opt1.orElse(new PERSONA) //si no hay que la haga con orElse y pertenece a optional
//        
//        
//        );

        /*
Práctica 54: Obtener un arraylist de String donde cada letra de los diferentes nombres de
las personas sea un elemento del arraylist. Para esto usaremos flatMap() y la instrucción:
Arrays.stream(p.nombre.split(""))
observar que mediante String.split(“”) obtenemos un array de String con todos los
caracteres separados. Mediante Arrays.stream() convertimos un array en un stream
         */
        System.out.println("PRACTICA 54");

        ArrayList<String> k = (ArrayList<String>) personas.stream().flatMap(p -> Arrays.stream(p.nombre.split(""))).collect(Collectors.toList());

        System.out.println(k);

        /*
        Práctica 48: Crear un arraylist con las mujeres, y obtener la edad media de los hombres
         */
        System.out.println("____________");
        System.out.println("PRACTICA 48");

        ArrayList<Mujer> mujers2 = new ArrayList<>();

        personas.stream().mapToDouble(p -> {
            double resultado = 0;
            if (p instanceof Hombre) {
                resultado = ((Hombre) p).edad;
            } else {
                mujers2.add((Mujer) p);
            }
            return resultado;
        }).average().ifPresent(System.out::println);

        System.out.println(mujers2);

        /*
        Práctica 49: Crear un arraylist con textos que indiquen por cada persona su nombre, sexo
y edad: "Ana, mujer: 23años" . Este array quedará ordenado por peso
         */
        System.out.println("________________");
        System.out.println("PRACTICA49");

        ArrayList<String> pers1 = new ArrayList<>();

        personas.stream().sorted((a, b) -> Double.compare(a.peso, b.peso)).forEach(p -> {
            String resultado = "";
            if (p instanceof Mujer) {
                resultado = p.nombre + " " + " Mujer " + p.edad;
                pers1.add(resultado);
            } else {
                resultado = p.nombre + " " + " Hombre " + p.edad;
                pers1.add(resultado);

            }

        });

        System.out.println(pers1);

//Práctica 50: Mostrar la persona adulta más joven ( se entiende por adulto >= 18años)
        System.out.println("_____________");
        System.out.println("PRACTICA 50");

        personas.stream().filter(p -> p.edad >= 18).min((l, q) -> Integer.compare(l.edad, q.edad)).ifPresent(System.out::println);

//uno
//   personas.stream().filter(r -> r.edad ==  personas.stream().filter(p -> p.edad>=18)).sorted( (p ,q)-> Integer.compare(p.edad, q.edad))
//       .mapToDouble(p->p.edad).findFirst()

        /*
Práctica 51: obtener la persona que se aleja más de su peso ideal ( observar que esto puede
ser tanto por mucho peso como por poco peso )
         */
        System.out.println("PRACTICA 51");

        personas.stream()
                .max((a, b) -> Double.compare(Math.abs(a.calcularPesoIdeal() - a.peso), Math.abs(b.calcularPesoIdeal() - b.peso)))
                .ifPresent(p -> {
                    System.out.println(p.nombre + " " + p.calcularPesoIdeal() + " " + p.peso);
                });
        /*
        
        Práctica 52: Crear un arraylist con los hombres ordenados de menor a mayor peso al
principio del array y luego las mujeres con el mismo criterio
         */
        System.out.println("PRACTICA 52");

        ArrayList<PersonaP12> v = (ArrayList<PersonaP12>) personas.stream().sorted((PersonaP12 a, PersonaP12 b) -> {

            double pesoa = a.peso;
            double pesob = b.peso;
            pesoa += (a instanceof Mujer) ? 1000 : 0;
            pesob += (a instanceof Mujer) ? 1000 : 0;
            return Double.compare(pesoa, pesob);

        }).collect(Collectors.toList());
        System.out.println(v);

        /*
        Práctica 53: Mostrar las mujeres que son más altas que los hombres
       
         */
        System.out.println("_________");
        System.out.println("PRACTICA53");

        personas.stream()
                .filter(p -> p instanceof Hombre).mapToDouble(p -> p.altura)
                .min().ifPresent(p -> personas.stream()
                .forEach(q -> {
                    if (q instanceof Mujer) {
                        if (((Mujer) q).altura > p) {
                            System.out.println(((Mujer) q).nombre + " " + ((Mujer) q).altura);
                        }
                    }

                }));

        /*
        Práctica 54:  Obtener un arraylist de String donde cada letra de los diferentes nombres de las
        personas sea un elemento del arraylist. 
        Para esto usaremos flatMap() y la instrucción:    Arrays.stream(p.nombre.split(""))  
        observar que mediante  String.split(“”) obtenemos un array 
        de String con todos los caracteres separados. Mediante Arrays.stream()  convertimos un array en un stream
         */
        System.out.println("_________________");
        System.out.println("PRACTICA54");

        ArrayList<String> t = (ArrayList<String>) personas.stream().flatMap(p -> Arrays.stream(p.nombre.split(""))).collect(Collectors.toList());
        System.out.println(t);

        System.out.println("PARA ESTUDIAR 1)");

        //Obtener el imc mÃ­nimo ( el nÃºmero ) y mostrar por cada persona su imc
        personas.stream()
                .mapToDouble(p -> p.CalcularIMC())
                .min().ifPresent(p -> {
                    System.out.println(" el peso minimo es " + p);
                    personas.stream().mapToDouble(q -> q.CalcularIMC()).forEach(q -> System.out.println(q)
                    );

                });

        System.out.println("PARA ESTUDIAR 2)");

//crear un arraylist con las mujeres, y obtener la edad media de los hombres ArrayList<Mujer> mujeres = new ArrayList<Mujer>(); double edadMediaHombres = personas.stream()...
        ArrayList<Mujer> mujeres = new ArrayList<>();

        double edadMediaHombres = personas.stream().mapToDouble(p -> {
            double resultado = 0;
            if (p instanceof Hombre) {
                resultado = ((Hombre) p).edad;
            } else {
                mujeres.add((Mujer) p);
            }
            return resultado;

        }).average().getAsDouble();

        System.out.println("EDAD MEDIA HOMBRES " + edadMediaHombres);

        System.out.println("ARRAY DE MUJERES \n" + mujeres);

//mostrar por cada persona cuÃ¡ntas personas tienen su misma edad
//mostrar ordenado para cada edad distinta presente, cuantas personas tienen esa edad
        System.out.println("PARA ESTUDIAR 3)");

        personas.stream().forEach(p -> personas.stream().forEach(w -> {

            if (!w.nombre.equals(p.nombre)) {
                if (w.edad == p.edad) {
                    System.out.println(w.nombre + " tiene la altura igual " + p.nombre);
                }
            }

        })
        );

//siguiendo un poco el anterior. Crear un mapa para cada edad como clave una lista de las personas con esa edad como value
//mostrar por cada persona como serÃ­a la media de peso si no se contara a esa persona para calcular 
//la media. Esto es, como influye la persona en la media total
        System.out.println("PRACTICA3.2");

//HashMap<Integer,List<Persona>> r = new HashMap<>();
        personas.stream()
                /*
        .peek(p -> {
       
      List<Persona> e =  personas.stream().filter(q -> q.edad == p.edad).collect(Collectors.toList());
        r.put(p.edad, e);
    
        })*/
                .forEach(p -> {

                    personas.stream().map(q -> q.peso).mapToDouble(q -> {
                        double res = 0;
                        if (q == p.peso) {

                        } else {
                            res = q;

                        }

                        return res;

                    }).average().ifPresent(q -> System.out.println("la media sin   " + p.nombre + " es " + q));

                });

//obtener la diferencia de peso menor entre dos personas cualesquiera del array. Esto es por ejemplo, si hay dos personas
//del array con el mismo peso, entonces devolverÃ­a cero
        System.out.println("PARA ESTUDIAR 3.5");

        personas.stream()
                .map(p -> p.peso)
                .mapToDouble(p -> {

                    double res = personas.stream().map(q -> q.peso).mapToDouble(q -> Math.abs(p - q)).min().getAsDouble();
                    return res;

                }).findFirst().ifPresent(System.out::println);

//Por cada persona generar tres pesos aleatorios que estÃ©n entre +-5 respecto al peso de la persona
//mostrar todos los pesos generados y calcular la media de esos pesos. Si los nÃºmeros aleatorios
//estÃ¡n bien generados esa media no debiera diferir mucho del peso medio de las personas del array
//( crear un arraylist con los tres pesos generados para volcarlo todo en el stream es una opciÃ³n a considerar )
        System.out.println("PARA ESTUDIAR 4)");

        personas.stream().forEach(p -> {
            Random rnd1 = new Random();

            System.out.println("los peso de " + p.nombre + " con peso " + p.peso + " son :");
            int sum = 0;
            double arr1[] = new double[3];
            for (int i = 0; i < arr1.length; i++) {
                int num = (rnd1.nextInt(10 - 5) - 5);
                arr1[i] = p.peso - num;
                System.out.println(arr1[i]);
                sum += arr1[i];

            }
            System.out.println("con media : " + sum / arr1.length);

        });

    }

    /*
    
     */
    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Prueba3 {

    static void pruebita(Object n) {
        System.out.println(n);
    }

    static int pruebito(Object a, Object b) {
        return 1;
    }
}
