package model;

public class PlaylistPrivate extends Playlist {

    private String userOne;

    /**
     * Allows create the constructor in the class playlist private <br>
     * <b> pre: </b><br>
     * <b> post </b> The constructor has been created <br>
     * 
     * @param userOne one user, must be exist, different null and must be a String
     * 
     */
    public PlaylistPrivate(String playlistName, String userOne) {
        super(playlistName);
        this.userOne = userOne;
    }

    /**
     * allows you to take only user could be modify the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param userOne one user, must be exist, different null and must be a String
     */
    public String getUserOne() {
        return this.userOne;
    }

    /**
     * allows you to change only user could be modify the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param userOne one user, must be exist, different null and must be a String
     */
    public void setUserone(String userOne) {
        this.userOne = userOne;
    }

    /**
     * allows you to seen caracteristics of the playlist private <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     */
    @Override
    public String showContents() {
        String contents = "**************  Playlist **************/n";
        contents += "**  Nombre de la playlist: " + super.getPlaylistName() + "/n";
        contents += "**  Duracion: " + super.getDuration() + "/n";
        contents += "**  Genero: " + super.getGenreSet() + "/n";
        contents += "**  Administrador: " + getUserOne() + "/n" + "****************************************";
        return contents;
    }

}
