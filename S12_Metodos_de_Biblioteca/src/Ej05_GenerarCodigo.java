/*
  Sesion: S12 - Metodos de biblioteca: Math, Random, Character y String
  Ejercicio 05: Generar un codigo de 6 caracteres
  Enunciado: 3 letras aleatorias seguidas de 3 digitos aleatorios.
  Autor:   Guerra Andres 
   Fecha: 20/11/2026
 */
import java.util.Random;

public class Ej05_GenerarCodigo {

    static String generarCodigo(Random azar) {
        String codigo = "";

        // Parte 1: tres letras mayusculas aleatorias.
        for (int i = 0; i < 3; i++) {
            // nextInt(26) da 0..25; sumado a 'A' da una letra de A a Z.
            //  el (char) es obligatorio.
            // 'A' + numero es un int; sin el cast Java no lo guardaria
            // en un char y el programa no compilaria.
            char letra = (char) ('A' + azar.nextInt(26));
            codigo = codigo + letra;
        }

        // Parte 2: tres digitos aleatorios del 0 al 9.
        for (int i = 0; i < 3; i++) {
            codigo = codigo + azar.nextInt(10);
        }
        return codigo;
    }

    public static void main(String[] args) {
        Random azar = new Random();   // sin semilla: cambia en cada corrida
        for (int k = 1; k <= 5; k++) {
            System.out.println("Codigo " + k + ": " + generarCodigo(azar));
        }
    }
}

/*
   como se arma el codigo?
  (char) ('A' + nextInt(26)) produce una letra de la A a la Z y nextInt(10) un digito de 0 a 9. Como Random no tiene semilla, los codigos cambian en cada ejecucion.
 

 */