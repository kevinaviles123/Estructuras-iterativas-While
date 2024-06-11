package com.mycompany.sumaconwhile;

public class FibonacciConWhile {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.print("Serie de Fibonacci: " + a + " " + b);

        int contador = 2;
        while (contador < n) {
            int siguiente = a + b;
            System.out.print(" " + siguiente);
            a = b;
            b = siguiente;
            contador++;
        }
    }
}
