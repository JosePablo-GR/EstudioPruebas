import java.util.Scanner;

public class Potencia{

	public static int integerPower(int base, int exp){

		int potencia = 1;

		for(int i = 1; i <= exp; i++){

			potencia *= base;

		}//Fin for hace potencia

		return potencia;

	}//Fin integerPower

	public static void main(String args []){

		Scanner input = new Scanner(System.in);

		System.out.println("Programa que sirve para calcular la potencia de un número x con base n");
		System.out.println("\nIngresa el número que quieras elevar (base): ");
		int num1 = input.nextInt();

		System.out.println("Ingresa el exponente al que quieras elevar (" + num1 + ")");
		int num2 = input.nextInt();

		int resul = integerPower(num1, num2);

		System.out.println();
		System.out.println(num1 + " a la potencia " + num2 + " es: " + resul);

	}//Fin main

}//Fin class
