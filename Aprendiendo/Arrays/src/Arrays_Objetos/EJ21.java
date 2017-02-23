package Arrays_Objetos;
/**
 * Se pretende diseñar una clase llamada temperatura que tiene como atributos privados mes (entero), temperatura media(double)
 * en grados centígrados, Fahrenheit (double) como temperatura pasada a grados Fahrenheit y como miembros públicos:
 * 
 * -Un constructor que recibe como argumento un mes y una temperatura en grados centígrados
 * 
 * Para pasar temperaturas de grados Centígrados a Fahrenheit utilizar la fórmula: F=C*1.8+32;
 * 
 * Desde una función principal declarar un array de objetos temperatura que guarde en cada posición las temperaturas de cada mes, y que permita:
 * 1-Mostrar la temperatura de un mes en grados centígrados y Fahrenheit
 * 2-Mostrar la temperatura media del año
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class EJ21 {
    private static final Scanner sc = new Scanner(System.in);
    private static int tmp;
    private static int[] array_temp = new int[12];
    private static String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    
    public static void main(String[] args) {
        entrada();
        menu();
    }
    
    public static void entrada() {
        for(int i=0;i<array_temp.length;i++) {
            System.out.println("Introduce la temperatura para " + meses[i]);
            array_temp[i] = sc.nextInt();
        }
    }
    
    public static void menu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("1-Mostrar la temperatura de un mes en grados centígrados y Fahrenheit");
            System.out.println("2-Mostrar la temperatura media del año");
            System.out.println("3-Introducir nuevas temperaturas");
            System.out.println("4-Salir");
            
            tmp = sc.nextInt();
            
            switch (tmp) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    salir=true;
                    break;
                default:
                    System.out.println("No corresponde a una opción válida");
                    break;
            }
                
        }
    }
}
