package arrays;
/**
 * Realiza un programa que cree un vector de 100 posiciones
 * con números aleatorios entre 1 y 100. Una vez creado el vector se ordenará este
 * y mostrar los números entre 1 y 100 que no han sido almacenados.
 * @author fryntiz
 */
import java.util.*; //Añado todas las librerías

public class EJ9 {
    static Random rd = new Random();
    static int[] array = new int[100]; //Creo array de 100 posiciones
    static int[] frecuencia = new int[array.length]; //Array con la frecuencia
    static int tmp;
    
    public static void main(String[] args) {
        generarNumeros();
        ordenar();
        frecuencia();
        mostrar();
    }
    
    public static void generarNumeros() { //Llena el array de números aleatorios
        for(int i=0; i<array.length; i++) {
            tmp = rd.nextInt(101);
            if ((tmp<101) && (tmp>0)) {
                array[i] = tmp;
            } else {
                i--;
            }
        }
    }
    
    public static void ordenar() { //Ordenar el array de menor a mayor
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                if (array[i]<array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    
    public static void frecuencia() { //Comprueba la frecuencia de cada valor
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                if (array[i] == array[j]) {
                    frecuencia[i]++;
                }
            }
        }
    }
    
    public static void mostrar() { //Dibuja el array por pantalla
        //Muestra el array ordenado
        System.out.println("Array ordenado:");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        
        //Muestra la frecuencia
        System.out.println("\nFrecuencia:");
        for(int i=0; i<frecuencia.length; i++) {
            System.out.print(frecuencia[i] + ", ");
        }
        
        System.out.println("\nLos números no almacenados son:");
        for(int i=0; i<frecuencia.length; i++) {
            for(int j=0; j<frecuencia.length; j++) {
                if (array[j] == i){
                    tmp = i; //meto el valor de "i" en la variable si está en el array
                }
            }
            if (tmp != i) {
                //Si no está en el array, el valor de "tmp" será distinto a "i"
                System.out.print(i + ", "); //Dibujo "i" si es distinta a i
            }
        }
    }
}