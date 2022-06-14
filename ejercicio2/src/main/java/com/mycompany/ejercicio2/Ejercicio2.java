
package com.mycompany.ejercicio2;

/**
 * @author jose
 * 2.- Desarrollar una clase llamada Alumno y definir como atributos su nombre, edad y calificación. 
 * Deberá de tener dos constructores, el primero deberá de inicializar el nombre del alumno y el segundo 
 * constructor deberá de inicializar todos los atributos de la clase. Definir los siguientes métodos:

•	Imprimir los datos ingresados
•	Imprimir un mensaje si es mayor o no de edad (edad >=18)
•	Mandara un mensaje dependiendo de su promedio:
•	Si el promedio es menor a 8 mandar un mensaje de Reprobado.
•	Si el promedio es mayor a 8 pero menor a 10 un mensaje de Aprobado.
•	Si el promedio es igual a 10 un menaje de Excelente.
•	Inicializar la edad y la calificación.

En la función del main se debe de declarar dos objetos, el primer objeto debe de utilizar el primer constructor 
* y el segundo objeto debe de utilizar el segundo constructor. Estos objetos deben de ejecutar las siguientes 
* funciones: Imprimir los datos ingresados, Imprimir un mensaje si es mayor o no de edad y Mandar un mensaje 
* dependiendo del promedio.
*/

public class Ejercicio2 {

    public static void main(String[] args) {
        Alumno objet1 = new Alumno("Jose Angel Martínez Figueroa");
        objet1.inicializacion();
        objet1.imprimirDatos();
        objet1.esMayorEdad();
        objet1.promedio();
        
        Alumno objet2 = new Alumno("Jose Angel Martínez Figueroa",22,10);
        objet2.imprimirDatos();
        objet2.esMayorEdad();
        objet2.promedio();
    }
}
