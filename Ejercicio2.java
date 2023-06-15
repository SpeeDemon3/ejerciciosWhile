package ejerciciosWhile;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio2 {

	/*
	 * EJERCICIO 2
	 * Calcular la potencia de 2 elevado a 8
	 */
	public static void main(String[] args) {
		// Variable para controlar el bucle
		boolean control = true;
		
		float number2 = 2;
		
		// Mientras control sea true
		while(control) {
			// Multiplico el valor por el valor
			number2 *= number2;
			// Cuando el resultado sea el correcto
			if (number2 == Math.pow(2,8)) {
				// Cambio el valor de la variable para salir del bucle
				control = false;
			}
		}
		
		System.out.println("La potencia de 2 elevado a 8 es: " + number2);
		
		System.out.println(Math.pow(2, 8));
		
	}

}
