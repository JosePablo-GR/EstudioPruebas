import java.util.Scanner;

public class NumeroParEImpar {

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

        // Cerramos el Scanner.
        lector.close();

    } // Fin main.

} // Fin clase
