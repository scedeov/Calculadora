package com.scedeov.calculadora;

class Operaciones {

    Operaciones(Fraccion primeraFraccion, Fraccion segundaFraccion) {
        this.segundaFraccion = segundaFraccion;
        this.primeraFraccion = primeraFraccion;
    }

    public Fraccion getPrimeraFraccion() {
        return primeraFraccion;
    }

    public void setPrimeraFraccion(Fraccion fraccion) {
        this.primeraFraccion = fraccion;
    }

    public void setSegundaFraccion(Fraccion segundaFraccion) {
        this.segundaFraccion = segundaFraccion;
    }

    public Fraccion getSegundaFraccion() {
        return segundaFraccion;
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

    Fraccion simplificar (Fraccion resultado) { //no funciona con numeros negativos
        for (int i = 2; i < 10; i++) {
            if (resultado.getDenominador() % i == 0 && resultado.getNumerador() % i == 0) {
                resultado.setDenominador(resultado.getDenominador() / i);
                resultado.setNumerador(resultado.getNumerador() / i);
                i = 1;
            }
        }
       return resultado;
    }

    private Fraccion primeraFraccion;
    private Fraccion segundaFraccion;
}
