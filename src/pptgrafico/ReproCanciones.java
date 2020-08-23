package pptgrafico;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class ReproCanciones extends Thread {

    private FileInputStream f;
    private Player p;
    private String cancion;
    private boolean reproduciendo;
    private boolean repetir;

    @Override
    public void run() {
        if (repetir) {
            reproductor();
            while (p.isComplete()) {
                reproductor();
            }
        } else {
            reproductor();
        }
    }

    public boolean isRepetir() {
        return repetir;
    }

    public void setRepetir(boolean repetir) {
        this.repetir = repetir;
    }
    
    public void reproductor() {
        try {
            f = new FileInputStream(cancion);
            p = new Player(f);
            p.play();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isReproduciendo() {
        return reproduciendo;
    }

    public void setReproduciendo(boolean reproduciendo) {
        this.reproduciendo = reproduciendo;
    }

    public void cerrar() {
        p.close();
        try {
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(ReproCanciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

}
