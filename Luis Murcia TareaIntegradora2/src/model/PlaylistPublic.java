package model;

public class PlaylistPublic extends Playlist{
    
private double calification;

    public PlaylistPublic(String playlistName, double calification) {
        super(playlistName);
        this.calification = calification;
    }

    public double getCalification() {
        return this.calification;
    }

    public void setCalification(double calification) {
        this.calification = calification;
    }
    @Override
    public String showContents(){
        String contents = super.contents()+"\n";
            contents+="Calificacion Promedio: "+calification+"/n"+"****************************************";
            return contents;
        }
}
