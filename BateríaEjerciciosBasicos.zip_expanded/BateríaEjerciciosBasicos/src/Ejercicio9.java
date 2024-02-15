
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
	
		/*FORMA ANTIGUA
		 * double exam1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota del primer examen")); 
		double exam2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota del segundo examen")); 
		double exam3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota del tercer examen")); 
		
		double media = (exam1 + exam2 + exam3) /3;
		
		System.out.println("La nota media de los 3 examenes es: " + media);*/
		DecimalFormat df = new DecimalFormat("#.00");
		int numeroNotas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de notas del alumno."));
		double sumaNotas = 0;
		
		for(int i=1;i<=numeroNotas;i++) {
			double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Introduce la " + i + "ª nota"));
			sumaNotas+= calificacion;
			
		}
		double promedio = sumaNotas/numeroNotas;
		
		
		JOptionPane.showMessageDialog(null,"El promedio de las notas es: "+ df.format(promedio));
	}

}
