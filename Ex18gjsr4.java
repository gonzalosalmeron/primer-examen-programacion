package ex18gjsr;

import java.util.Scanner;

/**
 *
 * @author Gonzalo José Salmerón Robles
 * 
 * 11/11/2020
 */
public class Ex18gjsr4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la longitud del tallo en milímetros: ");
        long longitudTallo = in.nextLong();
        
        int comprobacion = 0;
        int contador8 = 0;
        int contador7 = 0;
        while (longitudTallo > 0){
            comprobacion = (int) (longitudTallo % 10);
            longitudTallo /= 10;
            if (comprobacion == 8){
                contador8++;
            } else if (comprobacion == 7){
                contador7++;
            }
        }
        if (contador8 > 1 && contador7 < 3){
            System.out.println("Ese girasol es un gran captador");
        } else{
            System.out.println("Ese girasol no es un gran capatador.");
        }
    }
}