import java.util.Scanner;
import java.util.Random;

public class NumerosAleatorios{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();
		int base = 10;

		int imprime = aleatorios.nextInt(base)+1; 

		System.out.println(imprime);

	}//Fin main

}//Fin class
