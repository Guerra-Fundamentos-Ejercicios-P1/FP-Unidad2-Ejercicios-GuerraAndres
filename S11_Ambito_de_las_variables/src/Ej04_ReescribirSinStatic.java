/*
  Sesion: S11 - Ambito de las variables
  Ejercicio 04: Reescribir un programa sin atributos static
 Enunciado: mostrar la version original comentada con 3 atributos a static y la nueva que use en parametros y return.
  Autor: Apellido Nombre
  Fecha: 20/11/2026
 */

/* Primera Version: 

public class Original {
    static double precio = 20.0;      // se le pone a static 1
    static int cantidad = 3;          // y ahora en static 2
    static double total = 0;          // se coloca en static 3

    static void calcularTotal() {
        total = precio * cantidad * 1.15;   // va a leer y escribe atributos
    }

    public static void main(String[] args) {
        calcularTotal();                    // no recibe ni devuelve nada
        System.out.println("Total: " + total);
    }
}
El problema: calcularTotal depende de variables que estan "escondidas" fuera del metodo; cualquier otro metodo podria cambiarlas sin que lo notemos.
*/

//Corregida y nueva  version: 
public class Ej04_ReescribirSinStatic {

    // La constante static final Si ahora logra ser valida se permitira para constantes.
    static final double IVA = 0.15;

    // los datos entran como parametros como precio, cantidad...
    // Aqui el resultado sale con return. Nada se comparte por fuera.
    static double calcularTotal(double precio, int cantidad) {
        double subtotal = precio * cantidad;   // local
        return subtotal * (1 + IVA);
    }

    public static void main(String[] args) {
        // los datos ahora son variables locales de main.
        double precio = 20.0;
        int cantidad = 3;

        // Aqui guardamos lo que devuelve el metodo.
        double total = calcularTotal(precio, cantidad);
        System.out.println("Total: " + total);
    }
}

/*
   ¿que se gano al quitar los static?
  La version nueva recibe sus datos por parametros y entrega el resultado
  con return, asi que cada metodo depende solo de lo que se le envia y
  las variables viven en el ambito mas pequeño. 
 
 */