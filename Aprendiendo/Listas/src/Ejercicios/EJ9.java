package Ejercicios;

/**
 * Se pretende hacer una selección de los atletas que van a participar en una
 * prueba de Triatlón. Diseñar para ello una clase llamada Atleta con los
 * atributos: dorsal(int),nombre(String),tiempos(int [3]) Y los métodos: -Un
 * constructor que pide los datos por teclado -Métodos get y set que creas
 * necesarios
 *
 * Una clase carrera con los atributos: -arrayList de atletas Con los métodos:
 * -Un constructor que crea el ArrayList
 *
 * Método necesarios para llevar a cabo las tareas que se piden en el menú
 * repetitivo siguiente: 1 - Añadir un atleta 2 - Listado de atletas con el
 * tiempo total empleado en las 3 pruebas 3 - Borrar todos los atletas cuyo
 * tiempo sea inferior al tiempo medio de todos 4 - Listado de los atletas
 * seleccionados ordenado por tiempo y prueba 5 - Listado de ganadores (Sumando
 * todos los tiempos) 6 - Buscar un Atleta (Por nombre o dorsal) 7 - Salir
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import java.util.Scanner;
import java.util.ArrayList;

public class EJ9 {

    private static final Scanner sc = new Scanner(System.in);
    private static int input;

    //ArrayList de objetos de la clase Atleta
    private static ArrayList<Atleta> a1 = new ArrayList<Atleta>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() { //Menú que muestra las posibles opciones
        boolean salir = false;
        while (!salir) {
            System.out.println("");
            System.out.println("\t*******************************");
            System.out.println("\t******** C A R R E R A ********");
            System.out.println("\t*******************************");
            System.out.println("");
            System.out.println("1 - Añadir un atleta");
            System.out.println("2 - Listado de atletas con el tiempo total empleado en las 3 pruebas");
            System.out.println("3 - Borrar todos los atletas cuyo tiempo sea inferior al tiempo medio de todos");
            System.out.println("4 - Listado de los atletas seleccionados ordenado por tiempo y prueba");
            System.out.println("5 - Listado de ganadores (Sumando todos los tiempos)");
            System.out.println("6 - Buscar un Atleta (Por nombre o dorsal)");
            System.out.println("7 - Salir");

            input = sc.nextInt();
            if ((input >= 1) && (input <= 6)) { //Comprueba entrada válida
                opcion(input); //Pasa opción elegida al método
            } else if (input == 7) { //Rompe el bucle si el valor introducido es 7
                salir = true;
            } else {
                System.out.println("Entrada errónea, vuelve a elegir una opción");
            }
        }
    }

    public static void opcion(int elegida) { //Método que resuelve la opción escogida
        switch (elegida) {
            case 1:
                añadirAtleta();
                break;
            case 2:
                mostrarAtletas();
                break;
            case 3:
                borrarLentos();
                break;
            case 4:
                listarSeleccionados();
                break;
            case 5:
                listarGanadores();
                break;
            case 6:
                buscarAtleta();
                break;
        }
    }

    //Añadir un nuevo Atleta
    public static void añadirAtleta() {
        System.out.println("Introduce el número del dorsal");
        int dorsal = sc.nextInt();

        System.out.println("Introduce el nombre del Atleta");
        String nombre = sc.next();

        System.out.println("Introduce cada uno de los 3 tiempos y pulsa \"ENTER\"");
        int[] tiempos = new int[3];
        tiempos[0] = sc.nextInt();
        tiempos[1] = sc.nextInt();
        tiempos[2] = sc.nextInt();

        Atleta nuevoAtleta = new Atleta(dorsal, nombre, tiempos);
        //Crear objeto
        a1.add(nuevoAtleta);
    }

    //Mostrar todos los Atletas existentes
    public static void mostrarAtletas() {
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
    }

    //Borrar todos los atletas cuyo tiempo sea inferior al tiempo medio de todos
    public static void borrarLentos() {
        //Sacar media total
        int mediaTotal = 0;
        for (int i = 0; i < a1.size(); i++) {
            mediaTotal += a1.get(i).getTiempoTotal();
        }
        mediaTotal /= a1.size(); //Divide el sumatorio entre cantidad de atletas
        System.out.println("La media entre todos los atletas es: " + mediaTotal);

        //Comparar la media total con la de cada atleta y eliminar si es menor
        for (int i = 0; i < a1.size(); i++) {
            if (a1.get(i).getTiempoTotal() < mediaTotal) {
                System.out.println("El Atleta " + a1.get(i).getNombre() + " eliminado por lento (" + a1.get(i).getTiempoTotal() + ")");
                a1.remove(i);
            }
        }
    }

    public static void listarSeleccionados() {
        //¿Cuales son los seleccionados? - Criterios para que lo sean

    }

    //Listar Ganadores sumando todos sus tiempos (menor tiempo es mejor)
    public static void listarGanadores() {
        int oro = 0, plata = 0, bronce = 0; //Guarda la posición del podio por medalla
        for (int i = 0; i < a1.size(); i++) {
            if (a1.get(i).getTiempoTotal() < a1.get(oro).getTiempoTotal()) {
                oro = i;
            }
        }
        for (int i = 0; i < a1.size(); i++) {
            if ((a1.get(i).getTiempoTotal() < a1.get(plata).getTiempoTotal()) && ((a1.get(i).getTiempoTotal() > a1.get(oro).getTiempoTotal()))) {
                plata = i;
            }
        }
        for (int i = 0; i < a1.size(); i++) {
            if ((a1.get(i).getTiempoTotal() < a1.get(bronce).getTiempoTotal()) && ((a1.get(i).getTiempoTotal() > a1.get(plata).getTiempoTotal()))) {
                bronce = i;
            }
        }
        System.out.println("\nEl oro es para: " + a1.get(oro));
        System.out.println("La plata es para: " + a1.get(plata));
        System.out.println("El bronce es para: " + a1.get(bronce));
    }

    //Buscar un Atleta por nombre o dorsal
    public static void buscarAtleta() {
        //Preguntar si se introduce nombre o dorsal
        System.out.println("\n1 - Buscar por Nombre");
        System.out.println("2 - Buscar por dorsal");
        String nombre;
        int dorsal;
        boolean coincide = false;
        input = sc.nextInt();

        //Buscar por nombre
        if (input == 1) {
            System.out.println("Introduce el nombre a buscar a continuación:");
            nombre = sc.next();
            for (int i = 0; i < a1.size(); i++) {
                if (a1.get(i).getNombre() == nombre) {
                    System.out.println(a1.get(i));
                    coincide = true;
                } else if ((i == a1.size()-1) && (coincide == false)) {
                    System.out.println("Ninguna coincidencia encontrada");
                }
            }
        }
        
        //Buscar por dorsal
        if (input == 2) {
            System.out.println("Introduce el número a buscar a continuación:");
            dorsal = sc.nextInt();
            for (int i = 0; i < a1.size(); i++) {
                if (a1.get(i).getDorsal() == dorsal) {
                    System.out.println(a1.get(i));
                    coincide = true;
                } else if ((i == a1.size()-1) && (coincide == false)) {
                    System.out.println("Ninguna coincidencia encontrada");
                }
            }
        }
    }
}


// Lista de fallos hasta el momento
// Buscar por nombre falla (posiblemente método scanner) por dorsal va bien
// 4 - Listado de los atletas seleccionados ordenado por tiempo y prueba