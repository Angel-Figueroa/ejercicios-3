package com.mycompany.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author jose
 * 1.-Crear un programa que, ingresada una palabra, muestre como salida: 1. El
 * número de apariciones de cada letra en la palabra. 2. Ordene alfabéticamente
 * todas las letras de la palabra. Ejemplo: Amarillo → [a -> 2, m -> 1, r -> 1,
 * i -> 1, l -> 2, o -> 1] [aaillmor]
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese palabra: ");
        palabra = sc.nextLine();
        palabra = palabra.toLowerCase();
        ordenaPAlabras(palabra);
    }

    public static void ordenaPAlabras(String palabra) {
        char[] StringtoChar = palabra.toCharArray();
        Arrays.sort(StringtoChar);
        String SortedString = new String(StringtoChar);
        System.out.println(palabra + " -> " + SortedString);
        char letraAnterior = ' ';
        char letra;
        for (int i = 0; i < StringtoChar.length; i++) {
            letra = StringtoChar[i];
            if (letra != letraAnterior) {
                contadorCaracteres(palabra, letra);
                letraAnterior = letra;
            }
        }
    }

    public static void contadorCaracteres(String Palabra, char caracter) {
        int posicion, count = 0;
        posicion = Palabra.indexOf(caracter);
        while (posicion != -1) {
            count++;
            posicion = Palabra.indexOf(caracter, posicion + 1);
        }
        System.out.println(caracter + " -> " + count);
    }

}
