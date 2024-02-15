import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		String f = JOptionPane.showInputDialog("Introduce una palabra o frase.");
		int contadorVocal=0;
		int contadorConsonante=0;
		for(int i=0;i<f.length();i++) {
			if(f.charAt(i)=='a'||f.charAt(i)=='e'||f.charAt(i)=='i'||f.charAt(i)=='o'||f.charAt(i)=='u'||
					f.charAt(i)=='A'||f.charAt(i)=='E'||f.charAt(i)=='I'||f.charAt(i)=='O'||f.charAt(i)=='U'||
					f.charAt(i)=='á'||f.charAt(i)=='é'||f.charAt(i)=='í'||f.charAt(i)=='ó'||f.charAt(i)=='ú'||
					f.charAt(i)=='Á'||f.charAt(i)=='É'||f.charAt(i)=='Í'||f.charAt(i)=='Ó'||f.charAt(i)=='Ú'||
					f.charAt(i)=='ü') {
				contadorVocal++;	
			}else if(f.charAt(i)=='1'||f.charAt(i)=='2'||f.charAt(i)=='3'||f.charAt(i)=='4'||f.charAt(i)=='5'||
					f.charAt(i)=='6'||f.charAt(i)=='7'||f.charAt(i)=='8'||f.charAt(i)=='9'||f.charAt(i)=='0') {
			}else {
				contadorConsonante++;
			}
		}
		System.out.println("El numero de vocales es: "+ contadorVocal);
		System.out.println("El numero de consonantes es: "+ contadorConsonante);
	
	}

}
