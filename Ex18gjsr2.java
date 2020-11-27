package ex18gjsr;

import java.util.Scanner;

/**
 *
 * @author Gonzalo José Salmerón Robles
 * 
 * 25/11/2020
 */
public class Ex18gjsr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Venta de entradas Coliseo");
        
        double numEntradas = 0;
        double precioEntradaUnitario = 10;
        double entradasTotal = 0;
        while (numEntradas <= 0){
            System.out.print("Número de entradas: ");
            numEntradas = in.nextDouble();
            
            entradasTotal = numEntradas * 10;
        }
        
        System.out.print("Día de la semana: ");
        String diaSemana = new Scanner(System.in).nextLine();
        
        double comprobacion = 0;
        double entradasImpares = 0;
        double precioUnitario = 10;
        boolean diaSemanaCorrecto = false;
        while (!diaSemanaCorrecto){
            switch (diaSemana){
            case "lunes":
                entradasTotal = numEntradas * 10;
                diaSemanaCorrecto = true;
                break;
            case "martes":
                entradasTotal = numEntradas * 10;
                diaSemanaCorrecto = true;
                break;
            case "miercoles":
                entradasTotal = numEntradas * 8;
                diaSemanaCorrecto = true;
                precioUnitario = 8;
                break;
            case "jueves":
                comprobacion = numEntradas % 2;
                if (comprobacion == 0){
                    entradasTotal = numEntradas * 7.5;
                } else if (comprobacion != 0){
                    entradasTotal = ((numEntradas - 1) * 7.5) + 10;
                }
                diaSemanaCorrecto = true;
                precioUnitario = 15;
                break;
            case "viernes":
                entradasTotal = numEntradas * 10;
                diaSemanaCorrecto = true;
                break;
            case "sabado":
                entradasTotal = numEntradas * 10;
                diaSemanaCorrecto = true;
                break;
            case "domingo":
                entradasTotal = numEntradas * 10;
                diaSemanaCorrecto = true;
                break;
            default:
                System.out.println("Día incorrecto");
                System.out.print("Día de la semana: ");
                diaSemana = new Scanner(System.in).nextLine();
            }
        }
        String tarjetaColiseo = "";
        System.out.print("¿Tiene tarjeta Coliseo? (s/n): ");
        tarjetaColiseo = new Scanner(System.in).nextLine();
        
        double descuento = 0;
        double total = 0;
        switch (tarjetaColiseo){
            case "s":
                descuento = (entradasTotal * 0.10);
                total = entradasTotal - descuento;
                break;
            case "n":
                total = entradasTotal;
                break;
            default:
        }
        System.out.println("");
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        switch (diaSemana){
            case "jueves":
                comprobacion = numEntradas % 2;
                if (comprobacion == 0){
                    System.out.printf("Entradas parejas            %3.0f\n", numEntradas / 2);
                    System.out.println("Precio unitario               15.00 €");
                } else if (comprobacion != 0){
                    System.out.printf("Entradas parejas            %3.0f\n", (numEntradas - 1) / 2);
                    System.out.println("Precio unitario               15.00 €");
                    System.out.println("Entradas indiduales           1");
                    System.out.println("Precio unitario               10.00 €");
                }
                break;
            default:
                System.out.printf("Entradas individuales        %3.0f\n", numEntradas);
                System.out.printf("Precio unitario               %2.2f €\n", precioUnitario);
        }
        System.out.printf("Total                         %2.2f €\n", entradasTotal);
        System.out.printf("Descuento                     %2.2f €\n", descuento);
        System.out.printf("A pagar                       %4.2f €\n", total);
        
    }
}