/*
  Sesion: S11 - ambito de las variables
  Ejercicio 03: Traza de un contador static llamado desde un for
  Enunciado: programa y, en un comentario, la tabla linea  variables vivas, valor.
  Autor: Guerra Andres  Fecha: 20/11/2026
 */
public class Ej03_TrazaContadorStatic {

    static int contador = 0;           // static: va a estar en toda la ejecución

    static void registrar() {
        contador++;                    //  va a suma 1 al contador compartido
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { // 'i' pertenece al bloque 
            registrar();               // cada vuelta suma  1 al contador
            System.out.println("Vuelta " + i + " -> contador = " + contador);
        }
        System.out.println("Contador final = " + contador);
    }
}

