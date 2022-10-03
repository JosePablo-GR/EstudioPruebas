import java.util.Scanner;

public class CalculadoraPerimetro {
    
    public static void main(String[] args) {

        // Declaración de variables.
        Scanner lector;
        String nombre;
        short lados;
        double longitud, perimetro;

        // Creamos el Scanner.
        lector = new Scanner(System.in);

        // Mensaje inicial del programa.
        out.println("Este programa calcula el perimetro de figuras geométricas regulares.");

        // Pedimos el nombre del usuario.
        out.println("Ingresa tu nombre:");
        nombre = lector.nextLine();

        // Ahora pedimos el número de lados.
        System.out.println("Ingresa el número de lados:");
        lados = lector.nextShort();

        // Ahora pedimos la longitud de cada lado.
        System.out.println("Ingresa la longitud de cada lado:");
        longitud = lector.nextDouble();

        // Calcula el perímetro de la figura geométrica regular.
        perimetro = lados * longitud;

        // Ahora juntamos toda la información del usuario.
        System.out.println("Hola, " + nombre + " :)\n" +
            "Ingresaste " + lados + " lados de " + longitud + " de longitud.\n" +
            "El perímetro de tu figura es " + perimetro + "."
        );

        // Cerramos el Scanner.
        lector.close();

    } // Fin main.

} // Fin clase
