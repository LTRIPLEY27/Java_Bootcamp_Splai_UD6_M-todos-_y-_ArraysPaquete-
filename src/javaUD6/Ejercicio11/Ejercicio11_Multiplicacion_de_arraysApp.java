package javaUD6.Ejercicio11;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 11: UD6 - Arrays y m�todos
 * **/
public class Ejercicio11_Multiplicacion_de_arraysApp {

	public static void main(String[] args) {
		/*11)
C r ea dos ar r a y s de n�me r os c on la dimensi�n pa s ad a por t ec l ado.
Uno
de e ll os e s t a r � r el l ena d o c on n�m e r os ale a t o ri os y el o t r o apu n t a r a al ar r a y an t erio r
reasigna los valores del segundo array con valores aleatorios
Des
p u � s, c r ea un m � t odo que t e n g a c omo pa r �me t r os, l os d os ar r a y s y devu e l v a uno nu ev o
c
on l a mult i pl i c ac i �n de l a p osi ci �n 0 d e l ar r a y1 c on el d e l ar r a y2 y a s � s ucesi v am e n t e.
P
or �l t i m o mue s t r a el c o n t enido de c ada ar r a y*/ 
		
		dimensionArrays();
	}

	public static void dimensionArrays() {
		String askArrayA = JOptionPane.showInputDialog("Indique la dimensi�n del array 1");
		
		int arrayAdimension = Integer.parseInt(askArrayA);
		
		int [] arrayA = new int [arrayAdimension];
		int [] arrayB = new int [arrayAdimension];
		
		rellenaArrayRandom(arrayA, arrayB);
	}
	
	public static void rellenaArrayRandom(int [] arrayA, int [] arrayB) {
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) (Math.random() * (1 + 500) + 1);
			for(int j = 0; j < arrayB.length; j++) {
				arrayB[j] = (int) (Math.random() * (1 + 100) + 1);
			}
		}
		
		multiplicaArrays(arrayA, arrayB);
	}
	
	public static void multiplicaArrays(int [] arrayA, int [] arrayB) {
		//int [][] arraysMultiplicados = new int [arrayA.length][arrayB.length];// CREACION DE LA MATRIZ QUE RECIBE A AMBOS PAR�METROS
		int [] multiplicacionArray = new int [arrayA.length];
		for(int i = 0; i < arrayA.length; i++) {
			multiplicacionArray[i] = arrayA[i] * arrayB[i];
		}
		
		imprimeArrays(arrayA, arrayB, multiplicacionArray);
	}
	
	public static void imprimeArrays(int [] arrayA, int [] arrayB, int [] multiplicacionArray) {
		System.out.println("Los arrays resultantes son: ");
		System.out.println("Array  1: ");
		
		for(int valoresA : arrayA) {
			System.out.println("Array  1: " + valoresA);
		}
		
		System.out.println("Array  2: ");
		
		for(int valoresB : arrayB) {
			System.out.println("Array  B: " + valoresB);
		}
		
		System.out.println("La multiplicaci�n de los �ndices de ambos : ");
		
		for(int multiplicacionArrays : multiplicacionArray) {
			System.out.println("multiplicacion : " + multiplicacionArrays);
		}
	}
}
