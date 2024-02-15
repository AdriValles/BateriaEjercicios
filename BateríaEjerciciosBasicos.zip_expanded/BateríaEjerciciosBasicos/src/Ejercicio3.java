import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {

		String n = JOptionPane.showInputDialog("Introduce un numero para saber si es primo o no.");
		int num = Integer.parseInt(n);
		int contador=0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contador++;
			}
		}
		if(contador==2) {
			JOptionPane.showMessageDialog(null, "SI es primo");;
		}else {
			JOptionPane.showMessageDialog(null, "NO es primo");;
		}

	}
}