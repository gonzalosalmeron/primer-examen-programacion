package ex18gjsr;

import java.util.Scanner;

/**
 *
 * @author Gonzalo José Salmerón Robles
 * 
 * 25/11/2020
 */
public class Ex18gjsr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = in.nextInt();
        
        while (altura < 4){
            System.out.print("Datos incorrectos, la altura deber ser un ");
            System.out.println("número mayor o igual que 4.\n");
            System.out.print("Introduzca la altura de la pirámide: ");
            altura = in.nextInt();
        }
        int piso = 1;
        int espacio = altura -1;
        int linea = 0;
        int espacioEnBlanco = 0;
        int ultimaLinea = 1;
        int contador = 0;
        while (piso <= altura){
            for (int i = 0; i < espacio; i++){
                System.out.print(" ");
            }
            if (piso == altura){
                while (contador != ultimaLinea){
                    System.out.print("*");
                    contador++;
                }
            } else{
                for (int i = 0; i <= linea; i++){
                    if (piso == 1){
                        System.out.print("*");
                    } else{
                        System.out.print("**");
                    }
                }
                if (piso == 2){
                    System.out.print("");
                } else if (piso == altura - 1){
                    System.out.print("*");
                } else{
                    for (int i = 1; i <= espacioEnBlanco; i++){
                    System.out.print(" ");
                    }
                }
                if (piso == 1){
                    System.out.print("");
                } else if (piso == 2){
                    System.out.print("*");
                } else if (piso == 3 ){
                    System.out.print("**");
                } else {
                    espacioEnBlanco++;
                }
            }
            
            System.out.println("");
            piso++;
            espacio--;
            espacioEnBlanco++;
            ultimaLinea += 2;
        }
    }
}