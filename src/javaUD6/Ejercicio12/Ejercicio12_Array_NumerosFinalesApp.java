package javaUD6.Ejercicio12;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 11: UD6 - Arrays y métodos
 * **/
public class Ejercicio12_Array_NumerosFinalesApp {

	public static void main(String[] args) {
		/*12)
C r ea un ar r a y de n ú me r os d e un t am a ño pa s ado por t ec l ad o el ar r a y c o n t e n d r á
núme
r os a l e a t or i os e n t r e 1 y 300 y mo s t r ar á aq u el l os núme r os que a c ab e n en un dígi t o que
no
s ot r os l e i nd i quemos por t ec l ado (deb e s c o n t r o l ar que s e i n t r oduce un nume r o c or r ec t o
e
st os d e b e n g u a r da r se en un n u ev o ar r a y
P
or e j em p l o en un ar r a y d e 10 p o s i c i o ne s l e i nd i c a m os m o s t r ar los nú m e r os a c a b a d os e n 5,
podría
s a li r 155, 25, e t c*/ 

		dameDimension();
	}
	
	public static void dameDimension() {// MÉTODO QUE INICIA EL PROGRAMA
		String ask = JOptionPane.showInputDialog("Cuántos valores desea ? ");
		
		int dimension = Integer.parseInt(ask);
		
		String numSearch = JOptionPane.showInputDialog("Indique el dígito final a hallar ? ");
		
		int digito = Integer.parseInt(numSearch);
		
		if(digito < 0 || digito > 9) {// VERIFICA QUE SEA UN NÚMERO NATURAL Y SE ASEGURA DE SER ÚNICAMENTE 1 DÍGITO
			JOptionPane.showMessageDialog(null, "Indique un número correcto");
		}

		int [] arrayDimension = new int [dimension];
		
		randomArray(arrayDimension, digito);//LLAMADA AL MÉTODO CON LOS PARÁMETROS A TRABAJAR
	}
	
	public static void randomArray(int [] arrayDimension, int digito) {
		int cont = 0;
		//PRIMER FOR PARA EVALUAR EL N{UMERO DE COINCIDENCIAS
		for(int i = 0; i < arrayDimension.length; i++) {
			arrayDimension[i] = (int) (Math.random() * (1 + 300) + 1);// LLENADO DEL ARRAY CON NÚMEROS RANDOM
				if(verificaDigito(arrayDimension[i], digito)) { // VERIFICO CONDICION CON EL MÉTODO 
					cont++;
			}
		}
		
		int [] ultimoDigito = new int [cont];// INSTANCIACIÓN DEL ARRAY QUE CONTENDRÁ LOS VALORES COINCIDENTES
		
			for(int i = 0; i < arrayDimension.length; i++) {//SEGUNDO RECORRIDO PARA ALMACENAR LOS VALORES COINCIDENTES EN EL ARRAY NUEVO
				if(verificaDigito(arrayDimension[i], digito)) {
					ultimoDigito[ultimoDigito.length - cont] = arrayDimension[i];// LA EXTENSIÓN VA EN DECRECIÓN DEL CONTADOR Y ADJUNTANDO LOS NÚMEROS COINCIDENTES
				}
			}
		
		imprimeArrays(arrayDimension, ultimoDigito, digito);// LLAMADA AL MÉTODO DE IMPRESIÓN DE LOS VALORES

	}
	
	public static boolean verificaDigito(int num, int digito) {// MÉTODO QUE VERIFICA SI EL DÍGITO ES O NO COINCIDENTE CON EL PARÁMETRO DISPUESTO POR TECLADO
		if(num % 10 == digito) { // VERIFICO CONDICION, EL RESIDUO DE UN NÚMERO DIVIDIDO ENTRE 10 NOS ARROJA EL ÚLTIMO VALOR
			return true;
		}
		
		return false;
	}

	//MÉTODO DE IMPRESIÓN DE LOS ARRAYS
	public static void imprimeArrays(int [] arrayDimension, int [] ultimoDigito, int digito) {
		System.out.println("El dígito a hallar en la colección es : " + digito);
		System.out.println("\nEl array de números al azar entre 300 y 100 es: ");
		
		for(int numero : arrayDimension) {
			System.out.println("Valor = " + numero);
		}
		
			System.out.println("El array con números que contienen el último dígito son: ");
		
		for(int numero : ultimoDigito) {
			System.out.println("\nValor = " + numero);
		}

	}
}
