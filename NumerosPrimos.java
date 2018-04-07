/**
 * Algoritmo para determinar si un numero es primo
 *
 */

import java.util.Scanner;

class NumerosPrimos
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

		// Verificamos si es primo
		if(isPrime(n)) System.out.println("Es primo");
		else System.out.println("No es primo");
	}

	/**
	 * Verifica si un numero dado es primo o no
	 *
	 * @param n Numero a verificar
	 * @return Devuelve un valor true si el numero es primo
	 */
	public static boolean isPrime(int n)
	{
		// Verificamos si es multiplo de 2
		if(n % 2 == 0) return false;

		// Recorremos todos los numeros impares
		for(int i = 3; i*i <= n; i+=2){
			if(n % i == 0) return false;
		}

		return true;
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