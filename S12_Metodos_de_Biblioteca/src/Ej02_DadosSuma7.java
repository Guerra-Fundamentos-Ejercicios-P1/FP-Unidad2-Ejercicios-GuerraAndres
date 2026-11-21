/*
  Sesion: S12 - Metodos de biblioteca: Math, Random, Character y String
  Ejercicio 02: Dados que suman 7
  Enunciado: lanzar dos dados 1000 veces con Random; mostrar cuantas veces suman 7 y el porcentaje.
  Autor: Guerra Andres
  Fecha: 20/11/2026
 */
import java.util.Locale;
import java.util.Random;   // Random si requiere import

public class Ej02_DadosSuma7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //  usamos semilla fija 42, para que la salida sea siempre la misma y se pueda
        // comparar. Quita el 42 (new Random()) para resultados distintos en cada ejecución.
        Random azar = new Random(42);

        final int LANZAMIENTOS = 1000;   // la constante es: cuantas veces lanzar
        int contador7 = 0;               // cuantas veces suman 7

        for (int i = 0; i < LANZAMIENTOS; i++) {
            int dado1 = azar.nextInt(6) + 1;   // nextInt(6) da 0..5; +1 -> 1..6
            int dado2 = azar.nextInt(6) + 1;
            if (dado1 + dado2 == 7) {
                contador7++;
            }
        }

        // 100.0 que es decimal evita la division entera, que daria 0.
        double porcentaje = 100.0 * contador7 / LANZAMIENTOS;

        System.out.println("Lanzamientos: " + LANZAMIENTOS);
        System.out.println("Veces que suman 7: " + contador7);
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje);
        // aqui 6 de las 36 combinaciones suman 7 -> 16.67 % aprox.
    }
}

