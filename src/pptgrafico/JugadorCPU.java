package pptgrafico;

import java.util.Random;

public class JugadorCPU {

    private enum opciones {
        PIEDRA, PAPEL, TIJERA;
    }
    private String eleccion;
    private String eleccionGrafica;
    private String jugador;
    private String avatar;
    private String ruta = "/imagenes/Personajes/";

    public JugadorCPU() {
        this.eleccion = "";
        eligeJugador();
    }

    public String getEleccion() {
        return eleccion;
    }

    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEleccionGrafica() {
        return eleccionGrafica;
    }

    public void setEleccionGrafica(String eleccion) {
        this.eleccionGrafica = eleccion;
    }

    public void tiradaAutomatica() {
        generaEleccion();
    }

    private void generaEleccion() {
        Random r = new Random();
        opciones[] op = opciones.values();
        opciones opAux;
        opAux = op[r.nextInt(op.length)];
        eleccion = opAux.name();
        generaSeleccionGrafica();
    }

    private void generaSeleccionGrafica() {
        if (eleccion.compareToIgnoreCase("PIEDRA") == 0) {
            eleccionGrafica = "/imagenes/PiedraSobre.png";
        } else if (eleccion.compareToIgnoreCase("PAPEL") == 0) {
            eleccionGrafica = "/imagenes/PapelSobre.png";
        } else {
            eleccionGrafica = "/imagenes/TijerasSobre.png";
        }
    }

    private void eligeJugador() {
        int aux;
        aux = (int) (Math.random() * 9);
        switch (aux) {
            case 0:
                jugador = ruta + "ZangiefSelect.png";
                avatar = ruta + "ZangiefAva.png";
                break;
            case 1:
                jugador = ruta + "SakuraSelect.png";
                avatar = ruta + "SakuraAva.png";
                break;
            case 2:
                jugador = ruta + "SagatSelect.png";
                avatar = ruta + "SagatAva.png";
                break;
            case 3:
                jugador = ruta + "RiuSelect.png";
                avatar = ruta + "RiuAva.png";
                break;
            case 4:
                jugador = ruta + "ChunLiSelect.png";
                avatar = ruta + "ChunLiAva.png";
                break;
            case 5:
                jugador = ruta + "DalshinSelect.png";
                avatar = ruta + "DalshinAva.png";
                break;
            case 6:
                jugador = ruta + "BalrogSelect.png";
                avatar = ruta + "BalrogAva.png";
                break;
            case 7:
                jugador = ruta + "BlankaSelect.png";
                avatar = ruta + "BlankaAva.png";
                break;
            case 8:
                jugador = ruta + "AkumaSelect.png";
                avatar = ruta + "AkumaAva.png";
                break;
        }
    }
}
