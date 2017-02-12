package arrays;
/**
 * Realiza un programa que cree un vector de 100 posiciones con números aleatorios entre 10 y 80.
 * Una vez creado el vector el programa deberá mostrar
 * el mayor, el menor, el que más se repite  y la media
 * @author fryntiz
 */
import java.util.*; //Importo todas las librerías
public class EJ8 {
    static int[] array = new int[100]; //Declaración del array con 100 posiciones
    static Random rd = new Random();
    public static int mayor,menor,repetido,vecesRepetido,media,tmp,tmp1;
    
    public static void main(String[] args) {
        llenarArray();
        ordenarArray();
        sacarExtremos();
        sacarMedia();
        sacarFrecuencia();
        
        System.out.println("\n\nNúmeros Aleatorios:");
        for (int i=0; i<array.length; i++) {
            System.out.print(+ array[i] + ", ");
        }
        System.out.println("\nNúmero menor --> " + menor);
        System.out.println("\nNúmero mayor --> " + mayor);
        System.out.println("\nNúmero/s Más repetido/s --> " + repetido + " se ha repetido " + vecesRepetido + " veces");
        System.out.println("\nMedia de todos los números --> " + media);
    }
    
    public static void llenarArray() { //Generar números aleatorios
        for (int i=0; i<array.length; i++) {
            tmp = rd.nextInt(81);
            if ((tmp>=10) && (tmp<=80)) {
                array[i] = tmp;
            } else {
                i--;
            }
        }
    }
    
    public static void ordenarArray() { //Ordena el array de menor a mayor
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                if (array[i] < array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
    
    public static void sacarExtremos() { //Mete en variable el mayor y menor
        menor = array[0];
        mayor = array[(array.length - 1)];
    }
    
    public static void sacarMedia() { //Obtiene la media
        for (int i=0; i<array.length; i++) { //Recorre el array sumando valores
            media += array[i];
        }
        media /= array.length; //Divide el sumatorio de valores entre los campos
    }
    
    public static void sacarFrecuencia() { //Sacar número más repetido
        int[] frecuencia = new int[array.length];
        //Calcular veces que se repite cada número en el array "frecuencia"
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                if (array[i] == array[j]) {
                    frecuencia[i]++;
                }
            }
        }
        
        //Almacenar la Frecuencia y valor
        int[] arrayTMP1 = array;
 
        for (int i=0; i<frecuencia.length; i++) {
            if (frecuencia[i] > vecesRepetido) {
                repetido = arrayTMP1[i];
                vecesRepetido = frecuencia[i];
            }
        }
        
        //Comparar las veces que se ha repetido para ver si otro número se ha repetido las mismas veces
        
    }
    
    
}