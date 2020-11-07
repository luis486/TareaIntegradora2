package model;

public class MSC {

    private final static int PLAYLISTS = 20;
    private final static int MAXIUMSHARES = 30;
    private final static int MAXIUMUSERS = 10;
    private Playlist[] playlist;
    private Song[] poolSong;
    private User[] user;

    public MSC() {
        playlist = new Playlist[PLAYLISTS];
        poolSong = new Song[MAXIUMSHARES];
        user = new User[MAXIUMUSERS];
    }

    /**
     * Allows add new user in the aplication <br>
     * <b> pre: </b><br>
     * <b> post </b> The new user has been added <br>
     * 
     * @param name     name of the user, must be different null and must be a String
     *                 without spaces
     * @param password password of the user, must be different null and must be a
     *                 String
     * @param age      age of the user, must be different null and must be a int
     */
    public String addUser(String name, String password, int age) {
        boolean added = false;
        String message = "";
        User user_new = new User(name, password, age);
        for (int i = 0; i < MAXIUMUSERS && !added; i++) {
            if (user[i] == null) {
                user[i] = user_new;
                added = true;
                message = "El usuario se agrego exitosamente";
            } else {
                message = "El usuario no se pudo agregar";
            }
        }
        return message;
    }

    /**
     * Allows add new song in the poolsongs <br>
     * <b> pre: </b><br>
     * <b> post </b> The new song has been added <br>
     * 
     * @param title      title of the song, must be different null and must be a
     *                   String
     * @param nameArtist name the band or Artist, must be different null and must be
     *                   a String
     * @param date       date when the song was added, must be different null and
     *                   must be a String
     * @param duration   duration of the song, and must be different null and must
     *                   be a String
     */
    public String addSong(String title, String nameArtist, String date, String durationSong) {
        String message = "";
        boolean added = false;
        Song song_new = new Song(title, nameArtist, date, durationSong);
        for (int i = 0; i < MAXIUMSHARES && !added; i++) {
            if (poolSong[i] == null) {
                poolSong[i] = song_new;
                added = true;
                message = "La cancion se agrego correctamente";
            } else {
                message = "La cancion no pudo ser agregada";
            }
        }
        return message;
    }

    /**
     * Allows add new playlist of type private <br>
     * <b> pre: </b><br>
     * <b> post </b> The new playlist has been added <br>
     * 
     * @param playlistName name playlist and must be an String and differente null
     * @param userOne      user allowed to modify playlist, must be different null
     */
    public String addPlaylist(String playlistName, String userOne) {
        String message = "";
        boolean added = false;
        PlaylistPrivate newPlaylist = new PlaylistPrivate(playlistName, userOne);
        for (int i = 0; i < MAXIUMSHARES && !added; i++) {
            if (playlist[i] == null) {
                playlist[i] = newPlaylist;
                added = true;
                message = "La playlist privada se agrego correctamente";
            } else {
                message = "La playlist privada no pudo ser agregada";
            }
        }
        return message;
    }

    /**
     * Allows add new playlist of type public <br>
     * <b> pre: </b><br>
     * <b> post </b> The new playlist has been added <br>
     * 
     * @param playlistName name playlist and must be an String and differente null
     * @param calification must be an positive double, greater than 1 and less than
     *                     5
     */
    public String addPlaylist(String playlistName, double calification) {
        String message = "";
        boolean added = false;
        PlaylistPublic newPlaylist = new PlaylistPublic(playlistName, calification);
        for (int i = 0; i < MAXIUMSHARES && !added; i++) {
            if (playlist[i] == null) {
                playlist[i] = newPlaylist;
                added = true;
                message = "La playlist publica se agrego correctamente";
            } else {
                message = "La playlist publica no pudo ser agregada";
            }
        }
        return message;
    }

    /**
     * Allows add new playlist of type restricted <br>
     * <b> pre: </b><br>
     * <b> post </b> The new playlist has been added <br>
     * 
     * @param playlistName  name playlist and must be an String and differente null
     * @param userAllowed[] users alloweds to modify playlist, must be different
     *                      null
     */
    public String addPlaylist(String playlistName, String[] userAllowed) {
        String message = "";
        boolean added = false;
        PlaylistRestricted newPlaylist = new PlaylistRestricted(playlistName, userAllowed);
        for (int i = 0; i < MAXIUMSHARES && !added; i++) {
            if (playlist[i] == null) {
                playlist[i] = newPlaylist;
                added = true;
                message = "La playlist restringida se agrego correctamente";
            } else {
                message = "La playlist restringida no pudo ser agregada";
            }
        }
        return message;
    }

    /**
     * Allows find user <br>
     * <b> pre: </b><br>
     * <b> post </b> The user efectly exist when the name and the password <br>
     * 
     * @param name     name of the user, must be different null and must be a String
     * @param password password of the user, must be different null and must be a
     *                 String
     */
    public boolean findUser(String name, String password) {
        boolean exist = false;
        for (int i = 0; i < MAXIUMUSERS; i++) {
            if (user[i].getName() == name && user[i].getPassword() == password) {
                exist = true;
            }
        }
        return exist;
    }

    /**
     * Allows find song <br>
     * <b> pre: </b><br>
     * <b> post </b> The song exist <br>
     * 
     * @param title title of the song, must be different null and must be a String
     */
    public boolean findSong(String title) {
        boolean exist = false;
        for (int i = 0; i < MAXIUMSHARES; i++) {
            if (poolSong[i].getTitle() == title) {
                exist = true;
            }
        }
        return exist;
    }

    /**
     * Allows show users <br>
     * <b> pre: </b><br>
     * <b> post </b> The users int the aplication are <br>
     */
    public String showUsers() {
        String messageUser = "Usuarios" + "/n";
        for (int i = 0; i < MAXIUMUSERS; i++) {
            if (user[i] != null) {
                messageUser += user[i].showContents();
            }
        }
        return messageUser;
    }

    /**
     * Allows show songs <br>
     * <b> pre: </b><br>
     * <b> post </b> The song in the aplication are <br>
     */
    public String showSongs() {
        String messageSong = "Canciones: " + "/n";
        for (int i = 0; i < MAXIUMSHARES; i++) {
            if (poolSong[i] != null) {
                messageSong += poolSong[i].showContents();
            }
        }
        return messageSong;
    }

    /**
     * Allows show playlists <br>
     * <b> pre: </b><br>
     * <b> post </b> The playlists in the aplicacion are <br>
     */
    public String showPlaylists() {
        String messagePlay = "Playlists: " + "/n";
        for (int i = 0; i < PLAYLISTS; i++) {
            if (playlist[i] != null) {
                messagePlay += playlist[i].showContents();
            }
        }
        return messagePlay;
    }
}