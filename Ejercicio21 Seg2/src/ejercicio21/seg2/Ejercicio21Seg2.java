
package ejercicio21.seg2;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ejercicio21Seg2 {

    public static void main(String[] args) {
        double lado1, lado2, lado3, perimetro, area, sp;
        DecimalFormat dos=new DecimalFormat("#.00");
        
        System.out.println("Digite el tamaño del lado 1:");    // Entrada tamaño lados
        Scanner A = new Scanner(System.in);
        lado1 = A.nextDouble();
        
        System.out.println("Digite el tamaño del lado 2:");    // Entrada tamaño lados
        Scanner  B= new Scanner(System.in);
        lado2 = B.nextDouble();
        
        System.out.println("Digite el tamaño del lado 3:");    // Entrada tamaño lados
        Scanner C = new Scanner(System.in);
        lado3 = C.nextDouble();
        
        perimetro=lado1+lado2+lado3;
        sp=perimetro/2;
        area=Math.sqrt(sp*(sp-lado1) * (sp-lado2) * (sp-lado3));
        
        System.out.println("El perimetro del triangulo es: "+dos.format(perimetro));
        System.out.println("La semiperimetro del triangulo es: "+dos.format(sp));
        System.out.println("El area del triangulo es: "+dos.format(area));
        
        
        
        
        
    }
    
}
