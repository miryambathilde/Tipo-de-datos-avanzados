package TiposDeDatosAvanzados;

public class StringMetodosYPropiedades {
    public static void main(String[] args) {
        String cadena = "Mensaje DE TEXTo";

        // RECORRER UN STRING - BUCLE FOR + CHARTAT()
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }

        // METODOS Y PROPIEDADES DE STRING - CADENAS //

        int cadenaLog = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadena.length());

        String cadenaMinuscula = cadena.toLowerCase();
        System.out.println("La cadena ahora está en minúscula: " + cadenaMinuscula);

        String cadenaMayuscula = cadena.toUpperCase();
        System.out.println("La cadena ahora está en mayúscula: " + cadenaMayuscula);

        char letra = cadena.charAt(4);
        System.out.println("Caracter es: " + letra);

        boolean resultado = cadena.startsWith("Men");
        if(resultado){
            System.out.println("Empieza por lo que estoy buscando: Men");
        }
        else {
            System.out.println("No empieza por lo que quiero");
        }

        boolean resultado1 = cadena.endsWith("a");
        if(resultado1){
            System.out.println("Acaba por lo que estoy buscando: a");
        }
        else {
            System.out.println("No acaba con lo que quiero");
        }

    }
    }
