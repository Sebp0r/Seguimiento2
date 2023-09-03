
package ejercicio7.seg2;
import java.util.Scanner;
public class Ejercicio7Seg2 {

    public static void main(String[] args) {
        double A, B;
        
        System.out.println("Digite A: ");
        Scanner a = new Scanner(System.in);
        A = a.nextDouble();
        
        System.out.println("Digite B: ");
        Scanner b = new Scanner(System.in);
        B = b.nextDouble();
        
        if (A>B) {
            System.out.println("A es mayor que B");
        }
        
        else if (A<B) {
            System.out.println("A es menor que B");
        }
        else {
            System.out.println("A es igual que B");
        }
    }
    
}
