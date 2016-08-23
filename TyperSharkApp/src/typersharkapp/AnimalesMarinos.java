package typersharkapp;

import java.io.File;
import java.util.Random;
import javafx.scene.layout.Pane;

public abstract class AnimalesMarinos extends Thread
{
    private Pane figura;
    private double posicionX;
    private double posicionY;
    private int velocidad;
    
    public AnimalesMarinos()
    {
        this.figura = new Pane();
        this.generarPosicion();
        this.velocidad = 0;
    }

    public AnimalesMarinos(Pane pane, double posicionX, double posicionY, int velocidad, File listadoPalabras) 
    {
        this.figura = pane;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.velocidad = velocidad;
    }
    
    public final void generarPosicion()
    {
        Random rand = new Random();
        
        this.posicionY = rand.nextInt(450);
        this.posicionX = 900;    
    }

    
    public Pane getFigura() {
        return figura;
    }

    public void setFigura(Pane figura) {
        this.figura = figura;
    }
    
    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
}
