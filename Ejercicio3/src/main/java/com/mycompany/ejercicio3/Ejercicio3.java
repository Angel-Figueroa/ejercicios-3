/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 * 3.- Desarrollar una clase que permita ingresar tres valores por teclado. Luego mostrar el mayor y el menor. 
 * La clase debe de tener los siguientes métodos o funciones:

•	Inicializar
•	CalcularMayor
•	CalcularMenor

En la función del main se debe de declarar un objeto que va a ejecutar las tres funciones de la clase.
 * @author jose
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3;
        
        System.out.println("Ingrese el primer numero");
        valor1= sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        valor2= sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        valor3= sc.nextInt();
        
        Valores objet1 = new Valores(valor1, valor2, valor3);
        
        
        objet1.mayor(valor1, valor2, valor3);
        objet1.menor(valor1, valor2, valor3);
    }

    
    
}
