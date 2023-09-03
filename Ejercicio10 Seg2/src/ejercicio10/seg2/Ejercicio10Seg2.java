
package ejercicio10.seg2;

import java.util.Scanner;

public class Ejercicio10Seg2 {
    public static void main(String[] args) {
        int id, patrimonio, estrato, valor;
        String nombre;
       
        
        System.out.println("Digite el numero de inscripcion del estudiante:");    // Entrada numero inscripcion
        Scanner ID = new Scanner(System.in);
        id = ID.nextInt();
        
        System.out.println("Digite el nombre del estudiante:");    // Entrada nombre
        Scanner Name = new Scanner(System.in);
        nombre = Name.next();
        
        System.out.println("Digite el patrimonio del estudiante:");    // Entrada numero inscripcion
        Scanner ptr = new Scanner(System.in);
        patrimonio = ptr.nextInt();
        
        System.out.println("Digite el estrato social del estudiante:");    // Entrada numero inscripcion
        Scanner es = new Scanner(System.in);
        estrato = es.nextInt();
        
        
        if (estrato>3 && patrimonio>2000000){
            valor=50000+((patrimonio*3)/100);
    }
        else {
            valor=50000;
        }
        System.out.println("El estudiante: "+nombre); 
        System.out.println("Con codigo de inscripcion: "+id); 
        System.out.println("Debe pagar por la matricula: "+valor); 
    }
    
}
