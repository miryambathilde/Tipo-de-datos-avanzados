package TiposDeDatosAvanzados;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        // Capacidad ArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");
        lista.add("Elemento D");

        System.out.println("Contenido: " + lista);

        // remove
        lista.remove("Elemento D"); // o tambien se puede por el indice: lista.remove(2);
        System.out.println("Contenido después de remove: " + lista);

        // convertir un arrayList en array, sin conocer los datos Y RECORRER la conversión - toString()
        for (Object arrayObjecto: lista.toArray()){
            System.out.println("Array Objeto contiene: " + arrayObjecto.toString());
        }


        // recorrer arrayList
        for (String elemento : lista){
            System.out.println("for each: " + elemento);
        }

        for (int i = 0; i < lista.size(); i++){
            System.out.println("for: " + lista.get(i));
        }
            
    }


}
