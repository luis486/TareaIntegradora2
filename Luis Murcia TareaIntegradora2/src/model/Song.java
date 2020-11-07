package model;

public class Song {
    private String title;
    private String nameArtist;
    private String date;
    private String durationSong;
    private String genre;

    /**
     * Allows create constructor in the class Song <br>
     * <b> pre: </b><br>
     * <b> post </b> You has been created the constructor Song <br>
     * 
     * @param title        title of the song, must be different null and must be a
     *                     String
     * @param nameArtist   name the band or Artist, must be different null and must
     *                     be a String
     * @param date         date when the song was created, must be different null
     *                     and must be a String
     * @param durationSong duration of the song, and must be different null and must
     *                     be a String with the format mm/ss
     */
    public Song(String title, String nameArtist, String date, String durationSong) {
        this.title = title;
        this.nameArtist = nameArtist;
        this.date = date;
        this.durationSong = durationSong;
    }

    /**
     * allows you to take the title of the song <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param title title of the song, must be different null and must be a String
     */
    public String getTitle() {
        return title;
    }

    /**
     * title of the song can't be changed, but it's here by convention <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param title title of the song, must be different null and must be a String
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * allows you to take the name of artist or the band <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param nameArtist name the band or Artist, must be different null and must be
     *                   a String
     */
    public String getNameArtist() {
        return nameArtist;
    }

    /**
     * title of the song can't be changed, but it's here by convention <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param nameArtist name the band or Artist, must be different null and must be
     *                   a String
     */
    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    /**
     * allows you to take the date when the song was created <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param date date when the song was added, must be different null and must be
     *             a String with the format mm/dd/aa
     */
    public String getDate() {
        return date;
    }

    /**
     * title of the song can't be changed, but it's here by convention <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param date date when the song was created, must be different null and must
     *             be a String with the format mm/dd/aa
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * allows you to take the duration song <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param durationSong duration of the song, and must be different null and must
     *                     be a String with the format mm/ss
     */
    public String getDurationSong() {
        return durationSong;
    }

    /**
     * Duration song can't be changed, but it's here by convention <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param durationSong duration of the song, and must be different null and must
     *                     be a String with the format mm/ss
     */
    public void setDurationSong(String durationSong) {
        this.durationSong = durationSong;
    }

    public String getGenre() {
        return genre;
    }

    /**
     * allows you to change the duration of the song, String to int <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     *
     */
    public int durationToSeconds() {
        int secondsDuration = 0;
        String[] durationParts = durationSong.split(":");
        int min = Integer.parseInt(durationParts[0]);
        int sec = Integer.parseInt(durationParts[0]);
        secondsDuration = (min * 60) * sec;
        return secondsDuration;
    }

    /**
     * allows you to seen carcateristics of the song <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     */
    public String showContents() {
        String contents = "**************  Cancion **************" + "/n";
        contents += "**  Titulo: " + getTitle() + "/n";
        contents += "**  Artista: " + getNameArtist() + "/n";
        contents += "**  Duracion: " + getDurationSong() + "/n";
        contents += "**  Genero: " + getGenre() + "/n";
        contents += "***********************************" + "/n";
        return contents;
    }

}
