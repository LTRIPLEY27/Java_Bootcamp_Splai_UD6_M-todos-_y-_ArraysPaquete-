package javaUD6.Ejercicio1;

import java.util.Scanner;

/**@author isabel Calzadilla
 * Ejercicio 1: UD6 - Arrays y m�todos
 * **/
public class Ejercicio1_CalculoAreasApp {

	public static void main(String[] args) {
		/*1)
C r ea una a p li c ac i �n que nos c al c ule el � r ea de un ci r c ul o c ua d r ado o t ri an g ulo. P e d i r emos
que
figu r a qu e r emos c a lc ular su � r ea y s e g �n lo i n t r oduc i do pe d i r � l os v a l o r es necesar i os
pa
r a c al c ular el � r ea. C r ea un m � t odo p or c ada figu r a p a r a c al c ular c ada � r ea, e s t e d ev o l v e r �
un
n�me r o r eal. Mu e s t r a el r e s ul t ado por pan t al l a.
Aq
u � t e m o s t r amos que n e c e s i t a c ada figu r a
�
�
�
Ci
r c u l o r adio^2)* P I
T
riang u l o ::(base al t u r a) 2
Cua
d r ad o l ado * lado*/

		Scanner ask = new Scanner(System.in);
		
		String response, eleccion;
		
		System.out.println("Ingrese el �rea que desea calcular : tri�ngulo, c�rculo o cuadrado");
		eleccion = ask.next();
		
		System.out.println("El �rea de " + eleccion + " es igual a : " + verificaRespuesta(eleccion));
		
		ask.close();
	}
	
	
	//
	public static Double verificaRespuesta(String resp) {
		Scanner ask = new Scanner(System.in);
		int num1, num2;
		double area = 0;
		
		if(resp.toLowerCase().equals("circulo")) {
			System.out.println("Ingrese el radio : ");
			num1 = ask.nextInt();
			area = Math.PI * Math.pow(num1, 2);
		} else if(resp.toLowerCase().equals("cuadrado")) {
			System.out.println("Ingrese la base : ");
			num1 = ask.nextInt();
			System.out.println("Ingrese la altura : ");
			num2 = ask.nextInt();
			area = (num1 * num2) / 2;
		} else if(resp.toLowerCase().equals("triangulo")) {
			System.out.println("Ingrese ladoA : ");
			num1 = ask.nextInt();
			System.out.println("Ingrese ladoB : ");
			num2 = ask.nextInt();
			area = (num1 * num2);
		
		} else {
			System.out.println("ingrese una opcion v�lida");
		}
		
		ask.close();
		return area;
	}
}

