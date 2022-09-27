/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rosal
 */
public class Cancion extends Musica {

    private String titulo;
    private String artista;
    private String genero;
    private String album;
    private int año;
    private String disquera;
    private String compositor;

    public Cancion(String titulo, String artista, String genero, String album, int año, String disquera, String compositor) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.album = album;
        this.año = año;
        this.disquera = disquera;
        this.compositor = compositor;
    }

    @Override
    public String tipoMusica() {
        return """
               Los datos de la cancion que ingresaste son:
               Titulo: """ + getTitulo()
                + "\n"+ "Artista: " + getArtista()
                + "\n"+ "Genero: " + getGenero()
                + "\n"+ "Album: " + getAlbum()
                + "\n"+ "Año: " + getAño()
                + "\n"+ "Disquera: " + getDisquera()
                + "\n"+ "Compositor " + getCompositor();
    }

    //getter y setter
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @param album the album to set
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * @return the disquera
     */
    public String getDisquera() {
        return disquera;
    }

    /**
     * @param disquera the disquera to set
     */
    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }

    /**
     * @return the compositor
     */
    public String getCompositor() {
        return compositor;
    }

    /**
     * @param compositor the compositor to set
     */
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

}
