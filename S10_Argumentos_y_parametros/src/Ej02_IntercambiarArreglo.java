/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 02: Intercambiar dos posiciones de un arreglo
 * Enunciado: escribir intercambiar(int[] v, int i, int j) que intercambie
 *            dos posiciones del arreglo y ahora si funciona?
 * Autor:Guerra Andres
 * Fecha: 20/11/2026
 */
import java.util.Arrays;

public class Ej02_IntercambiarArreglo {

    // paso 1: en este caso v recibe una copia de la referencia la dirección del
    // arreglo: Ahora copia de la dirección = y en este caso apunta al mismo arreglo en memoria.
    // i y j son ahora las copias de los índices.
    static void intercambiar(int[] v, int i, int j) {
        int temp = v[i];   //  guardamos el valor de la  i
        v[i] = v[j];       //  la i recibe el valor de la j
        v[j] = temp;       //  la j recibe el valor guardado
        // Modificamos elementos del arreglo original, no la copia de la referencia, por eso el cambio es visible fuera del método.
    }

    public static void main(String[] args) {
        int[] datos = {5, 10, 15, 20};
        // Arrays.toString convierte el arreglo en texto para imprimirlo.
        System.out.println("Antes:   " + Arrays.toString(datos));

        intercambiar(datos, 0, 3);   // intercambia a 0 con el 3

        System.out.println("Despues: " + Arrays.toString(datos));
    }
}

/* ¿por qué ahora sí funciona?
 Java sigue pasando por valor, pero aquí el valor que se copia es la referencia  al arreglo, no el arreglo completo. El parámetro v y la
 variable datos de main son dos "flechas" que apuntan al mismo arreglo en el montón. Cuando el método escribe v[i] o v[j], está
 cambiando los elementos de ese único arreglo, así que main hace el cambio.
 Diferencia con Ej01: allí se copiaba un valor primitivo(sin flecha a nada;aquí se copia una flecha que lleva al dato original.
 */