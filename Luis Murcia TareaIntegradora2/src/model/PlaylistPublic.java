package model;

public class PlaylistPublic extends Playlist {

    private double calification;
    private double averageCalification;
    private double countCalificationUsers;
    private double rating;

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
     * allows obtain calification for a playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param calification must be different null and must be an double
     */
    public double getCalification() {
        return calification;
    }

    /**
     * allows change the calification for a playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param calification must be different null and must be an double
     */
    public void setCalification(double calification) {
        this.calification = calification;
    }

    /**
     * allows obtain average of calification for a playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param averageCalification must be different null and must be an double
     */
    public double getAverageCalification() {
        return averageCalification;
    }

    public void setAverageCalification(double calification) {
        rating += calification;
        averageCalification = rating / countCalificationUsers;
    }

    /**
     * When the people enter, can calificate playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param countCalificationUsers must be different null and must be an double
     */
    public void setCountCalificationUsers() {
        countCalificationUsers++;
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
