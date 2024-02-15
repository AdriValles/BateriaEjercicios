import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		
		int N = sc.nextInt();
		
		int resultado = 0;
		
		for (int i = 0; i <= N; i ++) {
			
			if(i%2==0) {
				resultado=resultado+i;
			}
		}
		
		System.out.println("la suma de los pares es: " + resultado);

	}

}
