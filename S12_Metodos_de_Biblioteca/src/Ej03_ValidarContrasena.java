/*
  Sesion: S12 - Metodos de biblioteca: Math, Random, Character y String
  Ejercicio 03: Validar una contraseña
  Enunciado: minimo 8 caracteres, al menos una mayuscula y un digito.
  Autor: Guerra Andres
  Fecha: 20/11/2026
 */
public class Ej03_ValidarContrasena {

    static boolean esValida(String clave) {
        // REGLA 1: longitud minima. length() devuelve cuantos caracteres hay.
        if (clave.length() < 8) {
            return false;
        }

        boolean hayMayuscula = false;   // banderas: empiezan en no vista
        boolean hayDigito = false;

        // ocupamos ahora regla 2 y 3: recorremos caracter por caracter.
        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);              // el charAt(i) es = posicion i
            if (Character.isUpperCase(c)) {        // aqui hacemos la comparacion si es mayuscula o no
                hayMayuscula = true;
            } else if (Character.isDigit(c)) {     // aqui vemos si ¿es un digito 0-9?
                hayDigito = true;
            }
        }
        // Solo es válida si se cumplieron LAS DOS banderas.
        return hayMayuscula && hayDigito;
    }

    public static void main(String[] args) {
        String[] pruebas = {"Hola1234", "hola1234", "HolaMundo",
                            "Ab1", "CLAVE2026"};
        for (int i = 0; i < pruebas.length; i++) {
            String estado = esValida(pruebas[i]) ? "VALIDA" : "INVALIDA";
            System.out.println(pruebas[i] + " -> " + estado);
        }
    }
}

/*
 * Por que cada prueba da su resultado:
 *   Hola1234  = 8 caracteres, tiene H mayuscula y 1234  =es valida
 *   hola1234  = no tiene mayuscula                        =es valida
 *   HolaMundo = no tiene digito                           = esto es invalida
 *   Ab1       = solo 3 caracteres               invalida
 *   CLAVE2026 = 9 caracteres, mayusculas y digitos        =valida
 */


