/*
  Sesion: S11 - ambito de las variables
  Ejercicio 02: Lineas que no compilan
  Enunciado: indicar que lineas no compilan y por que (comentadas con //,  con el mensaje del compilador y la causa).
  Autor: Guerra Andres
  Fecha: 20/11/2026
 */
public class Ej02_LineasNoCompilan {

    static int llamadas = 0;

    static int cuadrado(int n) {
        llamadas++;
        int resultado = n * n;   // el resultado es Local de cuadrado.
        return resultado;
    }

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 3; i++) {
            suma += cuadrado(i);
        }

        // Error 1:
        // System.out.println(i);
        //   Lo causa: 'i' es de bloque; existe solo dentro del for y ya se  cerro. La solucion seria : declararla antes del for.

        // Error 2:
        // System.out.println(resultado);
        //   Lo causa: resultado que es local de cuadrado y en este caso main no la ve.
        //   Solucion: devolverla con return.

        // Error 3:
        // int suma = 100;
        //   Causa: suma ya fue declarada arriba en el mismo ambito.
        //   Solucion: cambiar el nombre o solo asignar: suma = 100;

        // Error 4:
        // int total;
        // System.out.println(total);
        //   esto causa: que una local no tiene valor por defecto; hay que asignarle un valor antes de leerla. Su solucion: int total = 0;

        // Error5:
        // // if (suma > 5) { String mensaje = "grande"; }
        // System.out.println(mensaje
        //   Lo causa: Que mensaje es de bloque del if y se usa fuera de el.
        //   Solucion: declararla antes del if.

        // Con todas las lineas de error comentadas, el programa compila:
        System.out.println("Suma de cuadrados: " + suma);
        System.out.println("Llamadas a cuadrado: " + llamadas);
    }
}

/*
   lo que enseñan los cinco errores
  Una variable solo existe entre su declaracion y la llave que cierra su bloque; no puede repetirse en el mismo ambito y una local debe tener
  valor antes de leerse. Con las lineas con error comentadas, el programa compila y funciona
 */