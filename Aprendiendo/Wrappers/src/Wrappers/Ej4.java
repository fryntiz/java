package Wrappers;
/**
 * Programa que transforme un número entero, mayor o igual que 0
 * a binario de dos formas diferentes:
 * -Utilizando algún método de la clase Integer
 * -Creando un método que utilice arrays para almacenar los restos y el último cociente
 * 
 * Utilizando Wrappers, crea un programa que pida un número por teclado al usuario
 * en binario y lo transforme a decimal, a hexadecimal y a octal.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class Ej4 {
    private static final Scanner sc = new Scanner(System.in);
    private static int inputDecimal,inputBinario;
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void entradaDecimal() {
        System.out.println("Introduce un número entero decimal");
        inputDecimal = sc.nextInt();
    }
    
    public static void entradaBinario() {
        System.out.println("Introduce un número en binario");
        inputBinario = sc.nextInt();
    }
    
    public static void menu() {
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("0 - Salir");
            System.out.println("1 - Entrada decimal");
            System.out.println("2 - Entrada Binaria");
            System.out.println("3 - Pasar decimal a Binario con método Integer");
            System.out.println("4 - Pasar decimal a Binario con método usando array para almacenar los restos y el último cociente");
            System.out.println("5 - Pasar de binario a decimal");
            System.out.println("6 - Pasar de binario a hexadecimal");
            System.out.println("7 - Pasar de binario a octal");
            
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    entradaDecimal();
                    break;
                case 2:
                    entradaBinario();
                    break;
            }
        }
    }
}
