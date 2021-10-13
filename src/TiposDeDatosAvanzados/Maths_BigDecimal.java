package TiposDeDatosAvanzados;

import java.math.BigDecimal;

public class Maths_BigDecimal {
    public static void main(String[] args) {
        /**
         * NUMEROS FINANCIEROS: BigDecimal
         * Pasamos por parametro el numero que queramos(f: float - d: double)
         **/
        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);
        // para MULTIPLICAR: multiply()
        BigDecimal resultadoMultiplicacion = valorA.multiply(valorB);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion.toString());

        // Sumar el BigDecimal "valorA" a "valorB"
        BigDecimal resultadoSuma = valorA.add(valorB);
        System.out.println("Resultado de la suma: " + resultadoSuma.toString());
   }
}
