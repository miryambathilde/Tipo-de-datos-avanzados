package TiposDeDatosAvanzados;

public class ArrayMultidimensionalInt {
    public static void main(String[] args) {

        // DECLARAMOS ARRAY MULTIDIMENSIONAL DE ENTEROS
        // [], por cada dimension, en este caso el primero equivale al numero de filas y el segundo las columnas
        /**
         * BIDIMENSIONALES: Se suelen usar para hacer ASOCIACIONES
         * TRIDIMENSIONALES: Se suelen usar para MATRICES MATEMATICAS
         */

        // array de 2 FILAS x 4 COLUMNAS
        int arrayBidimensional[][]= {
                {1, 2, 3, 4},
                {10, 20, 30, 40}
        };

        // AHORA VAMOS A RECORRER EL ARRAY BIDIMENSIONAL
        /**
         * Por cada dimensión que queremos recorrer tenemos que poner un FOR anidado dentro de otro FOR
         **/
        // EL PRIMER FOR: recorre las FILAS
        // EL SEGUNDO FOR: recorre las COLUMNAS

        for (int i = 0; i < arrayBidimensional.length; i++) {
            System.out.println("Valor de I: " + i);

            for (int j = 0; j < arrayBidimensional[1].length; j++) {
                System.out.println("Estoy en I = " + i + ", J = " + j);
            }
        }

    }
}
