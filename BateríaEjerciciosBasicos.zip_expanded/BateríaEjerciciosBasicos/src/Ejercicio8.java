import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println("Introduce el numero de primos que quieres ver.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 2;
		int contadorN = 0;
		
		System.out.print("Los primeros " + n + " numeros primos son: ");
		while(contadorN<n) {
			if(esPrimo(num)==true) {
				System.out.print(num + " ");
				contadorN++;
			}
			num++;
		}
	}
	
	
	public static boolean esPrimo(int num) {
		int contador=0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contador++;
			}
		}
		if(contador==2) {
			return true;
		}else {
			return false;
		}
		
	}

}
