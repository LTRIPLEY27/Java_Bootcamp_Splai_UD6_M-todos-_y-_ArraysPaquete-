package javaUD6.Ejercicio9;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 9: UD6 - Arrays y m�todos
 * **/
public class Ejercicio9_Array_SumaApp {

	public static void main(String[] args) {
		/*9)
C r ea un ar r a y de n � me r os d onde l e i nd i c amos por t ec l ado el t am a �o d el ar r a y
r
el l e n a r emos el ar r a y c on n�me r os ale a t or i os e n t r e 0 y 9 . A l f i nal mu e s t r a p or pan t al l a el
v
a l or de c ada p osi c i �n y l a suma de t odos l o s v a l o r e s*/ 
		
		crearArrayDimension();// M�TODO PARA INICIAR PROGRAMA
		
	}

	public static void crearArrayDimension() {// M�TODO PARA CREAR LA DIMENSI�N DEL ARRAY
		int dimensionArray;
		String askDimension = JOptionPane.showInputDialog("Ingrese cu�ntos valores desea almacenar");
		dimensionArray = Integer.parseInt(askDimension);
		int [] arrayNumbers = new int[dimensionArray];
		
		llenadoArray(arrayNumbers);
	}
	
	public static void llenadoArray(int [] arrayNumbers) {// LLENADO DEL ARRAY CON LOS VALORES RANDOM DE 0 A 9

		for(int i= 0; i < arrayNumbers.length; i++) {
			arrayNumbers[i] = (int) (Math.random() * 9);
		}
		
		imprimeArray(arrayNumbers);// LLAMADO A LOS M�TODOS
		sumaArray(arrayNumbers);
	}
	
	public static void imprimeArray(int [] arrayNumbers) {// M�TODO PARA IMPRIMIR EL ARRAY
		System.out.println("El array dispone de los siguientes �ndices : " );
		for(int i = 0; i < arrayNumbers.length; i++ ) {
			System.out.println("�ndice = " + i + "  valor = " + arrayNumbers[i] );
		}
	}
	
	public static void sumaArray(int [] arrayNumbers) {// M�TOO PARA SUMAR EL ARRAY
		int sumaTotal = 0;
		for(int suma : arrayNumbers) {
			sumaTotal += suma;
		}
		System.out.println("La suma del array es " +  sumaTotal);
	}
}
