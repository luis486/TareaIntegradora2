package model;

public class Song {
    private String title;
    private String nameArtist;
    private String date;
    private String durationSong;

    public Song(String title, String nameArtist, String date, String durationSong){
    this.title= title;
    this.nameArtist= nameArtist;
    this.date= date;
    this.durationSong= durationSong;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title= title;
    }
    public String getNameArtist(){
        return nameArtist;
    }
    public void setNameArtist(String nameArtist){
        this.nameArtist= nameArtist;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date= date;
    }
    public String getDurationSong(){
        return durationSong;
    }
    public void setDuationSong(String durationSong){
        this.durationSong= durationSong;
    }






}
