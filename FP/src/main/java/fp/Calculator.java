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
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
 		array.add(1);
 		for (int i = 2; i < n; i++) {
 			array.add(array.get(i-2) + array.get(i-1));
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
		
		int[] arrayNumber = new int[(number - 1) / step];
		
		int i = 0;
		
		while (number > step){
			number -= step;
			arrayNumber[i] = number;
			i++;
		}
		return arrayNumber;
		
	}

	/*
	 * M�dulo al que se le pasa un n�mero entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		if (n < 1){
			return null;
		}
		
		int cont = 0;
		
		for (int i = n; i > 0; i--)
			if (n % i == 0){
				cont++;
			}
		
		int factors[] = new int[cont];
		
		for (int i = 1; i <= n; i++)
			if (n % i == 0) {
				cont--;
				factors[cont] = i;
			}

		return factors;
		
	}

	/*
	 * Toma como par�metros una cadena de caracteres y devuelve cierto si la cadena resulta ser un pal�ndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		if (cadena == null) {
			return false;
		}
		cadena = cadena.toLowerCase();
		String limpio = ""; 
		String tildes = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
		String notildes = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
		
		for (int i = 0; i < cadena.length(); i++){
			if (Character.isLetter(cadena.charAt(i))) {
				if (tildes.indexOf(cadena.charAt(i)) != -1) 
					limpio += notildes.charAt(tildes.indexOf(cadena.charAt(i)));
				else
					limpio += cadena.charAt(i);
			}
		}
		
		for (int i = 0; i < limpio.length() / 2; i++){
			if (limpio.charAt(i) != limpio.charAt(limpio.length() - 1 - i))
				return false;
		}
		return true;
	}

	/*
	 * Pedir un n�mero de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n){
		String numero = numberToLetter(n);
		return numero.substring(0, 1).toUpperCase() + numero.substring(1);
	}	
	
	public static String numberToLetter(int n) {
		String[] unidades = new String[] {"cero", "uno", "dos", "tres", "cuatro", 
				"cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce",
				"trece", "catorce", "quince", "dieciséis"};
		String[] decenas1 = {"dieci", "veinti"};
		String[] decenas2 = {"veinte", "treinta", "cuarenta", "cincuenta", 
				"sesenta", "setenta", "ochenta", "noventa"};
		
		if (n < 17)
			return unidades[n];
		
		if ((n % 10) == 0)
			return decenas2[(n / 10) - 2];

		if (n < 30)
			return decenas1[(n / 10) - 1] + unidades[n % 10];
		
		if (n > 99)
			return "Más de dos dígitos";
		
		return decenas2[(n / 10) - 2] + " y " + unidades[n % 10];
		
	}

	/*
	 * este metodo devuelve cierto si el a�o de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		if (!isValidDate(fecha))
			return false;
		return isLeapYear(Integer.parseInt(fecha.substring(6)));
	}
		
	public static boolean isLeapYear(int year) {
		if ((year % 4) != 0)
			return false;
		if (((year % 100) == 0) && ((year % 400) != 0))
			return false;
		return true;
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	
	public static boolean isValidDate(String date) {
		int day, month, year;
		try {
			day = Integer.parseInt(date.substring(0, 2));
			month = Integer.parseInt(date.substring(3, 5));
			year = Integer.parseInt(date.substring(6));
		} catch(NumberFormatException e){
	        return false;
	    }catch(StringIndexOutOfBoundsException e){
	        return false;
	    }
		if ((date.charAt(2) == date.charAt(5)) && ("/.- ".indexOf(date.charAt(2)) != -1))
			if (year > 0)
				if ((month <= 12) && (month > 0)) {
					int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
					if (isLeapYear(year))
						days[1]++;
					if ((day <= days[month - 1]) && (day > 0))
						return true;
				}
		return false;
	}
			
}

