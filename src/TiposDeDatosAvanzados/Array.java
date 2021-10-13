package TiposDeDatosAvanzados;

import java.io.PrintStream;

public class Array {
    public static void main(String[] args) {

        // ARRAY DE STRINGS

        // DECLARAMOS E INICIALIZAMOS EL ARRAY
        String nombres[] = {
                "Pepe",
                "Juan",
                "Miryam",
        };

        // PROPIEDAD LENGTH
        System.out.println("Longitud del array: " + nombres.length);

        // MANERAS DE RECORRER UN ARRAY

        // 1. BUCLE FOR EACH - forma corta
        for (String nombre : nombres) {
            System.out.println("Nombre actual con for each: " + nombre);
        }

        // 2. FORMA LARGA: BUCLE FOR INT
        // Tiene la ventaja de que obtenemos el i, el indice o posición dentro del array, ya que usamos el contador con el i

        String ultimoNombre = "";

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre actual con for int: " + nombres[i] + ", en posición: " + i);
            ultimoNombre = nombres[i];
        };

        System.out.println("El último nombre del array es: " + ultimoNombre);

    }
}