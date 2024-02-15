import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero para calcular su factorial.");
		int num = sc.nextInt();
		int factorial = 1;

		for (int i = 1; i <= num; i++) {

			factorial = factorial * i;
		}

		System.out.println("El numero factorial es: " + factorial);

	}

}
