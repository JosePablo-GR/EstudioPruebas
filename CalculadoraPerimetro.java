// Importa las clases necesarias.
import java.util.Scanner;
import static java.lang.System.*;   // Evita escribir la palabra System.

/**
 * Clase CalculadoraPerimetro.java
 * Programa que calcula el perímetro de una figura.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Febrero 2020.
 * 
 */
public class CalculadoraPerimetro {

    /**
     * Método main (el cual es el punto inicial de la JVM para comenzar con la
     * ejecución de un programa de Java).
     */
    public static void main(String[] args) {

        // Declaración de variables.
        Scanner lector;
        String nombre;
        short lados;
        double longitud, perimetro;

        // Creamos el Scanner.
        lector = new Scanner(in);

        // Mensaje inicial del programa.
        out.println("Calculo el perimetro de figuras geométricas regulares.");

        // Pedimos el nombre del usuario.
        out.println("Ingresa tu nombre:");
        nombre = lector.nextLine();

        // Ahora pedimos el número de lados.
        out.println("Ingresa el número de lados:");
        lados = lector.nextShort();

        // Ahora pedimos la longitud de cada lado.
        out.println("Ingresa la longitud de cada lado:");
        longitud = lector.nextDouble();

        // Calcula el perímetro de la figura geométrica regular.
        perimetro = lados * longitud;

        // Ahora juntamos toda la información del usuario.
        out.println("¡Hola, " + nombre + "! :)\n" +
            "Ingresaste " + lados + " lados de " + longitud + " de longitud.\n" +
            "El perímetro de tu figura es " + perimetro + "."
        );

        // Cerramos el Scanner.
        lector.close();

    } // Fin main.

} // Fin CalculadoraPerimetro.
