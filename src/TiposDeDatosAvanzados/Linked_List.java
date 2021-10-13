package TiposDeDatosAvanzados;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        // declaracion de LinkedList a partir de una array list (por eso le pasamos por parámetro la arraylist
        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
        System.out.println(listaEnlazada); // [Elemento A, Elemento B, Elemento C]
    }
}
