package EntradaYSalida;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada_Salida {
    public static void main(String[] args) {
        // FLAG
        boolean ok = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete dos números: ");
            scanner.reset();
            try {
               int a = scanner.nextInt();
               int b = scanner.nextInt();
               ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Números no válidos");
            }
        } while(!ok);
    }
}
