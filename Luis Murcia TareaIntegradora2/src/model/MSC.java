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

    public String addSong(String title, String nameArtist, String date, String durationSong){
    String message="";
    boolean added=false;
    Song song_new= new Song (title,nameArtist,date,durationSong);
    for(int i=0; i<MAXIUMSHARES && !added; i++){
        if (poolSong[i] == null){
            poolSong[i]= song_new;
            added= true;
            message= "La cancion se agrego correctamente";
        }
        else{
            message= "La cancion no pudo ser agregada";
            }
        }
        return message;
    }

    public String addPlaylist(String playlistName, String userOne){
        String message="";
        boolean added=false;
        PlaylistPrivate newPlaylist= new PlaylistPrivate (playlistName, userOne);
        for(int i=0; i<MAXIUMSHARES && !added; i++){
            if (playlist[i] == null){
                playlist[i]= newPlaylist;
                added= true;
                message= "La playlist privada se agrego correctamente";
            }
            else{
                message= "La playlist privada no pudo ser agregada";
                }
            }
            return message;
        }

    public String addPlaylist(String playlistName, int calification){
        String message="";
        boolean added=false;
        PlaylistPublic newPlaylist= new PlaylistPublic (playlistName,calification);
        for(int i=0; i<MAXIUMSHARES && !added; i++){
            if (playlist[i] == null){
                playlist[i]= newPlaylist;
                added= true;
                message= "La playlist publica se agrego correctamente";
            }
            else{
                message= "La playlist publica no pudo ser agregada";
                }
            }
            return message;
        }

        public String addPlaylist(String playlistName, String[] userAllowed){
            String message="";
            boolean added=false;
            PlaylistRestricted newPlaylist= new PlaylistRestricted (playlistName,userAllowed);
            for(int i=0; i<MAXIUMSHARES && !added; i++){
                if (playlist[i] == null){
                    playlist[i]= newPlaylist;
                    added= true;
                    message= "La playlist restringida se agrego correctamente";
                }
                else{
                    message= "La playlist restringida no pudo ser agregada";
                    }
                }
                return message;
            }

    public boolean findUser(String name, String password) {
        boolean exist = false;
        for (int i = 0; i < MAXIUMUSERS; i++) {
            if (user[i].getName() == name && user[i].getPassword() == password) {
                exist = true;
            }
        }
        return exist;
    }
    public boolean findSong (String title){
        boolean exist = false; 
        for (int i = 0; i < MAXIUMSHARES; i++) {
            if (poolSong[i].getTitle() == title) {
                exist = true;
            }
        }
        return exist;
    }







}