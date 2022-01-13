package javaUD6.Ejercicio6;

import java.util.Scanner;

/**@author isabel Calzadilla
 * Ejercicio 6: UD6 - Arrays y m�todos
 * **/
public class Ejercicio6_CuentaCifrasApp {

	public static void main(String[] args) {
		/*6)
Crea una aplicaci�n que nos cuente el n�mero de cifras de un n�mero entero positivo
(hay que contr o l ar l o) p e dido por t ec l ado. C r ea un m � t odo q ue r eal ic e e s t a ac ci �n, pa s an d o
el
n�me r o por pa r �me t r o d e v o l v e r � e l n � me r o de c i f r a s*/

		Scanner ask = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese n�mero");
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
		System.out.println("El n�mero de cifras  es: " + number.length());
	}
}
