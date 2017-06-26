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

    private Fraccion getDatosFraccion(String mensaje) {
        Fraccion fraccion = new Fraccion();
        Scanner S = new Scanner(System.in);
        System.out.println(mensaje);
        System.out.print("Digite el numerador de la primera fraccion -> ");
        fraccion.setNumerador(S.nextInt());
        System.out.print("\nDigite el denominador de la primera fraccion -> ");
        fraccion.setDenominador(S.nextInt());
        return fraccion;
    }

    private void pausa() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void vSumar() {
        System.out.println("\nSumando...");
        Fraccion primeraFraccion = getDatosFraccion("Primera fraccion...");
        Fraccion segundaFraccion = getDatosFraccion("Segunda fraccion...");
        System.out.println("\nCalculando...");
        pausa();
        Operaciones operacion = new Operaciones();
        Fraccion fraccion_resultado = operacion.sumar(primeraFraccion, segundaFraccion);
        System.out.println(fraccion_resultado.toString());
    }

    void vRestar() {
        System.out.println("\nRestando...");
        Fraccion primeraFraccion = getDatosFraccion("Primera fraccion...");
        Fraccion segundaFraccion = getDatosFraccion("Segunda fraccion...");
        System.out.println("\nCalculando...");
        pausa();
        Operaciones operacion = new Operaciones();
        Fraccion fraccion_resultado = operacion.restar(primeraFraccion, segundaFraccion);
        System.out.println(fraccion_resultado.toString());
    }

    void vDividir() {
        System.out.println("\nDividiendo...");
        Fraccion primeraFraccion = getDatosFraccion("Primera fraccion...");
        Fraccion segundaFraccion = getDatosFraccion("Segunda fraccion...");
        System.out.println("\nCalculando...");
        pausa();
        Operaciones operacion = new Operaciones();
        Fraccion fraccion_resultado = operacion.dividir(primeraFraccion, segundaFraccion);
        System.out.println(fraccion_resultado.toString());
    }

    void vMultiplicar() {
        System.out.println("\nMultiplicando...");
        Fraccion primeraFraccion = getDatosFraccion("Primera fraccion...");
        Fraccion segundaFraccion = getDatosFraccion("Segunda fraccion...");
        System.out.println("\nCalculando...");
        pausa();
        Operaciones operacion = new Operaciones();
        Fraccion fraccion_resultado = operacion.multiplicar(primeraFraccion, segundaFraccion);
        System.out.println(fraccion_resultado.toString());
    }
}
