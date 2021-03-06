package Ejercicios;
/**
 * Escribe un programa que lea números enteros y los guarde en un ArrayList
 * hasta que se lea un 0 y muestra los números leídos, su suma y su media.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import java.util.Scanner;
import java.util.ArrayList; //Importa librería de arrayList

public class Ej7 {
    private static final Scanner sc = new Scanner(System.in);
    private static int suma=0;
    private static double media=0;
    private static ArrayList<Integer> m = new ArrayList();
    
    public static void main(String[] args) {
        entrada();
        suma();
        media();
        System.out.println("\n\n" + m.toString());
        System.out.println("\n\nLongitud del ArrayList --> " + m.size());
        System.out.println("\n\nLa suma es --> " + suma);
        System.out.println("\n\nLa media es --> " + media);
    }
    
    public static void entrada() {
        //Método que lee los números introducido hasta que se introduzca 0
        System.out.println("Introduce los valores (0 termina)");
        boolean terminar = false;
        int tmp;
        while (!terminar) {
            System.out.println("\nIntroduce otro valor:");
            tmp = sc.nextInt();
            if(tmp == 0){ //Si el valor introducido es 0 termina
                terminar = true;
                break;
            }
            m.add(tmp);
        }
        
    }
    
    public static void suma() {
        for (int i = 0; i < m.size();i++) {
            suma += m.get(i);
        }
    }
    
    public static void media() {
        double tmp1 = suma, tmp2 = m.size();
        media = (tmp1/tmp2);
    }
}
