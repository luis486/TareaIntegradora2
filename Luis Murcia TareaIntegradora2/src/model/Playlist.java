package model;

public abstract class Playlist {
    private String playlistName;
    private String duration;
    private String genreSet;

    public Playlist(String playlistName){
    genreSet="";
    duration="";
    this.playlistName= playlistName;
    }
    public String getPlaylistName(){
        return playlistName;
    }
    public void setPlaylistName(String playlistName){
        this.playlistName= playlistName;
    }
    public String getDuration(){
        return duration;
    }
    public void setDuration(String duration){
        this.duration= duration;
    }
    public String getGenreSet(){
        return genreSet;
    }
    public void setGenreSet(String genreSet){
        this.genreSet= genreSet;
    }
    public abstract String showContents();
	public String contents(){
    String contents=   "**************  Playlist **************/n";
            contents+= "**  Nombre de la playlist: "+getPlaylistName()+"/n";
            contents+= "**  Duration: "+ getDuration()+"/n";
            contents+= "**  Genre: "+getGenreSet()+"/n";
        return contents;
		}
}
