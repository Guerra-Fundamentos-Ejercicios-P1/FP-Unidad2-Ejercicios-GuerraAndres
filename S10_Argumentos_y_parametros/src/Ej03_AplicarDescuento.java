/*
 Sesión: S10 - Argumentos y parámetros: paso por valor
 Ejercicio 03: Aplicar un descuento a todo un arreglo de precios
 Enunciado: aplicarDescuento(double[] precios, double pct) que modifique todo el arreglo; imprimirlo antes y después.
 Autor: Guerra Andres
 Fecha: 20/11/2026
*/
import java.util.Arrays;
import java.util.Locale;

public class Ej03_AplicarDescuento {

    //  precios es la copia de la referencia: apunta al arreglo de main.
    //ptces es el porcentaje de descuento  10 ahora significa 10%
    static void aplicarDescuento(double[] precios, double pct) {
        // recorremos todas las posiciones, 0 length- 1.
        for (int i = 0; i < precios.length; i++) {
            // paso2 nuero precio es: precio * (1 - pct/100).
            // Con pct = 10 queda precio * 0.90 (se paga el 90 %).
            precios[i] = precios[i] * (1 - pct / 100);
        }
        // No hay return: el arreglo original ya quedó modificado.
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);   // punto decimal
        double[] precios = {100.0, 50.0, 20.0, 80.0};

        System.out.println("Antes:   " + Arrays.toString(precios));

        aplicarDescuento(precios, 10);   // 10 % de descuento

        System.out.println("Despues: " + Arrays.toString(precios));
    }
}
/*
 *  ¿por qué el arreglo cambió sin usar return?
 aplicarDescuento recibe una copia de la referencia  al arreglo, no una
 copia de todos los precios. Por eso v[i] dentro del método modifica los
  mismos elementos que ve main, y el despues muestra los precios rebajados.
 */