package javaUD6.Ejercicio4;

import java.util.Scanner;

/**@author isabel Calzadilla
 * Ejercicio 4: UD6 - Arrays y m�todos
 * **/
public class Ejercicio4_FactorialApp {

	public static void main(String[] args) {
		/*4)
C r ea una a p li c ac i �n que nos c al c ule el f ac t or i al de un n�me r o p e dido por t ec l ad o l o
r
eal i z a r a media n t e un m � t odo al que l e pa s amos el n�me r o c omo pa r �m e t r o. P a r a c a lc ular
el
f ac t or i al, se m u l t i pl i c a l os n�me r os a n t er i o r es ha s t a l l e g ar a u no. P or ej e mpl o si
i
n t r oduc i mos un 5, r eal i z a r a e s t a op e r ac i �n 5*4 3*2 1=12 0*/ 
		
		Scanner ask = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese n�mero");
		num = ask.nextInt();
		
		System.out.println("El factorial del n�mero es : " + dameFactorial(num));
		
		ask.close();

	}

	public static int dameFactorial(int numero) {
		
		if(numero == 0)
			return 1;
		
		return numero * dameFactorial(numero - 1); // RECURSIVIDAD DE LA FUNCION
	}
}
