import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		System.out.println("CADA APUESTA LLEVA UN NUMERO DELANTE QUE SIRVE PARA SELECCIONAR LA APUESTA QUE QUIERES REALIZAR");
		System.out.println("Y LAS APUESTAS SON LAS SIGUIENTES: ");
		System.out.println("1.Apuesta a Rojo");
		System.out.println("2.Apuesta a Negro");
		System.out.println("3.Apuesta a Par");
		System.out.println("4.Apuesta a Impar");
		System.out.println("5.Apuesta a Falta");
		System.out.println("6.Apuesta a Pasa");
		System.out.println("7.Apuesta a Docena");
		System.out.println("8.Apuesta a Columna");
		System.out.println("9.Apuesta a Dos Docenas");
		System.out.println("10.Apuesta a Dos Columnas");
		System.out.println("11.Apuesta a Seisena");
		System.out.println("12.Apuesta a Cuadro");
		System.out.println("13.Apuesta a Transversal");
		System.out.println("14.Apuesta a Caballo");
		System.out.println("15.Apuesta a Pleno");

		int apuesta = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu apuesta"));

		double dinero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero de euros que quieres apostar"));

		int[] rojo = { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 };
		int[] negro = { 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };

		int aleatorio = (int) (Math.random() * 37);
		System.out.println(aleatorio);

		switch (apuesta) {
		case (1):
			System.out.println(esRojo(aleatorio, rojo));
			if (esRojo(aleatorio, rojo) == true) {
				dinero = dinero * 2;
				JOptionPane.showMessageDialog(null, "! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;
		case (2):
			System.out.println(esNegro(aleatorio, negro));
			if (esNegro(aleatorio, negro) == true) {
				dinero = dinero * 2;
				System.out.println("! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;
		case (3):
			System.out.println(esPar(aleatorio));
			if (esPar(aleatorio) == true) {
				dinero = dinero * 2;
				System.out.println("! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;
		case (4):
			System.out.println(esImpar(aleatorio));
			if (esImpar(aleatorio) == true) {
				dinero = dinero * 2;
				System.out.println("! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;
		case (5):
			System.out.println(esFalta(aleatorio));
			if (esFalta(aleatorio) == true) {
				dinero = dinero * 2;
				System.out.println("! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;

		case (6):
			System.out.println(esPasa(aleatorio));
			if (esPasa(aleatorio) == true) {
				dinero = dinero * 2;
				System.out.println("! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;
		case (7):
			int docena = Integer.parseInt(JOptionPane.showInputDialog("Elige entre la docena 1 ó 2 ó 3."));
			System.out.println(esDocena(aleatorio,docena));
			if (esDocena(aleatorio,docena) == true) {
				dinero = dinero * 3;
				System.out.println("! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;
		case (8):
			int columna = Integer.parseInt(JOptionPane.showInputDialog("Elige entre la columna 1 ó 2 ó 3."));
			System.out.println(esColumna(aleatorio,columna));
			if (esColumna(aleatorio,columna) == true) {
				dinero = dinero * 3;
				System.out.println("! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;	
		case (9):
			int docenas = Integer.parseInt(JOptionPane.showInputDialog("Elige 1 para las 2 primeras docenas. \n Elige 2 para las 2 ultimas docenas."));
			System.out.println(dosDocenas(aleatorio,docenas));
			if (dosDocenas(aleatorio,docenas) == true) {
				dinero = dinero * 1.5;
				System.out.println("! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;	
		case (10):
			int columnas = Integer.parseInt(JOptionPane.showInputDialog("Elige 1 para las 2 primeras columnas. \n Elige 2 para las 2 ultimas columnas."));
			System.out.println(dosColumnas(aleatorio,columnas));
			if (dosColumnas(aleatorio,columnas) == true) {
				dinero = dinero * 1.5;
				System.out.println("! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;
		case (15):
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Elige un numero del 0 al 36."));
			System.out.println(esPleno(aleatorio,numero));
			if (esPleno(aleatorio,numero) == true) {
				dinero = dinero * 36;
				System.out.println("! Enhorabuena ahora tienes " + dinero + " € !");
			}
			break;
		
		}

	}

	public static boolean esRojo(int aleatorio, int[] rojo) {
		boolean respuesta = false;
		for (int i = 0; i < rojo.length; i++) {

			if (aleatorio == rojo[i]) {
				respuesta = true;
			}
		}
		return respuesta;

	}

	public static boolean esNegro(int aleatorio, int[] negro) {
		boolean respuesta = false;
		for (int i = 0; i < negro.length; i++) {

			if (aleatorio == negro[i]) {
				respuesta = true;
			}
		}
		return respuesta;

	}

	public static boolean esPar(int aleatorio) {
		boolean respuesta = false;

		if (aleatorio % 2 == 0 && aleatorio != 0) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}

	public static boolean esImpar(int aleatorio) {
		boolean respuesta = false;

		if (aleatorio % 2 != 0 && aleatorio != 0) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}

	public static boolean esFalta(int aleatorio) {
		boolean respuesta = false;

		if (aleatorio >= 1 && aleatorio <= 18) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}

	public static boolean esPasa(int aleatorio) {
		boolean respuesta = false;

		if (aleatorio >= 19 && aleatorio <= 36) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
	
	public static boolean esDocena(int aleatorio, int docena) {
		boolean respuesta = false;
		
		
		switch(docena) {
		case(1):
			if(aleatorio >=1 && aleatorio<=12) {
				respuesta=true;
				
			}else {
				respuesta=false;
			}
			break;
		case(2):
			if(aleatorio>=13 && aleatorio<=24) {
				respuesta=true;
				
			}else {
				respuesta=false;
			}
			break;
		case (3):
			if (aleatorio>=24 && aleatorio<=36) {
				respuesta=true;
				
			}else {
				respuesta=false;
			}
			break;
		}
		return respuesta;
	}
	
	public static boolean esColumna(int aleatorio, int columna) {
		boolean respuesta = false;
		int [] columna1 = {1,4,7,10,13,16,19,22,25,28,31,34};
		int [] columna2 = {2,5,8,11,14,17,20,23,26,29,32,35};
		int [] columna3 = {3,6,9,12,15,18,21,24,27,30,33,36};
		
		switch(columna) {
		case(1):
			for (int i = 0; i < columna1.length; i++) {

				if (aleatorio == columna1[i]) {
					respuesta = true;
				}else {
					respuesta=false;
				}
			}
			break;
		case(2):
			for (int i = 0; i < columna2.length; i++) {

				if (aleatorio == columna2[i]) {
					respuesta = true;
				}else {
					respuesta=false;
				}
			}
			break;
		case (3):
			for (int i = 0; i < columna3.length; i++) {

				if (aleatorio == columna3[i]) {
					respuesta = true;
				}else {
					respuesta=false;
				}
			}
			break;
		}
		return respuesta;
	}
	
	public static boolean dosDocenas(int aleatorio, int docenas) {
		boolean respuesta = false;
		
		
		switch(docenas) {
		case(1):
			if(aleatorio >=1 && aleatorio<=24) {
				respuesta=true;
				
			}else {
				respuesta=false;
			}
			break;
		case(2):
			if(aleatorio>=13 && aleatorio<=36) {
				respuesta=true;
				
			}else {
				respuesta=false;
			}
			break;
		
		}
		return respuesta;
	}
	
	public static boolean dosColumnas(int aleatorio, int columnas) {
		boolean respuesta = false;
		int [] columna1y2 = {1,4,7,10,13,16,19,22,25,28,31,34,2,5,8,11,14,17,20,23,26,29,32,35};
		int [] columna2y3 = {2,5,8,11,14,17,20,23,26,29,32,35,3,6,9,12,15,18,21,24,27,30,33,36};
		//int [] columna3 = {3,6,9,12,15,18,21,24,27,30,33,36};
		
		switch(columnas) {
		case(1):
			for (int i = 0; i < columna1y2.length; i++) {

				if (aleatorio == columna1y2[i]) {
					respuesta = true;
				}else {
					respuesta=false;
				}
			}
			break;
		case(2):
			for (int i = 0; i < columna2y3.length; i++) {

				if (aleatorio == columna2y3[i]) {
					respuesta = true;
				}else {
					respuesta=false;
				}
			}
			break;
		
		}
		return respuesta;
	}
	
	public static boolean esPleno(int aleatorio, int numero) {
		boolean respuesta = false;
		
		return respuesta;
		
		
	}

}
