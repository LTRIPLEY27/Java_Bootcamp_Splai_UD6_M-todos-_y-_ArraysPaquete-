package javaUD6.Ejercicio5;

import java.util.Scanner;

/**@author isabel Calzadilla
 * Ejercicio 5: UD6 - Arrays y m�todos
 * **/
public class Ejercicio5_Decimal_a_BinarioApp {

	public static void main(String[] args) {
		/*5)
C r ea una a pl i c a ci �n que nos c o n vie r t a un n �me r o en b ase dec i mal a bina ri o. E s t o l o
r
eal i z a r a un m � t odo al que le pa s a r emos el nume r o c omo pa r �me t r o d e v o l v e r � u n St ri ng
c
on el nume r o c o n v ert i do a b i nari o P a r a c o n v ert i r un nume r o d e ci mal a b i nari o d e b e mos
div
i dir e n t r e 2 el nume r o y el r e s ul t ado de e s a div i si�n se divide e n t r e 2 de n u ev o ha s t a q ue
no
se pue d a div i dir ma s el r e st o q u e o b t e n g amos de c ada div i si�n f orma r a e l nume r o
bina
ri o de abajo a arr i ba.*/

		Scanner ask = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese n�mero");
		num = ask.nextInt();
		
		convierteaBinario(num);
		
	}

	public static void convierteaBinario(int num){
        int[] binario = new int[35]; // ARRAY QUE ALMACENAR� EL RESULTADO
        int sumaResto = 0;
 
        while (num > 0) {// VERIFICA QUE EL N�MERO SEA POSITIVO PARA EVALUAR
            binario[sumaResto++] = num % 2; // SUMA EL RESTO DE LA DIVISION DEL N�UMERO
            num = num / 2;
        }
 
        printBinary(binario, sumaResto);// encapsula al otro m�todo
    }
	
	
	 public static void printBinary(int[] binario, int sumaResto) {
	        for (int i = sumaResto - 1; i >= 0; i--) { //RECORRE LAS POSICIONES DE LA SUMA DEL RESTO
	            System.out.print(binario[i] + "");
	    }
	 }
}
