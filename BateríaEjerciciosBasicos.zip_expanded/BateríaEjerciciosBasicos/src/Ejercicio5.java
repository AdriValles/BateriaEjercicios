import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("¿Cuántos números de la secuencia de Fibonacci quieres ver?");
		int n = Integer.parseInt(num);

		int a = 0;
		int b = 1;
		int c = 0;

		if (n == 1) {
			System.out.println(a);
		} else if (n == 2) {
			System.out.print(a + " " +b);
		} else if(n>2) {
			System.out.print(a + " " +b);
			for (int i = 0; i < n-2; i++) {
				
				c = a + b;
				a = b;
				b = c;
				System.out.print(" " + c);
			}

		}

	}
}