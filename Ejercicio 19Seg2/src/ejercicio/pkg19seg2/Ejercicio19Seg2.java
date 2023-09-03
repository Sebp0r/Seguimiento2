
package ejercicio.pkg19seg2;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Ejercicio19Seg2 {

    public static void main(String[] args) {
        double lado, perimetro, area, altura;
        DecimalFormat dos=new DecimalFormat("#.00");
        
        System.out.println("Digite el tamaño de los lados:");    // Entrada tamaño lados
        Scanner Sz = new Scanner(System.in);
        lado = Sz.nextDouble();
        
        perimetro=lado*3;
        altura=(Math.sqrt(3)/2)*lado;
        area=(Math.sqrt(3)/4)*Math.pow(lado, 2);
        
        System.out.println("El perimetro del triangulo es: "+dos.format(perimetro));
        System.out.println("La altura del triangulo es: "+dos.format(altura));
        System.out.println("El area del triangulo es: "+dos.format(area));
        
        
        
        
    }
    
}
