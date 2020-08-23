/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pptgrafico;

/**
 * Esta clase perteneciente al paquete piedrapapeltijera, contiene los métodos y
 * atributos del juego, "piedra, papel tijera", que lo hacen funcionar.
 *
 * Sus atributos son:
 *
 * j1 y j2: variables privadas y finales de la clase Jugador. Son las variables
 * encargadas de realizar las jugadas.
 *
 * marcador: Array de tipo int, privado y final, que contiene el sumatorio de
 * cada estado posible de solución de partida, ganador 1, ganador 2 o empate.
 *
 * tiradas: Array de tipo int, privado y final, que contiene la elección de cada
 * jugador.
 *
 * ganador: variable de tipo int, privada y final, que contiene el ganador o la
 * situación de empate, de cada jugada.
 *
 * @author Yorch
 */
public class Juego {

    private Jugador j1;
    private JugadorCPU j2;
    private final int[] marcador = new int[]{0, 0, 0};
    private final String[] tiradas = new String[]{"", ""};
    private int ganador;

    public Juego(Jugador j1, JugadorCPU jCPU) {
        this.j1 = j1;
        j2 = jCPU;
    }

    /**
     * Método perteneciente a la clase Juego encargado de almacenar las tiradas
     * que elijan los jugadores.
     *
     * @param opcion1 variable de tipo String con el valor elegido por el
     * jugador uno.
     */
    public void realizajugada(String opcion1) {
        j1.setEleccion(opcion1);
        tiradas[0] = j1.getEleccion();
        j2.tiradaAutomatica();
        tiradas[1] = j2.getEleccion();
    }

    /**
     * Método perteneciente a la clase Juego encargado de analizar la elección
     * de cada jugador y determinar el ganador de la ronda
     */
    private void analizaJugada() {
        if (tiradas[0].compareTo(tiradas[1]) == 0) {
            ganador = 0;
        } else if ((tiradas[0].compareTo("PIEDRA") == 0 && tiradas[1].compareTo("TIJERA") == 0)
                || (tiradas[0].compareTo("TIJERA") == 0 && tiradas[1].compareTo("PAPEL") == 0)
                || (tiradas[0].compareTo("PAPEL") == 0 && tiradas[1].compareTo("PIEDRA") == 0)) {
            ganador = 1;
        } else {
            ganador = 2;
        }
       
    }

    /**
     * Método perteneciente a la clase Juego encargado de actualizar el estado
     * del marcador, dependiendo del ganador de la ronda.
     */
    public void actualizaMarcador() {
        switch (ganador) {
            case 1:
                marcador[1] ++;
                break;
            case 2:
                marcador[2]++;
                break;
            case 0:
                marcador[0] ++;
                break;
        }
    }

    /**
     * Método perteneciente a la clase Juego encargado de devolver el gana dor
     * de la ronda.
     *
     * @return variable de tipo entero.
     */
    public int devuelveGanador() {
        analizaJugada();
        return ganador;
    }

    /**
     * Método perteneciente a la clase Juego encargado de devolver el marcador
     * con todos los resultados.
     *
     * @return array de enteros.
     */
    public int[] devuelveMarcador() {
        return marcador;
    }

    /**
     * Método perteneciente a la clase Juego encargado de devolver las dos
     * tiradas de los jugadores en cada ronda.
     *
     * @return Array de tipo String.
     */
    public String[] devuelveTiradas() {
        return tiradas;
    }

    public int devuelveVictorias() {
        int victorias;
        victorias = marcador[1];
        return victorias;
    }

    public int devuelveVictoriasde2() {
        int victoriasde2;
        victoriasde2 = marcador[2];
        return victoriasde2;
    }

    public int devuelveEmpates() {
        int empate;
        empate = marcador[0];
        return empate;
    }
}
