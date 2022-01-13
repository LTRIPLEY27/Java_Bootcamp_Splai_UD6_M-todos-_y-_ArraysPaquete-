package javaUD6.Ejercicio7;
/**@author isabel Calzadilla
 * Ejercicio 7: UD6 - Arrays y métodos
 * **/
import java.util.Scanner;
import javax.swing.*;

public class Ejercicio7_CambioMonedaApp {

	public static void main(String[] args) {
		/*7)
C r ea un apl i c ac i ón que nos c o n vier t a una c a n t i dad de e u r os i n t r oduc i da por t ec l ado a ot r a
mon
e da, e s t as pue d en s e r a dola r e s y e n es o li b r a s . El m é t odo t e n d r á c omo pa r áme t r os, l a
c
a n t i dad de e u r os y la mon e da a pa s ar que se r a una c ad e na, e s t e n o d e v o l v e r á ning ú n v alo r
mo
s t r a r a un men s aje i ndi c ando el c ambio v o i d
El
c am b i o de divisas so n
•
•
•
0.86 l
i b r as es un 1
1.28
6 11 $ es un 1
129.852
y e n es es un 1*/ 
				
		iniciPrograma();
	}

		public static void iniciPrograma() {

			String money = JOptionPane.showInputDialog("Indique la cantidad de Euros");
			String eleccion = JOptionPane.showInputDialog("Indique la moneda: dolar, libras o yenes?");
			
			int cantidad = Integer.parseInt(money);
			
			eligeMoneda(eleccion, cantidad);
		}
		
		public static void eligeMoneda(String eleccion, int cantidad) {

			switch(eleccion.toLowerCase()) {
				case "dolar":
					conversionDolar(cantidad);
					break;
				case "libras":
					conversionLibra(cantidad);
					break;
				case "yenes":
					conversionYenes(cantidad);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Debe de elegir una opción válida");
					break;			
			}
			
		}
		
		public static void conversionDolar(int cantidad) {
			double dolar = cantidad * 1.28611 ;
			JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " Euros, son : " + dolar + " $  dolares");
		}
		
		public static void conversionLibra(int cantidad) {
			double libra = cantidad * 0.86;
			JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " Euros, son : " + libra + " Libras");
		}
		
		public static void conversionYenes(int cantidad) {
			double yenes = cantidad * 129.852;
			JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " Euros, son : " + yenes + " Yenes");
		}
		
}
