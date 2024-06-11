package com.mycompany.sumaconwhile;

public class SumaConWhile {
    public static void main(String[] args) {
        int suma = 0;
        int contador = 1;

        while (contador <= 10) {
            suma += contador;
            contador++;
        }

        System.out.println("La suma de 1 a 10 es: " + suma);
    }
}

