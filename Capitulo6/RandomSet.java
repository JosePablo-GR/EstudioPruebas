import java.util.Random;

public class RandomSet{

	//Actividad 6.13

	public static void main(String args []){

		Random aleatorios = new Random();

		int uno = aleatorios.nextInt(5)+1;
		int dos = aleatorios.nextInt(9)+2;
		int tres = aleatorios.nextInt(9)+2;

		System.out.println("a) " + uno*2 + " ∈ {2,4,6,8,10}");

		if(dos % 2 ==1){

		System.out.println("b) " + dos + " ∈ {3,5,7,9,11}");

		} else if(dos % 2 == 0) {

		dos++;

		System.out.println("b) " + dos + " ∈ {3,5,7,9,11}");

		}//Fin es impar

		if(tres % 2 == 1){

		System.out.println("c) " + tres*2 + " ∈ {6,10,14,18,22}" );

		} else if(tres % 2 == 0) {

		tres++;

		System.out.println("c) " + tres*2 + " ∈ {6,10,14,18,22}" );

		}//Fin es impar 2

	}//Fin main

}//Fin class
