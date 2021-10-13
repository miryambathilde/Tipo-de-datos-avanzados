package TiposDeDatosAvanzados;

public class EjemplosArrays {
    public static void main(String[] args) {

        String nombres[] = {"Miryam", "Sergio"};
        // vamos a mutar el array //
        nombres[0] = "Lola";
        nombres[1] = "Oliver";
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
