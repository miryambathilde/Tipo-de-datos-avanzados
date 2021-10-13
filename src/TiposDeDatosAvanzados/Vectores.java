package TiposDeDatosAvanzados;


import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        // declaramos un VECTOR //
        /**
         * Primer parametro: CAPACIDAD INICIAL
         * Segundo parametro: INCREMENTO DE LA CAPACIDAD
         * Una vez se aumenta la capacidad, aunque quitemos elementos del vector, se mantiene esa capacidad ampliada
         */
        Vector<Integer> vector = new Vector(128, 10);

        // PARA AÑADIR DATOS AL VECTOR (add)
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("Datos del vector: " + vector); // Datos del vector: [1, 2, 3]

        // METODO PARA ELIMINAR INDICES DEL VECTOR (remove)
        vector.remove(2);
        System.out.println("Datos del vector: " + vector); // Datos del vector: [1, 2]

        // PROPIEDADES DE LOS VECTORES : TAMAÑO y CAPACIDAD

        // el tamaño es el número de elementos que contiene el vector
        System.out.println("Tamaño del vector: " + vector.size()); // 2

        // la capacidad es el tamaño del array subyacente del vector
        System.out.println("Capacidad del vector: " + vector.capacity()); // 128

        // AHORA VAMOS A COMPARAR VECTORES
        Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);

        Vector<Integer> vector3 = new Vector();
        vector3.add(1);
        vector3.add(3);

        // vector que queremos comparar + equals y le pasamos por parametro el vector con el que lo queremos comparar
        boolean resultado = vector2.equals(vector3);
        System.out.println("Son iguales? " + resultado); // false

        // VAMOS A RECORRER UN VECTOR
        Vector<Integer> vector4 = new Vector(30);
        vector4.add(1);
        vector4.add(2);
        vector4.add(3);
        vector4.add(4);
        vector4.add(5);
        vector4.add(6);
        
        // forma corta: FOR EACH
        for (int i : vector4 ) {
            System.out.println("Valor actual en vector 4: " + i);
        }
        
        // forma larga: FOR - get(i)
        for (int i = 0; i < vector4.size(); i++) {
            System.out.println("El valor del vector 4 es: " + vector4.get(i) + ", en posición " + i);
        }

        /**
         * LOS VECTORES pueden DECRECER hasta el TAMAÑO de sus ELEMENTOS
         **/

        // METODO PARA DECRECER O MINIMIZAR LA MEMORIA DE UN VECTOR - trimToSize (AHORRAR ME MEMORIA)
        Vector<Integer> vector5 = new Vector(16);
        vector5.add(1);
        vector5.add(2);
        vector5.add(3);
        vector5.add(4);

        System.out.println("Capacidad del vector 5: " + vector5.capacity() + ", tamaño: " + vector5.size());

        vector5.trimToSize();
        System.out.println("Capacidad del vector 5 después del TRIM TO SIZE: " + vector5.capacity() + ", tamaño: " + vector5.size());
    }
}
