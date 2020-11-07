package model;

public class PlaylistRestricted extends Playlist {

    private final static int MAX_USERS_ALLOWED = 5;
    private String[] userAllowed;

    /**
     * Allows create the constructor in the class playlist restricted <br>
     * <b> pre: </b><br>
     * <b> post </b> The constructor has been created <br>
     * 
     * @param userAllowed[] one user, must be exist, different null and must be a
     *                      String
     * 
     */
    public PlaylistRestricted(String playlistName, String[] userAllowed) {
        super(playlistName);
        this.userAllowed = userAllowed;
    }

    /**
     * allows you to take five user could be modify the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param userAllowed[] one user, must be exist, different null and must be a
     *                      String
     */
    public String[] getUserAllowed() {
        return this.userAllowed;
    }

    /**
     * allows you to change five user could be modify the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param userAllowed[] one user, must be exist, different null and must be a
     *                      String
     */
    public void setUserAllowed(String[] userAllowed) {
        this.userAllowed = userAllowed;
    }

    /**
     * check which users can modify the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     */
    public String showUsers() {
        String message = "Usuarios Autorizados:" + "/n";
        for (int i = 0; i < MAX_USERS_ALLOWED; i++) {
            if (userAllowed[i] != null) {
                message += " " + userAllowed[i] + "/n";
            }
        }
        return message;
    }

    /**
     * allows you to seen caracteristics of the playlist restricted <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     */
    @Override
    public String showContents() {
        String contents = "**************  Playlist **************/n";
        contents += "**  Nombre de la playlist: " + super.getPlaylistName() + "/n";
        contents += "**  Duracion: " + super.getDuration() + "/n";
        contents += "**  Genero: " + super.getGenreSet() + "/n";
        contents += " **  Administradores: " + showUsers() + "/n" + "****************************************";
        return contents;
    }
}
