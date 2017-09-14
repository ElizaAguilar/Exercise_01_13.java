/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *
 *
 *
 *
(Álgebra: resolver 2 * 2 ecuaciones lineales) Puedes usar la regla de Cramer para resolver lo siguiente
2 * 2 sistema de ecuación lineal:
ax + by = e x = ed - bf y = afec
cx + dy = f ad - bc ad - bc
Escriba un programa que resuelva la siguiente ecuación y muestre el valor de xey:
3,4x + 50,2y = 44,5
2.1x + .55y = 5.9
 */
package ejercicio01_13;

/**
 *
 * @author user
 */
public class Ejercicio01_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x +  .55y =  5.9");
		System.out.println("x = (44.5 * .55) - (50.2 * 5.9)");
		System.out.println("    ----------------------------");
		System.out.println("    (3.4  * .55) - (50.2 * 2.1)");
		System.out.println((((44.5 * .55) - (50.2 * 5.9)) / 
                                    ((3.4 * .55) - (50.2 * 2.1))));
		System.out.println(" ");
		System.out.println("y = (3.4 * 5.9) - (44.5 * 2.1)");
		System.out.println("    --------------------------");
		System.out.println("    (3.4 * .55) - (50.2 * 2.1)");
		System.out.println((((3.4 * 5.9) - (44.5 * 2.1)) /
                                    ((3.4 * .55) - (50.2 * 2.1))));
    }
    
}
