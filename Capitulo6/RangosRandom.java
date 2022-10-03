import java.util.Random;

public class RangosRandom{

	//Ejercicio 6.12

	public static void main(String args []){

		Random rand = new Random();


		int n = rand.nextInt(2)+1;

		int m = rand.nextInt(100)+1;

		int o = rand.nextInt(10);

		int p = rand.nextInt(112)+1*1000;

		int q = rand.nextInt(3)-1;

		int r = rand.nextInt(15)-3;

		System.out.println();
		System.out.println("a) 1 <= *" + n + "* <= 2");
		System.out.println("b) 1 <= *" + m + "* <= 100");
		System.out.println("c) 0 <= *" + o + "* <= 9");
		System.out.println("d) 1000 <= *" + p + "* <= 1112");
		System.out.println("e) -1 <= *" + q + "* <= 1");
		System.out.println("f) -3 <= *" + r + "* <= 11");


	}//Fin main

}//Fin class
