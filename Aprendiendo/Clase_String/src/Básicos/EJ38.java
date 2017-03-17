package Básicos;
/**
 * Leer una cadena y decir las vocales que tiene
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import java.util.Scanner;
public class EJ38 {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Introduce una cadena para contar los carácteres");
        
        String input = sc.nextLine(); //Pide introducir la cadena
        
        System.out.println("La cadena contiene " + input.length() + " caracteres"); //Muestra la cadena y su longitud
    }
}
