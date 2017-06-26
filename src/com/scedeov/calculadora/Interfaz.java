package com.scedeov.calculadora;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Interfaz {
    int vMenuPrincipal() {
        int opcion;
        System.out.println("--Menu Principal");
        System.out.println("-(1) Sumar");
        System.out.println("-(2) Restar");
        System.out.println("-(3) Multiplicar");
        System.out.println("-(4) Dividir");
        System.out.print("Ingrese una opcion -> ");
        Scanner S = new Scanner(System.in);
        opcion = S.nextInt();
        return opcion;
    }

    void vSumar() {
        System.out.println("\nSumando...");
        Fraccion primeraFraccion = new Fraccion();
        System.out.println("Primera Fraccion...");
        System.out.print("Digite el numerador de la primera fraccion -> ");
        Scanner S = new Scanner(System.in);
        primeraFraccion.setNumerador(S.nextInt());
        System.out.print("\nDigite el denominador de la primera fraccion -> ");
        primeraFraccion.setDenominador(S.nextInt());
        Fraccion segundaFraccion = new Fraccion();
        System.out.println("\nSegunda Fraccion...");
        System.out.print("Digite el numerador de la segunda fracccion -> ");
        segundaFraccion.setNumerador(S.nextInt());
        System.out.print("\nDigite el denominador de la segunda fraccion -> ");
        segundaFraccion.setDenominador(S.nextInt());
        System.out.println("\nCalculando...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Operaciones resultado = new Operaciones(primeraFraccion, segundaFraccion);
        System.out.println(resultado.sumar().toString());
    }

    void vRestar() {
        System.out.println("\nRestando...");
        Fraccion primeraFraccion = new Fraccion();
        System.out.println("Primera Fraccion...");
        System.out.print("Digite el numerador de la primera fraccion -> ");
        Scanner S = new Scanner(System.in);
        primeraFraccion.setNumerador(S.nextInt());
        System.out.print("\nDigite el denominador de la primera fraccion -> ");
        primeraFraccion.setDenominador(S.nextInt());
        Fraccion segundaFraccion = new Fraccion();
        System.out.println("\nSegunda Fraccion...");
        System.out.print("Digite el numerador de la segunda fracccion -> ");
        segundaFraccion.setNumerador(S.nextInt());
        System.out.print("\nDigite el denominador de la segunda fraccion -> ");
        segundaFraccion.setDenominador(S.nextInt());
        System.out.println("\nCalculando...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Operaciones resultado = new Operaciones(primeraFraccion, segundaFraccion);
        System.out.println(resultado.restar().toString());
    }

    void vDividir() {
        System.out.println("\nDividiendo...");
        Fraccion primeraFraccion = new Fraccion();
        System.out.println("Primera Fraccion...");
        System.out.print("Digite el numerador de la primera fraccion -> ");
        Scanner S = new Scanner(System.in);
        primeraFraccion.setNumerador(S.nextInt());
        System.out.print("\nDigite el denominador de la primera fraccion -> ");
        primeraFraccion.setDenominador(S.nextInt());
        Fraccion segundaFraccion = new Fraccion();
        System.out.println("\nSegunda Fraccion...");
        System.out.print("Digite el numerador de la segunda fracccion -> ");
        segundaFraccion.setNumerador(S.nextInt());
        System.out.print("\nDigite el denominador de la segunda fraccion -> ");
        segundaFraccion.setDenominador(S.nextInt());
        System.out.println("\nCalculando...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Operaciones resultado = new Operaciones(primeraFraccion, segundaFraccion);
        System.out.println(resultado.dividir().toString());
    }

    void vMultiplicar() {
        System.out.println("\nMultiplicando...");
        Fraccion primeraFraccion = new Fraccion();
        System.out.println("Primera Fraccion...");
        System.out.print("Digite el numerador de la primera fraccion -> ");
        Scanner S = new Scanner(System.in);
        primeraFraccion.setNumerador(S.nextInt());
        System.out.print("\nDigite el denominador de la primera fraccion -> ");
        primeraFraccion.setDenominador(S.nextInt());
        Fraccion segundaFraccion = new Fraccion();
        System.out.println("\nSegunda Fraccion...");
        System.out.print("Digite el numerador de la segunda fracccion -> ");
        segundaFraccion.setNumerador(S.nextInt());
        System.out.print("\nDigite el denominador de la segunda fraccion -> ");
        segundaFraccion.setDenominador(S.nextInt());
        System.out.println("\nCalculando...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Operaciones resultado = new Operaciones(primeraFraccion, segundaFraccion);
        System.out.println(resultado.multiplicar().toString());
    }
}
