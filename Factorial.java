/**
 * Algoritmo para obtener el factorial de un numero
 *
 */

import java.util.Scanner;
import java.math.BigInteger;

class Factorial
{
	/**
	 * Metodo principal del programa
	 *
	 * @param args Vector de datos ingresados por consola
	 */
	public static void main(String[] args)
	{
		// Obtenemos el numero
		System.out.print("Ingrese un numero: ");
		int n = enterData();

		// Obtenemos el factorial
		System.out.println("Factorial de "+n+": "+bigFactorial(n));
	}

	/**
	 * Obtiene el fatorial de un numero dado
	 *
	 * @param n Numero del que se obtendra el factorial
	 * @return Devuelve el factorial de un numero dado
	 */
	public static long factorial(int n)
	{
		long fac = 1;

		if(n >= 2){
			for(int i = 1; i <= n; i++){
				fac *= i;
			}
		}

		return fac;
	}

	/**
	 * Obtiene el fatorial de un numero dado
	 *
	 * @param n Numero del que se obtendra el factorial
	 * @return Devuelve el factorial de un numero dado
	 */
	public static BigInteger bigFactorial(int n)
	{
		// Empezamos la base del factorial
		BigInteger fac = new BigInteger("1");

		// Obtenemos el factorial solo si el numero es mayor o igual a 2
		if(n >= 2){
			// Proceso para obtener el factorial
			for(int i = 1; i <= n; i++){
				// Multiplicamos los numeros
				fac = fac.multiply(new BigInteger(i + ""));
			}
		}

		return fac;
	}

	/**
	 * Obtiene un dato mediante consola
	 *
	 * @return Devuelve el dato obtenido
	 */
	public static int enterData()
	{
		Scanner scan = new Scanner(System.in);
		int n;

		try{
			n = scan.nextInt();

			return n;
		} catch(Exception e) {
			System.out.println("Ingrese un numero");
			return enterData();
		}
	}
}