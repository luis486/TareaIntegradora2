package model;

public class PlaylistPrivate extends Playlist{
    
    private String userOne;

    public PlaylistPrivate(String playlistName, String userOne) {
        super(playlistName);
        this.userOne = userOne;
    }

    public String getUserOne() {
        return this.userOne;
    }

    public void setUserone(String userOne) {
        this.userOne = userOne;
    }
    @Override
    public String showContents(){
        String contents = super.contents()+"\n";
            contents+="Propietario: "+getUserOne()+"\n"+"****************************************";
            return contents;
        }
    

}
