/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import clases.Cancion;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author rosal
 */
public class NewMain {

    static ArrayList<Cancion> single = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String title, artist, genere, collection, sello, composer;
        int age;
        //menu
        String opcion;

        do {
            opcion = JOptionPane.showInputDialog(menu1());
            switch (opcion) {
                case "1" -> {
                    title = JOptionPane.showInputDialog("Ingresa el nombre de la cancion que te gusta");
                    artist = JOptionPane.showInputDialog("Ingresa el artista de esa cancion");
                    genere = JOptionPane.showInputDialog("Ingresa el genero de la cancion");
                    sello = JOptionPane.showInputDialog("Ingresa la disquera del artista");
                    age = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de lanzamiento"));
                    collection = JOptionPane.showInputDialog("Ingresa el album de donde pertenece la cancion");
                    composer = JOptionPane.showInputDialog("Ingresa el compositor de la cancion");
                    single = new ArrayList<>();
                    Cancion temporal = new Cancion(title, artist, genere, sello, age, collection, composer);
                    agrega(temporal);
                    JOptionPane.showMessageDialog(null, temporal.tipoMusica());
                }
                case "2" -> {
                    JOptionPane.showMessageDialog(null, "camara pues ");
                }
                default ->
                    JOptionPane.showMessageDialog(null, "Esa no me la sé");
            }

        } while (!"2".equals(opcion));

        System.out.println("Este fue el resumen de canciones agregadas :D");
        imprimeRolas(single);

    }

    public static String menu1() {

        return """
               Hola, te gusta la musica?
               Si - 1
               No - 2
               """;
    }

    public static void agrega(Cancion temp) {
        single.add(temp);
    }

    public static void imprimeRolas(ArrayList<Cancion> single) {
        for (int i = 0; i < single.size(); i++) {
            System.out.println(single.get(i).tipoMusica());
        }
    }
}
