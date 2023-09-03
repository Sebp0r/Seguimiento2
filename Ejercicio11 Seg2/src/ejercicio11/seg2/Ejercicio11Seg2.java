
package ejercicio11.seg2;

import java.util.Scanner;

public class Ejercicio11Seg2 {

    public static void main(String[] args) {
        int a,b,c;
        
        System.out.println("Digite el valor de A:");    // Entrada a
        Scanner A = new Scanner(System.in);
        a = A.nextInt();
        
        System.out.println("Digite el valor de B:");    // Entrada b
        Scanner B = new Scanner(System.in);
        b = B.nextInt();
        
        System.out.println("Digite el valor de C:");    // Entrada c
        Scanner C = new Scanner(System.in);
        c = C.nextInt();
        
        if (a>b && a>c){
            System.out.println("A es el numero mayor");
        }
        
        else if (b>a && b>c) {
            System.out.println("B es el numero mayor");
        }
        
        else if (c>a && c>b){
            System.out.println("C es el numero mayor");
        }
        else{
            System.out.println("Hay numeros repetidos");
        }
    }
    
}
