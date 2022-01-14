package javaUD6.Ejercicio10;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 9: UD6 - Arrays y métodos
 * **/
public class Ejercicio10_Array_busca_NumerosPrimosApp {

	public static void main(String[] args) {
		/*10)
C r ea un ar r a y de n ú me r os d e un t am a ño pa s ado por t ec l ad o el ar r a y c o n t e n d r á
núme
r os a l e a t or i os pr i mos e n t r e los n úm e r os d e s ea d os, por úl ti mo nos indi c ar c ual es el
m
a y or de t odos.
H
az un m é t odo p a r a c omp r obar que e l núme r o ale a t or i o es pr i m o pue d es h a c er t odos l o
m
é t odos que n e c e s i t e s*/
		dimensionArray();

	}

	public static void dimensionArray() {
		
		String ask = JOptionPane.showInputDialog("Indique la dimensión del array que desee ");
		int dimension = Integer.parseInt(ask);
		int [] arrayPrimos = new int [dimension];	
		generaArrayPrimos(arrayPrimos);
	}
	
	public static void generaArrayPrimos(int [] arrayPrimos) {

		for(int i = 0; i < arrayPrimos.length; i++) {
			arrayPrimos[i] = (int) (Math.random() * (1 + 1000) + 1);
			if(isPrime(i)) {// VERIFICA CON EL BOOLEAN SI EL NÚMERO RANDOM ES O NO PRIMO
				arrayPrimos[i] = i;
			}
		}
		
		imprimePrimos(arrayPrimos);
		primoMayor(arrayPrimos);
	}
	
	public static void imprimePrimos(int [] arrayPrimos) {// IMPRIME EL ARRAY DE PRIMOS
		System.out.println("El array de primos es : " );
		for(int primo : arrayPrimos) {
			System.out.println("Primo : " + primo);
		}
	}
	
	public static boolean isPrime(int n) {// MÉTODO PARA VERIFICAR SI U NÚMERO ES O NO PRIMO
	   
	    if (n % 2 == 0) return false;
	  
	    for(int i = 3; i * i <= n; i += 2) {
	        if(n % i == 0)
	            return false;
	    }
	    return true;
	}
	
	public static void primoMayor(int [] arrayPrimos) {// MÉTODO PARA HALLAR EL NÚMERO MAYOR DEL ARRAY
		int mayor = arrayPrimos[0];
		for(int num : arrayPrimos) {
			if(num > mayor) {
				mayor = num;
			}
		}
		
		System.out.println("El número primo mayor es : " + mayor);
	}
}
