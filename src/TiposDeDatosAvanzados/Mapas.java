package TiposDeDatosAvanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();

        /* PUT: para añadir datos al mapa **/
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        System.out.println(mapa);
        // OUTPUT: {clave3=30, clave2=20, clave1=10}

        /* GET: Conseguir un valor del mapa - pasamos por parametro la clave **/
        System.out.println(mapa.get("clave2"));
        // OUTPUT: 20

        /* REPLACE: REEMPLAZAR UN VALOR EXISTENTE **/
        mapa.replace("clave3", 40);
        System.out.println(mapa);
        // OUTPUT: {clave3=40, clave2=20, clave1=10}

        /* REMOVE: ELIMINAR VALORES **/
        mapa.remove("clave2");
        System.out.println(mapa);
        // OUTPUT: {clave3=40, clave1=10}

        /* ENTRY y ENTRYSET: RECORRER UN MAP PARA ITERAR **/
        // 1. debemos declarar una variable temporal del tipo Map.Entry (llamada elemento en este caso)
        // 2. y a la variable temporal, le tenemos que asignar el entrySet()
        // 3. Cada uno de los elemento del entrySet(), guardados en la variable temporal elemento, del tipo Map.Entry
        // 4. Se le asigna tanto la clave como el valor y para acceder a ellos usamos: getKey()) y getValue()) respectivamente
        for (Map.Entry elemento : mapa.entrySet()){
            System.out.println("La clave del elemento es: " + elemento.getKey());
            System.out.println("El valor del elemento es: " + elemento.getValue());
        }

        /* OUTPUT:
         * La clave del elemento es: clave3
         El valor del elemento es: 40
         La clave del elemento es: clave1
         El valor del elemento es: 10 **/
    }
}
