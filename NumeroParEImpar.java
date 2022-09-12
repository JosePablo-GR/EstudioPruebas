// Importa las clases necesarias.
import java.util.Scanner;

/**
 * Clase NumeroParEImpar.java
 * Programa que nos dice si un número es par.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Marzo 2020.
 */
public class NumeroParEImpar {

    /**
     * Método main (el cual es el punto inicial de la JVM para comenzar con la
     * ejecución de un programa de Java).
     */
    public static void main(String[] args) {

        // Declaración de variables.
        long numero;
        Scanner lector;
        
        // Creamos el Scanner.
        lector = new Scanner(System.in);

        // Mensaje donde pedimos el número.
        System.out.println("Escribe un número entero:");
        
        // Guardamos el número a evaluar.
        numero = lector.nextLong();

        // Mensaje parcial del resultado que se continuará enseguida.
        System.out.print("El número " + numero + " ");

        //Si el residuo es 0, entonces es par.
        if(numero % 2 == 0) {
            System.out.println("es par.");
        } else {
            System.out.println("es impar.");
        }

        // Esta instrucción que contiene solamente una instrucción se puede 
        // escribir sin llaves pero es recomendable ponerlas siempre.
        // if(numero % 2 == 0)
        //     System.out.println("es par.");
        // else
        //     System.out.println("es impar.");
        

        // Cerramos el Scanner.
        lector.close();

    } // Fin main.

} // Fin NumeroParEImpar.