package pptgrafico;

import java.util.Random;

public class Jugador {

    private enum opciones {
        PIEDRA, PAPEL, TIJERA;
    }
    private String eleccion;
    private String eleccionGrafica;

    public String getEleccionGrafica() {
        return eleccionGrafica;
    }

    public void setEleccionGrafica(String eleccionGrafica) {
        this.eleccionGrafica = eleccionGrafica;
    }
    private String avatar;

    public Jugador(String avatar) {
        this.eleccion = " ";
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEleccion() {
        return eleccion;
    }

    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
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

}
