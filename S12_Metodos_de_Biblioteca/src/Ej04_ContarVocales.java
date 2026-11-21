/*
  Sesion: S12 - Metodos de biblioteca: Math, Random, Character y String
  Ejercicio 04: Contar vocales
  Enunciado: contar las vocales de una frase usando String y Character,contando mayusculas y minusculas.
  Autor: Guerra Andres
  Fecha: 20/11/2026
 */
public class Ej04_ContarVocales {

    public static void main(String[] args) {
        String frase = "Programacion en Java es Divertida y Util";
        // Todas las vocales que buscamos, en minuscula y mayuscula.
        String vocales = "aeiouAEIOU";

        int minusculas = 0;   // variable de vocales en minuscula
        int mayusculas = 0;   // variable de vocales en mayuscula

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);   // Paso 1: tomar el caracter i
            // Paso 2: ocupamos indexOf que devuelve la posicion de c dentro de "vocales" o -1 si no esta. Si es >= 0, c es una vocal.
            if (vocales.indexOf(c) >= 0) {
                // Paso 3:Ocupamos Character.isUpperCase separa mayuscula de minuscula
                if (Character.isUpperCase(c)) {
                    mayusculas++;
                } else {
                    minusculas++;
                }
            }
        }

        System.out.println("Frase: " + frase);
        System.out.println("Vocales minusculas: " + minusculas);
        System.out.println("Vocales mayusculas: " + mayusculas);
        System.out.println("Total de vocales: " + (minusculas + mayusculas));
    }
}

/*
  como se cuentan las vocales?
  indexOf devuelve la posicion de c en "aeiouAEIOU" o -1 si no esta, y Character.isUpperCase decide si suma a mayusculas o minusculas. En lafrase hay 14 minusculas y 1 mayuscula (la U de Util): 15 en total.

 */