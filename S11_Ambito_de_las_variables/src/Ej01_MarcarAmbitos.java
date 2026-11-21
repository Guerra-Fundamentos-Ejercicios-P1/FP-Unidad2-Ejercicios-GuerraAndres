/* 
 * Sesion: S11 - ambito de las variables
 * Ejercicio 01: Marcar el ambito de cada variable
 * Enunciado: programa con un comentario en cada variable que indique si
 *            es local, de bloque o static.
 * Autor: Guerra Andres
 * Fecha: 20/11/2026
 */
public class Ej01_MarcarAmbitos{

    // >>>  el ejercicio parte del ejemplo E20_; aqui se amplia con variables propias
    // (Iva, totalllamadas, precioUnitario, mensaje), como pide en la nota.

    static final double IVA = 0.15;   // static: constante de toda la clase
    static int totalLlamadas = 0;     // aqui static: vive toda la ejecucin

    // precio y cantidad son parametros: se comportan como locales.
    static double calcularTotal(double precio, int cantidad) {
        totalLlamadas++;                       // usa el atributo Static
        double subtotal = precio * cantidad;   // Local de calcularTotal
        double impuesto = subtotal * IVA;      // Local de calcularTotal
        return subtotal + impuesto;
    }   // aqui va y mueren subtotal e impuesto

    public static void main(String[] args) {
        double acumulado = 0;                  // variable de main
        int[] cantidades = {2, 5, 1};          // variable de main

        // 'i' nace en el for y muere al cerrar su llave.
        for (int i = 0; i < cantidades.length; i++) {   // i: de bloque 
            double precioUnitario = 10.0 + i;           // de bloque solo del for
            double totalItem = calcularTotal(precioUnitario, cantidades[i]);
            // totalItem: De bloque que solo existe en este for
            acumulado += totalItem;
        }   // aqui desaparecen i, precioUnitario y totalItem

        if (acumulado > 50) {
            String mensaje = "Compra grande";  // de bloque: solo en este if
            System.out.println(mensaje);
        }   // aqui desaparece el mensaje

        System.out.println("Acumulado: " + acumulado);
        System.out.println("Llamadas: " + totalLlamadas);   // Static
    }
}

/*
 *  resumen de ambitos del programa y estos son: 
  static: IVA, totalLlamadas y estan presentes toda la ejecucion.
  local: precio, cantidad, subtotal, impuesto, acumulado, cantidades. de bloque: i, precioUnitario, totalItem for y para mensaje i
 */ 

