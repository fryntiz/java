package Arrays_Multidimensionales;
/**
 * Realiza un programa que sea capaz de rotar todos lo elementos de una matriz 
 * cuadrada una posición en el sentido de las agujas del reloj.
 * La matriz debe tener 12 filas por 12 columnas y debe contener números generados
 * al azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz 
 * resultado, ambas con los números convenientemente alineados.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */



/*****************************************************************************
    EJERCICIO NO TERMINADO no entiendo que se tiene que hacer exactamente
*****************************************************************************/


import java.util.Random;
public class EJ31 {
    static Random rd = new Random();
    private static int filas=12,columnas=12;
    private static int[][] matriz= new int[filas][columnas];
    public static void main(String[] args) {
        generar();
        mostrarOriginal();
        System.out.println("\n\n\n"); //Espaciado entre arrays
        rotar();
        mostrarRotado();    
    }
    
    public static void generar() {
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j] = rd.nextInt(1001);
                if ((matriz[i][j]<0) | (matriz[i][j]>1000)) {j--;} //Comprueba número válido (0-100)
            }
        }
    }
    
    public static void rotar() {
        //Este método hace rotar como si fuera un reloj el array
        
        int aux,x,i=0,j=0;
        
        for(i=0;i<filas;i++){
            aux = matriz[j][i];
            for(j=0;j<columnas;j++){
                /////REVISARE AQUI --> Intento conseguir desplazar una fila sin perder el primero
                aux = matriz[j+1][i+1];
                matriz[+1][i+1] = matriz[j][i];
            }
        }
        //tener en cuenta longitud de array/filas/columnas ya que se deslazan entre estos
    }
    
    public static void mostrarOriginal() {
        //Muestra Array original
        for(int i=0;i<filas;i++){
            System.out.println("\n");
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]+"\t");
            }
        }
    }
    
    public static void mostrarRotado() {
        //Muestra Array rotado
        for(int i=0;i<filas;i++){
            System.out.println("\n");
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]+"\t");
            }
        }
    }
}
