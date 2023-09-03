
package ejercicio18.seg2;
import java.util.Scanner;

public class Ejercicio18Seg2 {

    public static void main(String[] args) {
       int id, horas, valor,sb;
       double pret, ret,sn;
       String nombre;
        
        
        System.out.println("Digite el codigo de empleado:");    // Entrada codigo
        Scanner ID = new Scanner(System.in);
        id = ID.nextInt();
        
        System.out.println("Digite el nombre del empleado:");    // Entrada nombre
        Scanner Name = new Scanner(System.in);
        nombre = Name.next();
        
        System.out.println("Digite las horas trabajadas:");    // Entrada horas
        Scanner Hr = new Scanner(System.in);
        horas = Hr.nextInt();
        
        System.out.println("Digite el valor por hora:");    // Entrada valor hora
        Scanner Vlr = new Scanner(System.in);
        valor = Vlr.nextInt();
        
        System.out.println("Digite el porcentaje de retencion:");    // Entrada porcentaje retencion
        Scanner Prt = new Scanner(System.in);
        pret = Prt.nextDouble();
        
        sb=horas*valor;
        ret=sb * (pret/100); 
        sn=sb-ret;
        
        System.out.println("El empleado "+nombre+" con codigo de empleado "+id+" tiene un salario bruto de "+sb+" y salario neto "+sn);
        
        
        
    }
    
}
