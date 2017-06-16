package com.scedeov.calculadora;

public class Fraccion {

     Fraccion(){
        numerador = 0;
        denominador = 1;
    }

    int getDenominador() {
        return denominador;
    }

    void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    int getNumerador() {
        return numerador;
    }

    void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "La fraccion es: "+ numerador + "/" + denominador;
    }

    private int numerador;
    private int denominador;

}
