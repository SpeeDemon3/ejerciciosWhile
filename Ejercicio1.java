package ejerciciosWhile;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio1 {
	
	/*
	 * EJERCICIO 1
	 * Calcular el factorial de 25
	 */

	public static void main(String[] args) {
		
		int number = 1;
		long factorial = 1;
		
		// Mientras number sea menor o igual a 25
		while(number <= 25) {
			// Multiplicamos la variable factorial por la variable number
			factorial *= number; 
			// Sumamos 1 a la variable number
			number++;

		}
		
		System.out.println("El factorial de 25 es: " + factorial);
	}

}
