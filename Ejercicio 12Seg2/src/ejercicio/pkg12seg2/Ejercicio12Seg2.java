
package ejercicio.pkg12seg2;

import java.util.Scanner;

public class Ejercicio12Seg2 {

    public static void main(String[] args) {
        String nombre;
        int horas,ph, pago;
        
        System.out.println("Digite el nombre del empleado:");    // Entrada nombre
        Scanner Name = new Scanner(System.in);
        nombre = Name.next();
        
        System.out.println("Digite la cantidad de horas trabajadas:");    // Entrada horas
        Scanner Hr = new Scanner(System.in);
        horas = Hr.nextInt();
        
        System.out.println("Digite el pago por hora:");    // Entrada pago por hora
        Scanner vlr = new Scanner(System.in);
        ph = vlr.nextInt();
        
        if (horas<=40){
            pago=ph*horas;
        }
        
        else if(horas>40 && horas<=48){
            pago=(ph*40)+((ph*2)*(horas-40));
        }
        
        else{
           pago=(ph*40)+((ph*2)*(8))+((ph*3)*(horas-48)); 
        }
        
        System.out.println("El empleado: "+nombre);
        System.out.println("Recibio un pago de: "+ pago+ " por "+horas+" trabajadas.");
            
    }
    
}
