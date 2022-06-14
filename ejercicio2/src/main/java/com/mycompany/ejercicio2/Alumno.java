package com.mycompany.ejercicio2;

public class Alumno {

    /* Variables */
    private String nombre;
    private int edad;
    private double calificacion;

    /* Constructores */
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /* Metodos */
    public void inicializacion() {
        edad = 0;
        calificacion = 0;
    }
    
    public void imprimirDatos() {
        System.out.println("------- Datos del alumno -------");
        System.out.println("* Nombre: " + this.getNombre());
        System.out.println("* Edad: " + this.getEdad());
        System.out.println("* Calificación:" + this.getCalificacion());
    }

    public void esMayorEdad() {
        if (this.getEdad() > 18) {
            System.out.println("* Eres mayor de edad");
        } else {
            System.out.println("* Eres menor de edad");
        }
    }

    public void promedio() {
        if(this.getCalificacion() == 10) {
            System.out.println("Excelente");
        } else if(this.getCalificacion() > 8 && this.getCalificacion() < 10) {
            System.out.println("Aprobado");
        } else if(this.getCalificacion() < 8){
            System.out.println("Reprobado");
        }
    }

    
}
