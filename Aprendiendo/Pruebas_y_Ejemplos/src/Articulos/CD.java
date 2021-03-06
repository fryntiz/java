package Articulos;

/**
 * Clase CD que hereda de la clase artículos, permite crear instancias de CD
 * en la clase "Principal"
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class CD extends Articulo {

    private String artista;
    private int numeroPistas;

    //Constructor para crear CD pasándo título, duración, artista y número de pistas
    //Título y duración invocarán a la clase super (padre) "Articulo"
    public CD(String titulo, int duracion, String artista, int pistas) {
        super(titulo, duracion); //Pasa atributos al constructor
        this.artista = artista;
        numeroPistas = pistas;
    }
    
    //Sobreescribir método "print()"
    @Override
    public void print() {
        System.out.println("\n");
        System.out.println("Soy un CD");
        super.print();
        System.out.println("Artista --> " + artista);
        System.out.println("Número de Pistas --> " + numeroPistas);
    }
}
