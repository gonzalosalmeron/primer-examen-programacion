package ex18gjsr;

import java.util.Scanner;

/**
 *
 * @author Gonzalo José Salmerón Robles
 * 
 * 25/11/2020
 */
public class Ex18gjsr3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double numEntero = 0;
        double comprobacionEntero = 1;
        while (comprobacionEntero != 0){
            System.out.print("Introduzca un número: ");
            numEntero = in.nextDouble();
            
            comprobacionEntero = numEntero % 1;
            if (comprobacionEntero != 0){
                System.out.println("Introduzca un numero entero.");
            }
        }
        int suma = 0;
        while (numEntero > 0){
            suma = suma + (int)(numEntero % 10);
            numEntero /= 10;
        }
        System.out.println("La suma de sus dígitos es " +  suma);
    }
}
