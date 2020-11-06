package model;

public class PlaylistRestricted extends Playlist{
    
    private final static int MAX_USERS_ALLOWED=5;
    private String[] userAllowed;

    public PlaylistRestricted(String playlistName, String[] userAllowed) {
        super(playlistName);
        this.userAllowed = userAllowed;
    }

    public String[] getUserAllowed() {
        return this.userAllowed;
    }

    public void setUserAllowed(String[] userAllowed) {
        this.userAllowed = userAllowed;
    }
    public String showUsers(){
		String message="Usuarios Autorizados:"+"/n";
		for(int i=0;i<MAX_USERS_ALLOWED;i++){
			if(userAllowed[i] != null){
				message +=" "+userAllowed[i]+"/n";
			}
		}
		return message;
	}

    @Override
    public String showContents(){
        String contents = super.contents()+"\n";
            contents+="Propietarios: "+showUsers()+"\n"+"****************************************";
            return contents;
    }

     
    
}
