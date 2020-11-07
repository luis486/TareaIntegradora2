package model;

public class User {

    private UserCategory[] UCategory = UserCategory.values();
    private String name;
    private String password;
    private int age;
    private String category;
    private int songsShared;

    /**
     * Allows create the constructor in the class User <br>
     * <b> pre: </b><br>
     * <b> post </b> The constructor has been created <br>
     * 
     * @param name     name of the user, must be different null and must be a String
     *                 without spaces
     * @param password password of the user, must be different null and must be a
     *                 String without spaces
     * @param age      age of the user, must be different null and must be a int
     */
    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.category = UCategory[0].name();
    }

    /**
     * allows you to take the user's name <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param name name of the user, must be different null and must be a String
     *             without spaces
     */
    public String getName() {
        return name;
    }

    /**
     * allows you to change the user's name <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param name name of the user, must be different null and must be a String
     *             without spaces
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * allows you to take the password <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param password password of the user, must be different null and must be a
     *                 String without spaces
     */
    public String getPassword() {
        return password;
    }

    /**
     * allows you to change the password <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param password password of the user, must be different null and must be a
     *                 String without spaces
     */
    public void setPasword(String password) {
        this.password = password;
    }

    /**
     * allows you to take the age <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param age age of the user, must be different null and must be a int
     */
    public int getAge() {
        return age;
    }

    /**
     * age can't be changed, but it's here by convention <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param age age of the user, must be different null and must be a int
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * allows you to take category <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param category only you can be, newbie, little contributor, mild contributor
     *                 and star contributor
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * allows you to change category to acord the shares in the poolsong <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     * 
     * @param category only you can be, newbie, little contributor, mild contributor
     *                 and star contributor
     */
    public void setCategory() {
        this.songsShared++;
        if (this.songsShared < 3) {
            this.category = UCategory[0].name();
        }
        if (this.songsShared < 10) {
            this.category = UCategory[1].name();
        }
        if (this.songsShared < 30) {
            this.category = UCategory[2].name();
        } else {
            this.category = UCategory[3].name();
        }
    }

    /**
     * allows you to seen caracteristics of the user <br>
     * <b> pre: </b><br>
     * <b> post </b> <br>
     */
    public String showContents() {
        String contents = " ************* Usuario **************" + "/n";
        contents += "**  Nombre del Usuario: " + name + "/n";
        contents += "**  Edad: " + age + "/n";
        contents += "**  Categoria: " + category + "/n";
        contents += "*********************************";
        return contents;
    }

}