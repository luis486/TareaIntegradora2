package model;

public abstract class Playlist {
    private static final int AMOUNT_GENRES = 7;
    private static final int AMOUNT_SONG = 10;
    private static final int AMOUNT_PLAYLISTS = 20;
    private final MusicalGender[] genres = MusicalGender.values();
    private String playlistName;
    private String duration;
    private int durationTotal;
    private String[] genreSet;
    private Song[] songs;

    public Playlist(String playlistName) {
        this.genreSet = new String[AMOUNT_GENRES];
        this.songs = new Song[AMOUNT_SONG];
        genreSet[0] = genres[0].name();
        duration = "00:00";
        this.playlistName = playlistName;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

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

    public int updateDurationTotal(int songDuration) {
        this.durationTotal += songDuration;
    }

    public String updateGenre() {
        String updated = "El genero de la Playlist no ha sido cambiado";
        boolean found = false;
        for (int i = 0; i < AMOUNT_SONG && !found; i++) {
            if (songs[i] != null && genreSet[i] != null) {
                found = songs[i].equalsIgnoreCase(genreSet[i]);
                if (found == false) {
                    genreSet[i] = songs[i].getGenre();
                    updated = "El genero de la Playlist ha cambiado";
                }
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

    public String[] getGenreSet() {
        return genreSet;
    }

    public void setGenreSet(String[] genreSet) {
        this.genreSet = genreSet;
    }

    public abstract String showContents();
}
