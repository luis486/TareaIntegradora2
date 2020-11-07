package model;

public abstract class Playlist {
    private static final int AMOUNT_GENRES = 6;
    private static final int AMOUNT_SONG = 10;
    private final MusicalGender[] genres = MusicalGender.values();
    private String playlistName;
    private String duration;
    private int durationTotal;
    private String[] genreSet;
    private Song[] songs;
    private String durationPlaylist;

    public Playlist(String playlistName) {
        this.genreSet = new String[AMOUNT_GENRES];
        this.songs = new Song[AMOUNT_SONG];
        genreSet[0] = genres[0].name();
        duration = "00:00";
        this.playlistName = playlistName;
    }

    /**
     * allows you to take the playlist name <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param playlistName name of the playlist, must be different null and must be
     *                     a String
     */
    public String getPlaylistName() {
        return playlistName;
    }

    /**
     * allows you to change the playlist name <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param playlistName name of the playlist, must be different null and must be
     *                     a String
     */
    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    /**
     * allows you to take the duration of the each song in the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param duration duration song, must be different null and must be a integer
     */
    public String getDuration() {
        return duration;
    }

    public String showGenre() {
        String message = "";
        for (int i = 0; i < AMOUNT_GENRES; i++) {
            if (genreSet[i] != null) {
                message += genreSet[i] + ",";
            }
        }
        return message;
    }

    /**
     * allows change duration total at the playlist when we add song <br>
     * <b> pre: </b><br>
     * <b> post </b> The playlist has been updated <br>
     * 
     */
    public void updateDurationPlaylist(int songDuration) {
        this.durationTotal += songDuration;
    }

    /**
     * allows return the duration playlist in String <br>
     * <b> pre: </b><br>
     * <b> post </b> The playlist are in the format hh/mm/ss <br>
     * 
     */
    public void setDurationPlaylist() {
        int hour = (int) durationTotal / 3600;
        int minute = (int) durationTotal - (3600 * hour) / 60;
        int seconds = (int) durationTotal - ((hour * 3600) * (minute * 60));
        durationPlaylist = "0" + hour + ":" + minute + ":" + seconds;
    }

    /**
     * allows add genre at the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> The playlist has been updated <br>
     * 
     */
    public String updateGenre(Song song) {
        String updated = "El genero de la Playlist no ha sido actualizado";
        boolean found = false;
        for (int i = 0; i < AMOUNT_GENRES && !found; i++) {
            if (genreSet[i] != null && genreSet[i].equalsIgnoreCase(song.getGenre())) {
                found = true;
                updated = "El genero de la Playlist ha sido actualizado";
            } else if (found == false) {
                for (int j = 0; j < AMOUNT_GENRES && !found; j++) {
                    if (genreSet[j] == null) {
                        genreSet[j] = song.getGenre();
                        found = true;
                    }
                }
                updated = "El genero de la Playlist ha sido actualizado";
            }
        }
        return updated;
    }

    public void setDuration(String duration) {
        int hour = (int) durationTotal / 3600;
        double minute = (int) (durationTotal = (3600 * hour)) / 60;
        double seconds = (int) durationTotal - (hour * 3600) + (minute * 60);
        this.duration = "0" + hour + ":" + minute + ":" + seconds;
    }

    /**
     * allows obtain all the genres in the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param genreset[] genre set, here can only stay genre in class MusicalGender
     */
    public String[] getGenreSet() {
        return genreSet;
    }

    public void setGenreSet(String[] genreSet) {
        this.genreSet = genreSet;
    }

    public abstract String showContents();
}
