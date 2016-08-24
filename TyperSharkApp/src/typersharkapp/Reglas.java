/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typersharkapp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Una clase para representar a la ventana de las reglas del juego.
 * @version 1.0
 * @author Dennise Guizado
 * @author Edward Pino
 * @author Xavier Pesantes
 */
public class Reglas {
    
    private Pane windowReglas;
    private Image imagen;
    private ImageView vi; 
    private Stage stage;
    private Scene sc1;
     
    public Reglas() {
        
         try{
            imagen= new Image("Menu.png");
        
        }
        catch(Exception e){System.out.println("No lee imagen");}
        vi=new ImageView(imagen);
        vi.setFitHeight(510);
        vi.setFitWidth(900);
        vi.setImage (imagen);
        
        windowReglas= new Pane();
        
        windowReglas.setStyle("-fx-background-color: aqua;");
        TitulosLabel titulo1= new TitulosLabel("REGLAS","-fx-font: 20 elephant",150,10,410,10, Color.DARKGRAY);
        TitulosLabel titulo2= new TitulosLabel("TYPERSHARK","-fx-font: 20 elephant;",210,10,370,40, Color.DARKGRAY);
        Boton regreso= new Boton("Regresar","-fx-font: 20 century; -fx-background-color: transparent;-fx-background-radius: 30;", 150, 60, 730, 438, 10, Color.AQUA);
        Text t= new Text(130,100,"OBJETIVO: TyperShark es un juego cuyo objetivo es que el usuario aprenda a utilizar todos sus\n"
                + "dedos para tipiar.\n\n"
                + "ACERCA DE: El juego consiste de un buceador el cual ira descendiendo en el mar.\n"
                + "A medida que descendiende \n"
                + "apareceran diferentes tipos de animales marinos como tiburones, piranas y tiburones negros.\n"
                + "Los tiburones tendran una palabra, las piranas un caracter y los tiburones negros pueden contener\n"
                + "2 o 3 palabaras seleccionadas aleatoriamente\n\n"
                + "COMO JUGAR: A medida que los animales marinos salgan el jugador debera tipiar la o\n"
                + "las palabras o caracteres que salgan en cada uno.\n"
                + "A medida que avanze descendiendo el buceador, el nivel de velocidad de los animales aumentara\n\n"
                + "PUNTAJE:El jugador gana puntos:\n"
                + "\t\t\tPor cada tiburon que mate el jugador obtendra 3 puntos\n"
                + "\t\t\tPor cada pirana que mate 2 puntos\n"
                + "\t\t\tPor cada tiburon negro 5 puntos\n"
                + "\t\t\tA medida que descienda en el mar\n\n"
                + "VIDAS: Al comenzar el juego el jugador tendra 3 vidas las cuales las puede perder si:\n"
                + "\t\t\tSi un tiburon o tiburon negro toca al buceador o al cabo que lo sostiene pierde 1 vida\n"
                + "\t\t\tSi las piranas ya han tocado 3 veces al buceador o a su cabo pierde 1 vida\n\n"
                + "BONO: Si el jugador ya ha acumulado 50 puntos o mas podra matar a un combo marino dando ENTER.\n"
                + "Este combo marino incluye todos los animales marinos que se encuentren en ese momento a su alrededor.\n"
                + "Perdera la mitad de sus puntos y luego se le asignaran mas puntos por cada animal matado");
        t.setFill(Color.WHITE);
        t.setStyle("-fx-font: 12 century;");
        
        windowReglas.getChildren().addAll(vi);
        windowReglas.getChildren().addAll(titulo1.getL(),titulo2.getL(),t,regreso.getBtn());
        regreso.getBtn().setOnAction(new regresar());
        
    }

    /**
     * Método que devuelve la imagen de fondo.
     * @return Image
     */
    public Image getImagen() {
        return imagen;
    }

    /**
     * Método que modifica la imagen de fondo.
     * @param imagen de tipo Image que representa la imagen de fondo
     */
    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    /**
     * Método que devuelve la vista de la imagen de fondo.
     * @return ImagenView
     */
    public ImageView getVi() {
        return vi;
    }

    /**
     * Método que modifica la vista de la imagen de fondo.
     * @param vi
     */
    public void setVi(ImageView vi) {
        this.vi = vi;
    }

    
    private class regresar implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e)
        {
            stage.setTitle("TyperShark!...");
            stage.setScene(getSc1());
            stage.show();
        }
    }

    /**
     * Método que devuelve el panel de las Reglas.
     * @return Pane
     */
    public Pane getWindowReglas() {
        return windowReglas;
    }
    
    /**
     * Método que modifica el panel de las Reglas.
     * @param windowReglas de tipo Pane que representa el panel de las Reglas.
     */
    public void setWindowReglas(Pane windowReglas) {
        this.windowReglas = windowReglas;
    }

    /**
     * Método que devuelve el stage del juego.
     * @return Stage
     */
    public Stage getStage() {
        return stage;
    }

    /**
     * Método que modifica el stage del juego.
     * @param stage
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /**
     * Método que devuelve la escena de la ventana Reglas.
     * @return Scene
     */
    public Scene getSc1() {
        return sc1;
    }

    /**
     * Método que modifica la escena de la ventana Reglas.
     * @param scene de tipo Scene que representa la escena de la ventana Reglas.
     */
    public void setSc1(Scene scene) {
        this.sc1 = scene;
    }
    
    
    
}
