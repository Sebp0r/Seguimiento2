package ejercicio13.seg2;

import java.util.Scanner;

/**
 * @author Sebastian
 */
public class Ejercicio13Seg2 {

    public static void main(String[] args) {
        double vc,vf;
        String bolita;
        
        System.out.println("Digite total de su compra:");    // Entrada valor compra
        Scanner vlr = new Scanner(System.in);
        vc = vlr.nextDouble();
        
        System.out.println("Digite el color de la bola que le salio:");    // Entrada color bola
        Scanner color = new Scanner(System.in);
        bolita = color.nextLine();
        
        if ("blanca".equals(bolita)){
            vf=vc;
        }
        
        else if ("verde".equals(bolita)){
            vf=(vc*10)/100;
        }
        
        else if ("amarilla".equals(bolita)){
            vf=(vc*25)/100;
        }
        
        else if ("azul".equals(bolita)){
            vf=(vc*50)/100;
        }
        
        else{
            vf=0;
        }
        
        System.out.println("Con el descuento obtenido, el valor a pagar es: "+vf);
    }
    
}
