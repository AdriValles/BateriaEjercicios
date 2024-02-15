import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		String f = JOptionPane.showInputDialog("Introduce una palabra o frase.");
		//System.out.println(f.length());
		String izquierda="";
		String derecha="";
		
		for(int i=0;i<f.length();i++) {
			izquierda=String.valueOf(f.charAt(i));
		}
		for(int i=f.length()-1;i>=0;i--) {
			derecha=String.valueOf(f.charAt(i));
		}

		if(izquierda.equalsIgnoreCase(derecha)) {
			
			JOptionPane.showMessageDialog(null, "SI es un palíndromo");
		}else {
			JOptionPane.showMessageDialog(null, "NO es un palíndromo");
		}
	}

}
