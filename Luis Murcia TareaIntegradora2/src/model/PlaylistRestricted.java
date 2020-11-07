package model;

public class PlaylistRestricted extends Playlist {

    private final static int MAX_USERS_ALLOWED = 5;
    private User[] userAllowed;

    /**
     * Allows create the constructor in the class playlist restricted <br>
     * <b> pre: </b><br>
     * <b> post </b> The constructor has been created <br>
     * 
     * @param userAllowed[] one user, must be exist, different null and must be a
     *                      User
     * 
     */
    public PlaylistRestricted(String playlistName, User[] userAllowed) {
        super(playlistName);
        this.userAllowed = userAllowed;

    }

    /**
     * allows you to take five user could be modify the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param userAllowed[] one user, must be exist, different null and must be a
     *                      User
     */
    public User[] getUserAllowed() {
        return this.userAllowed;
    }

    /**
     * allows you to change five user could be modify the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param userAllowed[] one user, must be exist, different null and must be a
     *                      User
     */
    public void setUserAllowed(User[] userAllowed) {
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
     * allow the users to modify the play list <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     */
    public String addAcessUser(String name, String password, int age) {
        String message = "El usuario no existe";
        User newUser = new User(name, password, age);
        boolean added = false;
        for (int i = 0; i < MAX_USERS_ALLOWED && !added; i++) {
            if (userAllowed[i] == null) {
                userAllowed[i] = newUser;
                added = true;
                message = "Se agrego un nuevo usuario";
            }
            if (added = false) {
                message = "Se ha llegado al limite de usuarios permitidos";
            }
        }
        return message;
    }

    public String showAcessUsers() {
        String users = "";
        for (int i = 0; i < MAX_USERS_ALLOWED; i++) {
            if (userAllowed[i] != null) {
                users += userAllowed[i].getName();
            }
        }
        return users;
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
