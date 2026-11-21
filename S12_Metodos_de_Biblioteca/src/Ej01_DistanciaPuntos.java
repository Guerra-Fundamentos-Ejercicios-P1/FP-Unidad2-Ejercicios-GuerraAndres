/*
  Sesion: S12 - Metodos de biblioteca: Math, Random, Character y String
  Ejercicio 01: Distancia entre dos puntos
 Enunciado: calcular la distancia entre dos puntos usando Math.sqrt y Math.pow.
 Autor: Guerra Andres
  Fecha: 20/11/2026
 */
import java.util.Locale;

public class Ej01_DistanciaPuntos {

    // Formula: d = raiz( (x2 - x1)^2 + (y2 - y1)^2 )
    static double distancia(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;                 //  diferencia en x
        double dy = y2 - y1;                 //  diferencia en y
        // aqui ocupamos Math.pow(base, exponente) eleva al cuadrado cada una.
        double suma = Math.pow(dx, 2) + Math.pow(dy, 2);
        // PASO 4: Math.sqrt saca la raiz cuadrada y No requiere import porque Math esta en java.lang.
        return Math.sqrt(suma);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);   // punto decimal
        System.out.printf("Distancia (0,0) a (3,4):   %.2f%n",
                distancia(0, 0, 3, 4));
        System.out.printf("Distancia (1,2) a (4,6):   %.2f%n",
                distancia(1, 2, 4, 6));
        System.out.printf("Distancia (0,0) a (1,1):   %.2f%n",
                distancia(0, 0, 1, 1));
    }
}

