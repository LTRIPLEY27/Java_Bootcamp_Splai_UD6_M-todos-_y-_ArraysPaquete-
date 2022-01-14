package javaUD6.Ejercicio12;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 11: UD6 - Arrays y m�todos
 * **/
public class Ejercicio12_Array_NumerosFinalesApp {

	public static void main(String[] args) {
		/*12)
C r ea un ar r a y de n � me r os d e un t am a �o pa s ado por t ec l ad o el ar r a y c o n t e n d r �
n�me
r os a l e a t or i os e n t r e 1 y 300 y mo s t r ar � aq u el l os n�me r os que a c ab e n en un d�gi t o que
no
s ot r os l e i nd i quemos por t ec l ado (deb e s c o n t r o l ar que s e i n t r oduce un nume r o c or r ec t o
e
st os d e b e n g u a r da r se en un n u ev o ar r a y
P
or e j em p l o en un ar r a y d e 10 p o s i c i o ne s l e i nd i c a m os m o s t r ar los n� m e r os a c a b a d os e n 5,
podr�a
s a li r 155, 25, e t c*/ 

		dameDimension();
	}
	
	public static void dameDimension() {// M�TODO QUE INICIA EL PROGRAMA
		String ask = JOptionPane.showInputDialog("Cu�ntos valores desea ? ");
		
		int dimension = Integer.parseInt(ask);
		
		String numSearch = JOptionPane.showInputDialog("Indique el d�gito final a hallar ? ");
		
		int digito = Integer.parseInt(numSearch);
		
		if(digito < 0 || digito > 9) {// VERIFICA QUE SEA UN N�MERO NATURAL Y SE ASEGURA DE SER �NICAMENTE 1 D�GITO
			JOptionPane.showMessageDialog(null, "Indique un n�mero correcto");
		}

		int [] arrayDimension = new int [dimension];
		
		randomArray(arrayDimension, digito);//LLAMADA AL M�TODO CON LOS PAR�METROS A TRABAJAR
	}
	
	public static void randomArray(int [] arrayDimension, int digito) {
		int cont = 0;
		//PRIMER FOR PARA EVALUAR EL N{UMERO DE COINCIDENCIAS
		for(int i = 0; i < arrayDimension.length; i++) {
			arrayDimension[i] = (int) (Math.random() * (1 + 300) + 1);// LLENADO DEL ARRAY CON N�MEROS RANDOM
				if(verificaDigito(arrayDimension[i], digito)) { // VERIFICO CONDICION CON EL M�TODO 
					cont++;
			}
		}
		
		int [] ultimoDigito = new int [cont];// INSTANCIACI�N DEL ARRAY QUE CONTENDR� LOS VALORES COINCIDENTES
		
			for(int i = 0; i < arrayDimension.length; i++) {//SEGUNDO RECORRIDO PARA ALMACENAR LOS VALORES COINCIDENTES EN EL ARRAY NUEVO
				if(verificaDigito(arrayDimension[i], digito)) {
					ultimoDigito[ultimoDigito.length - cont] = arrayDimension[i];// LA EXTENSI�N VA EN DECRECI�N DEL CONTADOR Y ADJUNTANDO LOS N�MEROS COINCIDENTES
				}
			}
		
		imprimeArrays(arrayDimension, ultimoDigito, digito);// LLAMADA AL M�TODO DE IMPRESI�N DE LOS VALORES

	}
	
	public static boolean verificaDigito(int num, int digito) {// M�TODO QUE VERIFICA SI EL D�GITO ES O NO COINCIDENTE CON EL PAR�METRO DISPUESTO POR TECLADO
		if(num % 10 == digito) { // VERIFICO CONDICION, EL RESIDUO DE UN N�MERO DIVIDIDO ENTRE 10 NOS ARROJA EL �LTIMO VALOR
			return true;
		}
		
		return false;
	}

	//M�TODO DE IMPRESI�N DE LOS ARRAYS
	public static void imprimeArrays(int [] arrayDimension, int [] ultimoDigito, int digito) {
		System.out.println("El d�gito a hallar en la colecci�n es : " + digito);
		System.out.println("\nEl array de n�meros al azar entre 300 y 100 es: ");
		
		for(int numero : arrayDimension) {
			System.out.println("Valor = " + numero);
		}
		
			System.out.println("El array con n�meros que contienen el �ltimo d�gito son: ");
		
		for(int numero : ultimoDigito) {
			System.out.println("\nValor = " + numero);
		}

	}
}
