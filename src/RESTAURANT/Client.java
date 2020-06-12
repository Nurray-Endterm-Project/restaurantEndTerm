package RESTAURANT;

import java.util.ArrayList;

public class Client implements menuFeatures {
    private int id;
    private static int id_gen = 0;
    private String name;
    private String surname;
    public Client(String name, String surname){
        id = id_gen++;
        this.name = name;
        this.surname = surname;
    }
    public int getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    @Override
    public ArrayList<String> viewMenu() {

    }
}
