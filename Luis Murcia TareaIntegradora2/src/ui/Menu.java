package ui;
import model.*;
import java.util.Scanner;

    public class Menu {

    private MSC msc; 
    Scanner sc = new Scanner(System.in);

    public Menu(){
        this.msc= new MSC();
    }
    public void showMenu(){

    System.out.println("Bienvenidos a su aplicación más confiable MSC, a continuación, podrá elegir una de las opciones en el siguiente menu");
    System.out.println("Seleccione (1) si quiere añadir un nuevo usuario");
    System.out.println("Seleccione (2) ");
    System.out.println("Seleccione (3) ");
    System.out.println("Seleccione (4) ");
    }

    public String readPlaylist(){
        String msg = "No se pudo agregar la playlist";
        System.out.println("Por favor ingrese el nombre de la playlist");
        String playlistName = sc.nextLine();
        System.out.println("Por favor ingrese el tipo de Playlist que desea agregar\n 1 Privada\n 2 Restringida\n 3 Publica");
        int type = sc.nextInt();
        return msg;
    }
    
    public void doOperation(int option) {
        switch(option) {
        case 1:
        System.out.println(readPlaylist());
            break;

        case 2:

        break;

        case 3:

        break;

        case 4:
        System.out.println("Gracias por usar esta aplicacion, vuelva pronto");
        break; 

        default:
            System.out.println("Error, opción no válida");
        }
    }

    public int readOption(){
    int option = sc.nextInt();
    sc.nextLine();
    return option;
    }

    public void startProgram(){
    int option;
    do{
        showMenu();
        option = readOption();
        doOperation(option);
    }while(option != 4);
    }
}