import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero base: ")); 
		double expo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero exponente: ")); 
		double potencia= base;
		for(int i=1;i<expo;i++) {
			potencia*=base;
		}
		
		JOptionPane.showMessageDialog(null, potencia);
	
	}

}
