/*
 * Sesión: S12 - Métodos de biblioteca: Math, Random, Character y String
 * Ejercicio 05: Generar un código de 6 caracteres
 * Enunciado: 3 letras aleatorias seguidas de 3 dígitos aleatorios.
 * Autor: Guerra Andres 
 * Fecha: 20/11/2026
 */
import java.util.Random;

public class Ej05_GenerarCodigo{

    static String generarCodigo(Random azar) {
        String codigo = "";

        //  tres letras mayúsculas aleatorias.
        for (int i = 0; i < 3; i++) {
            // nextInt(26) da 0..25; sumado a 'A' da una letra de A a Z.
            // >>> NOTA (pista del profesor): el (char) es obligatorio.
            // 'A' + número es un int; sin el cast Java no lo guardaría
            // en un char y el programa no compilaría.
            char letra = (char) ('A' + azar.nextInt(26));
            codigo = codigo + letra;
        }

        // aqui tres digitos aleatorios de 0 a 9
        for (int i = 0; i < 3; i++) {
            codigo = codigo + azar.nextInt(10);
        }
        return codigo;
    }

    public static void main(String[] args) {
        Random azar = new Random();   // aqui sin semilla cambia 
        for (int k = 1; k <= 5; k++) {
            System.out.println("Codigo " + k + ": " + generarCodigo(azar));
        }
    }
}

/*
 *  cómo se arma el código ?
 * (char) ('A' + nextInt(26)) produce una letra de la A a la Z y nextInt(10) un dígito de 0 a 9. Como Random no tiene semilla, loscódigos cambian en cada ejecución.
 */