package ejercicio15;
import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el peso de la esfera A: ");
        int pesoA = scanner.nextInt();
        System.out.print("Ingrese el peso de la esfera B: ");
        int pesoB = scanner.nextInt();
        System.out.print("Ingrese el peso de la esfera C: ");
        int pesoC = scanner.nextInt();
        System.out.print("Ingrese el peso de la esfera D: ");
        int pesoD = scanner.nextInt();
        
        
        if (pesoA == pesoB && pesoA == pesoC) {
            if (pesoD > pesoA) {
                System.out.println("La esfera D es la diferente y es de mayor peso");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso");
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            System.out.println("La esfera C es la diferente");
            if (pesoC > pesoA) {
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("Y es de menor peso");
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            System.out.println("La esfera B es la diferente");
            if (pesoB > pesoD) {
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("Y es de menor peso");
            }
        } else {
            System.out.println("La esfera A es la diferente");
            if (pesoA > pesoB) {
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("Y es de menor peso");
            }
        }
    }
}
