package ui;

import model.*;

import java.util.Scanner;

public class Menu {

    private MSC msc;
    Scanner sc = new Scanner(System.in);

    public Menu() {
        this.msc = new MSC();
    }

    /**
     * Allows know what do you wanna to do in the aplication <br>
     * <b> pre: </b><br>
     * <b> post </b> The option is correct <br>
     * 
     * 
     */
    public void showMenu() {
        System.out.println(
                "Bienvenidos a su aplicación mas confiable MSC, a continuacion, podra elegir una de las opciones en el siguiente menu");
        System.out.println("Seleccione (1) si quiere añadir un nuevo usuario");
        System.out.println("Seleccione (2) si quiere añadir una nueva cancion");
        System.out.println("Seleccione (3) si quiere crear una playlist");
        System.out.println("Seleccione (4) si quiere agregar una cancion a una playlist");
        System.out.println("Seleccione (5) si desea observar todos los usuarios en la aplicacion");
        System.out.println("Seleccione (6) si desea observar todas las canciones de la aplicacion");
        System.out.println("Seleccione (7) si desea observar las playlists del MSC");
        System.out.println("Seleccione (8) desea calificar un playlist de tipo PUBLICO");
        System.out.println("Seleccione (9) quiere otorgar acceso a un usuario de playlist RESTRINGIDO");
        System.out.println("Seleccione (10) salir");
    }

    /**
     * Allows create the user <br>
     * <b> pre: </b><br>
     * <b> post </b> The user has been created <br>
     * 
     */
    public String readUser() {
        System.out.println("Ingrese el nombre del usuario");
        String name = sc.nextLine();
        System.out.println("Ingrese la contraseña del usuario");
        String password = sc.nextLine();
        System.out.println("Ingrese la edad del usuario");
        int age = sc.nextInt();
        sc.nextLine();
        String message = msc.addUser(name, password, age);
        return message;
    }

    /**
     * Allows create the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> The playlist has been created <br>
     * 
     */
    public String readPlaylist() {
        String message = "No se pudo agregar la playlist";
        System.out.println("Por favor ingrese el nombre de la playlist");
        String playlistName = sc.nextLine();
        System.out.println("Por favor ingrese 1 si es para playlist publica, 2 para privada y 3 para restringida");
        int type = sc.nextInt();
        switch (type) {
            case 1:
                System.out.println(
                        "Crear el unico usuario con acceso a la Playlist " + (char) 34 + playlistName + (char) 34);
                System.out.println("Ingrese el nombre del usuario: ");
                String name = sc.nextLine();
                System.out.println("Ingrese la contrasena del usuario: ");
                String password = sc.nextLine();
                System.out.println("Ingrese la edad del usuario: ");
                int age = sc.nextInt();
                sc.nextLine();
                message = msc.addPlaylist(playlistName, name, password, age);
                break;

            case 2:

            case 3:

            default:
        }
        return message;
    }

    /**
     * Allows create one of the the possible playlists <br>
     * <b> pre: </b><br>
     * <b> post </b> The playlist has been created <br>
     * 
     */
    public String readAddSong() {
        String message = "";
        System.out.println("Ingrese el nombre de usuario que creara la cancion");
        String name = sc.nextLine();
        System.out.println("Ingrese la contraseña del usuario que creara la cancion");
        String password = sc.nextLine();
        boolean testUser = msc.findUser(name, password);
        if (testUser) {
            System.out.println("Ingrese el nombre de la cancion");
            String title = sc.nextLine();
            System.out.println("Ingrese el nombre del artista");
            String nameArtist = sc.nextLine();
            System.out.println("Ingrese la fecha de creacion en dia, mes y año");
            String date = sc.nextLine();
            System.out.println("Ingrese la duracion de la cancion en minutos y segundos");
            String durationSong = sc.nextLine();
            System.out.println("Por favor ingrese el genero de la canción");
            System.out.println("(1) Rock");
            System.out.println("(2) Hip Hop");
            System.out.println("(3) Musica Clasica");
            System.out.println("(4) Reggae");
            System.out.println("(5) Salsa");
            System.out.println("(6) Metal");
            int chooseGenre = sc.nextInt();
            sc.nextLine();
            message += msc.addSong(title, nameArtist, date, durationSong, chooseGenre);
            message += msc.updateUserCategory(name);
        }
        return message;
    }

