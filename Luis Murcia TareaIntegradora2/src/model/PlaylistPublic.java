package model;

public class PlaylistPublic extends Playlist {

    private double calification;

    /**
     * Allows create the constructor in the class playlist public <br>
     * <b> pre: </b><br>
     * <b> post </b> The constructor has been created <br>
     * 
     * @param calification must be different null and must be an double
     * 
     */
    public PlaylistPublic(String playlistName, double calification) {
        super(playlistName);
        this.calification = calification;
    }

    /**
     * allows obtain average of calification for a playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param calification must be different null and must be an double
     */
    public double getCalification() {
        return this.calification;
    }

    /**
     * allows change the calification for a playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param calification mustb be different null and must be an double
     */
    public void setCalification(double calification) {
        this.calification = calification;
    }

    /**
     * allows you to seen caracteristics of the playlist public <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     */
    @Override
    public String showContents() {
        String contents = "**************  Playlist **************/n";
        contents += "**  Nombre de la playlist: " + super.getPlaylistName() + "/n";
        contents += "**  Duracion: " + super.getDuration() + "/n";
        contents += "**  Genero: " + super.getGenreSet() + "/n";
        contents += "**  Calificacion Promedio: " + calification + "/n" + "****************************************";
        return contents;
    }
}
