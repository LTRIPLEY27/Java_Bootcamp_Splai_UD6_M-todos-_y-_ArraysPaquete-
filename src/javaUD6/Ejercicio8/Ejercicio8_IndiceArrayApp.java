package javaUD6.Ejercicio8;
/**@author isabel Calzadilla
 * Ejercicio 8: UD6 - Arrays y m�todos
 * **/

import javax.swing.*;
public class Ejercicio8_IndiceArrayApp {

	public static void main(String[] args) {
		/*8)
C r ea un ar r a y de 10 po s ici on e s de n � me r os c on v alo r es p e didos p or t ec l ado. Mue s t r a p or
c
onsola el i ndi c e y el v a l or al que c o r r e s ponde. H az dos m � t odos, uno pa r a r el l enar v a l o r es y
ot
r o p a r a mo s t r a r*/ 

		rellenaValorres();// DISPARA LOS M�TODOS DESDE EL VOID
	}

	public static void rellenaValorres() {// M�TODO DE LLENADO DEL ARRAY
		
		int [] numerosArray = new int[3]; 
		
		for(int i = 0; i < numerosArray.length; i++) {
			String respuesta = JOptionPane.showInputDialog("Ingrese valor : " + i);
			numerosArray[i] = Integer.parseInt(respuesta);
		}
		retornaValorArray(numerosArray);// ANIDAMIENTO DEL M�TODO DE IMPRESI�N
	}
	
	public static void retornaValorArray(int [] numerosArray) {// M�TODO DE IMPRESION DEL ARRAY
		System.out.println("El array est� compuesto por los siguentes valores: ");
		for(int i = 0; i < numerosArray.length; i++) {
			System.out.println("indice = " + i + " valor = " + numerosArray[i]);
		}
	}
}