    /**
     * Allows add song at the playlist <br>
     * <b> pre: </b><br>
     * <b> post </b> The playlist has been uptdated <br>
     * 
     */
    public String readToAddSongPlaylist() {
        String message = "";
        System.out.println("Por favor ingrese el nombre de la playlist");
        String playlistName = sc.nextLine();
        if (msc.findPlaylist(playlistName) == true) {
            System.out.println("Por favor ingrese el nombre de la cancion");
            String title = sc.nextLine();
            Song songFinal = msc.findSong(title);
            message += msc.addSongPL(playlistName, songFinal) + "/n";
            message += msc.updateGenrePlaylist(playlistName, songFinal);
        } else {
            System.out.println("La playlist " + (char) 34 + playlistName + (char) 34 + "no existe");
        }
        return message;
    }

    /**
     * Allows calificate the playlist public <br>
     * <b> pre: </b><br>
     * <b> post </b> The playlist has been uptdated <br>
     * 
     */
    public String readToCalificatePlaylist() {
        String message = "";
        System.out.println("Digite el nombre de la playlist a calificar");
        String playlistName = sc.nextLine();
        if (msc.findPlaylist(playlistName) == true) {
            System.out.println("Digite la calificacion de la playlist (1 - 5)");
            double calification = sc.nextDouble();
            sc.nextLine();
            message = msc.calificationPlaylist(playlistName, calification);
        }
        return message;
    }

    /**
     * Allows give acces to user int he playlist restricted <br>
     * <b> pre: </b><br>
     * <b> post </b> The playlist has been uptdated <br>
     * 
     */
    public String readGiveAccess() {
        String message = "";
        System.out.println("Escriba el nombre de la playlist a la que sera otorgado el acceso");
        String playlistName = sc.nextLine();
        if (msc.findPlaylist(playlistName) == true) {
            System.out.println("Ingrese el nombre de usuario al que se otorgara el acceso");
            String name = sc.nextLine();
            System.out.println("Ingrese la contraseña");
            String password = sc.nextLine();
            if (msc.findUser(name, password)) {
                System.out.println("Ingrese la edad");
                int age = sc.nextInt();
                message = msc.giveAccessUser(name, password, age, playlistName);
            } else {
                System.out.println("El usuario no ha sido registrado en la aplicacion");
            }
        }
        return message;
    }

    public void doOperation(int option) {
        switch (option) {
            case 1:
                System.out.println(readUser());
                break;

            case 2:
                System.out.println(readPlaylist());
                break;

            case 3:
                System.out.println(readAddSong());
                break;

            case 4:
                System.out.println(readToAddSongPlaylist());
                break;
            case 5:
                System.out.println();
                break;
            case 6:
                System.out.println();
                break;
            case 7:
                System.out.println();
                break;
            case 8:
                System.out.println(readToCalificatePlaylist());
                break;
            case 9:
                System.out.println(readGiveAccess());
                break;
            case 10:
                System.out.println("Gracias por usar esta aplicacion, vuelva pronto");
                break;

            default:
                System.out.println("Error, opción no válida");
        }
    }

    /**
     * Allows read the option <br>
     * <b> pre: </b><br>
     * <b> post </b> The option is correct <br>
     * 
     */
    public int readOption() {
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    /**
     * Allows start the programt <br>
     * <b> pre: </b><br>
     * <b> post </b> The program are running <br>
     * 
     */
    public void startProgram() {
        int option;
        do {
            showMenu();
            option = readOption();
            doOperation(option);
        } while (option != 10);
    }
}