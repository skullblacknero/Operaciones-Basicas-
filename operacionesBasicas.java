/* Este codigo ha sido generado por el modulo psexport 20180802-mac de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "OPERACIONESBASICAS.java."

import java.io.*;

public class operacionesbasicas {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		int x;
		System.out.println("Escribe dos numeros");
		a = Double.parseDouble(bufEntrada.readLine());
		b = Double.parseDouble(bufEntrada.readLine());
		x = 0;
		while (x!=5) {
			System.out.println("Elige una opcion ");
			System.out.println("1 = suma");
			System.out.println("2 = resta");
			System.out.println("3 = multiplicacion ");
			System.out.println("4 = division");
			System.out.println("5 = salir");
			x = Integer.parseInt(bufEntrada.readLine());
			System.out.println(" Gonzalez Piñon Oscar Zair N.L 17");
			switch (x) {
			case 1:
				System.out.println("La suma de "+a+" + "+b+" = "+a+b);
				System.out.println(" Gonzalez Piñon Oscar Zair N.L 17");
				break;
			case 2:
				System.out.println("La resta de "+a+" - "+b+" = "+a-b);
				System.out.println(" Gonzalez Piñon Oscar Zair N.L 17");
				break;
			case 3:
				System.out.println("La multiplicacion de "+a+" x "+b+" = "+a*b);
				System.out.println(" Gonzalez Piñon Oscar Zair N.L 17");
				break;
			case 4:
				System.out.println("La division de "+a+" / "+b+" = "+a/b);
				System.out.println(" Gonzalez Piñon Oscar Zair N.L 17");
				break;
			default:
				x = 5;
			}
		}
	}


}

