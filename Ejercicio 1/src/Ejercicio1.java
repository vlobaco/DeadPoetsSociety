import java.util.Scanner;

public class Ejercicio1 {
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Ejercicio1 e1= new Ejercicio1();
		e1.run();
	}
	
	void run() {
		int option = 0;
		do {
			System.out.println(
					"Elija una de las opciones\n"
					+ "1. Pasar de kg a lbs\n"
					+ "2. Pasar de lbs a kg\n"
					+ "3. Salir");
			if (in.hasNextInt()) {
				option = in.nextInt();
				switch (option) {
					case 1:
						transform("kg", "lbs", 2.2);
						break;
					case 2:
						transform("lbs", "kg", 1/2.2);
				}
			} else {
				System.out.println("Las opciones disponibles son 1, 2 ó 3.");
			}
		} while (option != 3);
		System.out.println("Hasta la próxima");
		in.close();
	}
	
	void transform(String from, String to, double factor) {
		Double fuente = 0.;
		while (fuente == 0.) {
			System.out.println("Introduzca la cantidad de " + from);
			if (in.hasNextDouble()) {
				fuente = in.nextDouble();
			}
		}
		System.out.println(fuente + " " + from + " equivalen a " + fuente * factor + " " + to + "\n\n");
	}

}
