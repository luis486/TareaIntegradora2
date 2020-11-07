package model;

public class PlaylistPrivate extends Playlist {

    private User userOne;

    /**
     * Allows create the constructor in the class playlist private <br>
     * <b> pre: </b><br>
     * <b> post </b> The constructor has been created <br>
     * 
     * @param userOne one user, must be exist, different null and must be a String
     * 
     */
    public PlaylistPrivate(String playlistName, String name, String password, int age) {
        super(playlistName);
        userOne = new User(name, password, age);
    }

    /**
     * allows you to take only user could be modify the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param userOne one user, must be exist, different null and must be a String
     */
    public User getUserOne() {
        return this.userOne;
    }

    /**
     * allows you to change only user could be modify the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param userOne one user, must be exist, different null and must be a String
     */
    public void setUserone(User userOne) {
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
