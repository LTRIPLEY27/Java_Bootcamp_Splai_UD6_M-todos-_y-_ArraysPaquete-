package javaUD6.Ejercicio6;

import java.util.Scanner;

/**@author isabel Calzadilla
 * Ejercicio 6: UD6 - Arrays y métodos
 * **/
public class Ejercicio6_CuentaCifrasApp {

	public static void main(String[] args) {
		/*6)
Crea una aplicación que nos cuente el número de cifras de un número entero positivo
(hay que contr o l ar l o) p e dido por t ec l ado. C r ea un m é t odo q ue r eal ic e e s t a ac ci ón, pa s an d o
el
núme r o por pa r áme t r o d e v o l v e r á e l n ú me r o de c i f r a s*/

		Scanner ask = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese número");
		num = ask.nextInt();
		
		verificaCifras(num);
		
		ask.close();
	}
	
	public static void verificaCifras(int num) {
		String number = "";
		if(num > 0) {
			number = String.valueOf(num);
		} else {
			System.out.println("No es un entero positivo");
		}
		
		dameCifras(number);
	}
	
	public static void dameCifras(String number) {
		System.out.println("El número de cifras  es: " + number.length());
	}
}
