/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 04: Sobrecarga del método perimetro
 * Enunciado: perimetro(double lado) para el cuadrado y
 *            perimetro(double a, double b) para el rectángulo.
 * Autor: Guerra Andres
 * Fecha: 20/11/2026
 */
import java.util.Locale;

public class Ej04_SobrecargaPerimetro {

    //  un parámetro -> cuadrado. Perímetro = 4 * lado.
    static double perimetro(double lado) {
        return 4 * lado;
    }

    //  dos parámetros -> rectángulo. Perímetro = 2 * (a + b).
    // Mismo nombre, distinta lista de parámetros = Sobregarga
    static double perimetro(double a, double b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // El compilador decide cuál versión llamar por el NÚMERO de
        // argumentos: 1 argumento -> versión 1; 2 argumentos -> versión 2.
        System.out.printf("Perimetro del cuadrado (lado 4):       %.2f%n",
                perimetro(4));
        System.out.printf("Perimetro del rectangulo (base 4, 2.5): %.2f%n",
                perimetro(4, 2.5));
    }
}

/*
 * ¿cómo sabe Java cuál perimetro usar?
 * El compilador mira cuántos argumentos tiene la llamada: con uno elige la
 * versión del cuadrado y con dos la del rectángulo. Eso es sobrecarga:
 * mismo nombre, distinta lista de parámetros. El tipo de retorno solo no
 * alcanza para diferenciar dos métodos.
 *
 * SALIDA REAL:
 *   Perimetro del cuadrado (lado 4):       16.00
 *   Perimetro del rectangulo (base 4, 2.5): 13.00
 */