/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author jose
 */
public class Valores {

    int valor1 = 0;
    int valor2 = 0;
    int valor3 = 0;

    public Valores(int valor1, int valor2, int valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    public void mayor(int valor1, int valor2, int valor3) {
        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("el numero mayor es: " + valor1);
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("el numero mayor es: " + valor2);
        } else {
            System.out.println("el numero mayor es: " + valor3);
        }
    }

    public void menor(int valor1, int valor2, int valor3) {
        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println("el numero menor es: " + valor1);
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println("el numero menor es: " + valor2);
        } else {
            System.out.println("el numero menor es: " + valor3);
        }
    }
}
