package Arrays_Objetos;
/**
 * Diseñar una clase llamada Alumno con los atributos privados "nombre alumno" y "array con las 5 notas enteras de ese alumno"
 * Crear los siguientes métodos públicos:
 * -Un constructor que dimensiona el array e inicialice los atributos con los valores introducidos por teclado
 * -Un método llamado mayor que devuelve la mejor nota
 * -Otro método llamado menor que devuelve la menor de las notas
 * -Mostrar que muestre el nombre del alumno, en mayúsculas, seguido de su nota media
 * 
 * Desde la clase principal declarar un objeto de tipo alumno y probar los métodos de la clase.
 * 
 * @author fryntiz
 */
import java.util.*;
public class EJ18 {
    private static String a,b;
    private static int[] notas = new int[5];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el nombre del alumno:");
        a = sc.nextLine();
        
        for(int i=0;i<notas.length;i++) {
            System.out.println("Introduce la nota --> " + (i+1));
            notas[i] = sc.nextInt();
        }
        alumno nombreAlumno = new alumno(a,notas);
        nombreAlumno.mayor();
        nombreAlumno.menor();
        nombreAlumno.mostrar();
    }
}
