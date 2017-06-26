package com.scedeov.calculadora;

class Control {

    Control() {
        interfaz = new Interfaz();
    }

    void Inicio() {
        MenuPrincipal();
    }

    private void MenuPrincipal() {
        boolean end = false;
        do {
            int opcion = interfaz.vMenuPrincipal();
            switch (opcion) {
                case 1:
                    interfaz.vSumar();
                    break;
                case 2:
                    interfaz.vRestar();
                    break;
                case 3:
                    interfaz.vMultiplicar();
                    break;
                case 4:
                    interfaz.vDividir();
                    break;
                case 5:
                    end = true;
                    break;
            }
        } while (!end);
    }

    private Interfaz interfaz;
}
