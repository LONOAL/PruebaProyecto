package com.proyecto.core;

public class Main {
    public static void main (String[] args) {
    Historia h = new Historia();
    h.vaciarInventario();
    h.inicioJuego();
    h.eleccionClase();
    h.eleccionArma();
    h.addArma();
    h.addCuras();
    h.inventary.guardarInventario();
    FramePrincipal.save(h);
    h.empezarCombate();
    FramePrincipal.update(h);

    }
}