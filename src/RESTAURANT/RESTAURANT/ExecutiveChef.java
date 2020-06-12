package RESTAURANT;

import java.util.ArrayList;

public class ExecutiveChef extends Administration implements menuChange {
    private String login="Nurray";
    private String password="Nurray2002";
    public ExecutiveChef(String name, String surname, String position){
        super(name, surname, position);
        super.setName(name);
        super.setSurname(surname);
        super.setPosition(position);
        super.changeLogin(login);
        super.changePassword(password);
    }
    public static ArrayList<Foods> menu;
    @Override
    public void deleteMenu(ArrayList<String> foods){

    }

    @Override
    public void updateMenu(ArrayList<String> foods){

    };

    @Override
    public void setMenu(ArrayList<String> foods){

    }

    @Override
    public void viewMenu() {

    }
}