package typersharkapp;


import java.util.ArrayList;
import java.util.Queue;
import javafx.application.Platform;


public class TiburonNegro extends AnimalesMarinos //implements Runnable
{
    private ArrayList<String> palabras;
    private int numroAlt;
    private Buceador buzo;
    private Queue<AnimalesMarinos> animales;
    
    
    public TiburonNegro(String nombreImagen, ArrayList<String> Palabras, Buceador jugador, Queue<AnimalesMarinos> animalesz)//[]) 
    {
        super(nombreImagen, Palabras.get(0), 3);
        
        this.palabras = Palabras;
        this.buzo = jugador;
        this.animales = animales;
    }

    
    @Override
    public void run() 
    {
         try 
        {
            while(this.getPosicionX() > 50 && !this.palabras.isEmpty() && this.buzo.getVidas() > 0 && this.getBandera() == 0)
            {
            
                this.setPosicionX(this.getPosicionX() - 1);
                
                Platform.runLater(new Runnable() 
                {
                    @Override
                    public void run() 
                    { 
                        TiburonNegro.this.getFigura().setLayoutX(TiburonNegro.this.getPosicionX());
                    }
                });

                Thread.sleep(this.getVelocidad()*10/buzo.getNivel()); 
            }
            TiburonNegro.this.getFigura().setVisible(false);
            //this.setIterator(0);
            
            if(this.getPosicionX() <= 50)
            {
                this.buzo.setVidas(this.buzo.getVidas() - 0);
                this.buzo.setPuntaje(this.buzo.getPuntaje() + 100);
                this.buzo.setPoder(this.buzo.getPoder() + 100);
            }
            else if (this.getIterator() == this.palabras.get(this.palabras.size()-1).length())
            {
                this.buzo.setPuntaje(this.buzo.getPuntaje() + 100);
                this.buzo.setPoder(this.buzo.getPoder() + 100);
                //this.animales.remove();
            }
        }
        catch(Exception ex)
        {
                System.out.println("Error");
                ex.printStackTrace();
        }
    }
    
    public int getNumroAlt() {
        return numroAlt;
    }

    public void setNumroAlt(int numroAlt) {
        this.numroAlt = numroAlt;
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }
    
    
}
