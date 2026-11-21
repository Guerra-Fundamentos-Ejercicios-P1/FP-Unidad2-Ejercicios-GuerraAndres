/*
 * Sesión: S10 - Argumentos y parámetros: paso por valor
 * Ejercicio 01: Intercambiar dos primitivos
 * Enunciado: escribir intercambiar(int a, int b) e intentar intercambiar
 *            dos variables de main. ¿Funciona? Explicar.
 * Autor:Guerra Andres 
 * Fecha: 20/11/2026
 */
public class Ej01_IntercambiarPrimitivos {

    // PASO 1: 'a' y 'b' son conocidos como parametros que son variables de la firma del método
    // Java los llena con una COPIA de los valores que envía main.
    static void intercambiar(int a, int b) {
        int temp = a;   //  guardamos a en una variable auxiliar
        a = b;          // aqui a recibe el valor de b 
        b = temp;       // en esta parte b recibe el valor viejo de a 
        // en esta parte el intercambio sí ocurrió:
        System.out.println("Dentro de intercambiar: a = " + a + ", b = " + b);
    }   // al cerrar esta llave, a, b y temp desaparecen

    public static void main(String[] args) {
        int x = 10;     // es una variable local de main
        int y = 20;     // otra variable local de main
        System.out.println("Antes:   x = " + x + ", y = " + y);

        // Ahora lo son x e y, y java envía copias de 10 y de 20.
        intercambiar(x, y);

        // x e y siguen iguales porque el método solo cambió sus copias.
        System.out.println("Despues: x = " + x + ", y = " + y);
    }
}

/* ¿funciona? ¿por qué?
NO funciona. Java siempre pasa por valor: al llamar a intercambiar(x, y)
se copian los valores 10 y 20 en los parámetros a y b. El método
intercambia esas copias y las destruye al terminar; las variables x e y
de main nunca se tocan, por eso siguen valiendo 10 y 20.
Un primitivo (int, double, char...) no se puede modificar desde otro
método. Soluciones: devolver el resultado con return o usar un arreglo.
 *
 */