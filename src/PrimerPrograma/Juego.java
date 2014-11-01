package PrimerPrograma;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class Juego {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numIntentos = 0;
        int numAleatorio = new Random() . nextInt(10) + 1;
        out.println("       ******* ********        ");
        out.println(" Bienvenido al juego \"¡¡Acierta el Número!!");
        out.println("       ******* ********        ");
        out.println();
        out.println("Escribe un numero del 1 al 10: ");
        int numeroEscrito = miScanner.nextInt();
        numIntentos++;
        while (numeroEscrito != numAleatorio) {
            out.println();
            out.println("Intentalo de nuevo... ");
            out.println("Escribe un numero del 1 al 10: ");
            numeroEscrito = miScanner.nextInt();
            numIntentos++;
        }
        out.println("Has ganado despues de " + numIntentos + " intentos. ");
    }
}