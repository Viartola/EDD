package fp;
import java.util.*;

public class Calculator {


	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		return x.getClass();
	}


	/*
     * devuelve una lista con los n n?meros de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		if (n < 1)
			return array;
		array.add(1);
		if (n == 1)
			return array;
		array.add(1);
		if (n == 2)
			return array;
		

		for (int i = 2; i < n; i++) {
			array.add(array.get(i - 2) + array.get(i - 1));
		}
		return array;
		
	}

	/*
	 * Escribir todos los n�meros del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		if (step == 0){
			return new int[0];
		}
		
		int[] numeros = new int[(number - 1) / step];
		
		int i = 0;
		
		while (number > step){
			number -= step;
			numeros[i] = number;
			i++;
		}
		return numeros;
		
	}

	/*
	 * M�dulo al que se le pasa un n�mero entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		
		
	}

	/*
	 * Toma como par�metros una cadena de caracteres y devuelve cierto si la cadena resulta ser un pal�ndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		
		
	}

	/*
	 * Pedir un n�mero de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n){
		
	}	
	
	public static String numberToLetter(int n) {
		
		
	}

	/*
	 * este metodo devuelve cierto si el a�o de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		
		
	}

	/*
	 * este metodo devuelve cierto si la fecha es v�lida
	 */
	public static boolean isValidDate(String date) {
		
					
	}

}

