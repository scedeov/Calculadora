package com.scedeov.calculadora;

class Operaciones {

    Operaciones(Fraccion primeraFraccion, Fraccion segundaFraccion) {
        this.segundaFraccion = segundaFraccion;
        this.primeraFraccion = primeraFraccion;
    }

    private Fraccion simplificar(Fraccion resultado) {
        for (int i = 2; i < 10; i++) {
            if (resultado.getDenominador() % i == 0 && resultado.getNumerador() % i == 0) {
                resultado.setDenominador(resultado.getDenominador() / i);
                resultado.setNumerador(resultado.getNumerador() / i);
                i = 1;
            }
        }
        return resultado;
    }

    Fraccion sumar () {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(
                primeraFraccion.getNumerador()*segundaFraccion.getDenominador() +
                        segundaFraccion.getNumerador()*primeraFraccion.getDenominador()
        );
        resultado.setDenominador(
                primeraFraccion.getDenominador()*segundaFraccion.getDenominador()
        );
        return simplificar(resultado);
    }

    Fraccion restar() {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(
                primeraFraccion.getNumerador()*segundaFraccion.getDenominador() -
                        segundaFraccion.getNumerador()*primeraFraccion.getDenominador()
        );
        resultado.setDenominador(
                primeraFraccion.getDenominador()*segundaFraccion.getDenominador()
        );
        return simplificar(resultado);
    }

    Fraccion multiplicar() {
        Fraccion resultado = new Fraccion();
        resultado.setNumerador(primeraFraccion.getNumerador()*segundaFraccion.getNumerador());
        resultado.setDenominador(primeraFraccion.getDenominador()*segundaFraccion.getDenominador());
        return simplificar(resultado);
    }

    private Fraccion primeraFraccion;
    private Fraccion segundaFraccion;
}
