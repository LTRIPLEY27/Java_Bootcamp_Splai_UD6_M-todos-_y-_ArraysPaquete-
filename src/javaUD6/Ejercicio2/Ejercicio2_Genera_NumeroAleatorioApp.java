package javaUD6.Ejercicio2;

import java.util.Scanner;

/**@author isabel Calzadilla
 * Ejercicio 2: UD6 - Arrays y m�todos
 * **/
public class Ejercicio2_Genera_NumeroAleatorioApp {

	public static void main(String[] args) {
		/*2)
C
r ea una a p li c ac i �n que nos g e n e r e u na c a n t i dad de n � me r os e n t e r os ale a t or i os q ue
no
s ot r os l e pa s a r emos por t ec l ado. C r ea un m � t odo d onde pa s amos c omo pa r �me t r os e n t r e
que
n�me r os que r emos que los gen e r e, pod e mos p e di rl as por t ec l ado a n t es de g e n e r ar l os
n�me
r os. E s t e m � t odo d e v o l v e r � u n n �m e r o e n t e r o ale a t or i o. Mu e s t r a e s t os n�me r os p or
pa
n t a ll a.*/
		Scanner ask = new Scanner(System.in);
		
		int total, valorA, valorB;
		int numerosAleatorios [];
		
		System.out.println("Ingrese el n�mero de valores");
		total = ask.nextInt();
		
		System.out.println("Ingrese el n�mero de rango m�nimo");
		valorA = ask.nextInt();
		
		System.out.println("Ingrese el n�mero de rango m�ximo");
		valorB= ask.nextInt();
		
		numerosAleatorios = generaNumeros(total, valorA, valorB);// ADQUIERE EL VALOR DEL M�TODO generaNumeros
		imprimeNumeros(numerosAleatorios);// IMPRIME EL RESULTADO
		
		ask.close();
	}

	
	public static int [] generaNumeros(int cantNumero, int valueA, int valueB) {
		
		int cantidad[] = new int [cantNumero];
		int num1 = valueA, num2 = valueB;
		
		for(int i = 0; i < cantidad.length; i++) {
			cantidad[i] = (int) (Math.random() * (num1-(num2+1))+(num2)) ;
		}
		
		return cantidad;
	}
	
	
	
	public static void imprimeNumeros(int [] arraus) {
		for(int aux : arraus) {
			System.out.println("Valor : " + aux);
		}
	}
	
}
