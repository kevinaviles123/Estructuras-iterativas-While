package com.mycompany.sumaconwhile;

public class FactorialConWhile {
    public static void main(String[] args) {
        int numero = 5;
        int factorial = 1;
        int contador = 1;

        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
