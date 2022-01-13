package javaUD6.Ejercicio3;

import java.util.Scanner;

/**@author isabel Calzadilla
 * Ejercicio 3: UD6 - Arrays y métodos
 * **/
public class Ejercicio3_NumeroPrimoApp {

	public static void main(String[] args) {
		/*3)
C r ea una a p li c ac i ón que nos pida un n ú me r o por t ec l ado y c on un m é t odo se l o pa s amos
por
pa r áme t r o p a r a q ue nos indique si es o no un núme r o pr i m o d e be de v o l v er tr u e si es
pr
i mo sino f als e
Un núme
r o pr i mo es aqu e l solo pu e de div i di r se e n t r e 1 y si m i smo. P or ej e mpl o 25 no es
pr
i m o y a que 25 es div i sible e n t r e 5, sin e mb a r g o 17 si es pr i mo.*/ 

		Scanner ask = new Scanner(System.in);
		
		int num;
		
		System.out.println("Indique el número a evaluar");
		num = ask.nextInt();
		
		if(evaluaValor(num)) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número NO es primo");
		}
		
		ask.close();
	}

	public static boolean evaluaValor(int numero) {
		
		if(numero % 2 == 0) // VERIFICA SI ES DIVISIBLE ENTRE 2
			return false;
		
		for(int i = 3; i * i <= numero; i+=2) { // VERIFICA SI ES DIVISIBLE CON IMPARES
	        if(numero % i == 0)
	            return false;
	    }
	    return true; // SI NINGUNA CONDICION SE APLICA ES PRIMO
	}
	
	
}
