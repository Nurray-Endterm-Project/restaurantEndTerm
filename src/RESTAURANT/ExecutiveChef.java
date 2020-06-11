package RESTAURANT;

import java.util.ArrayList;

public class ExecutiveChef extends Employee implements menuChange {
    public static ArrayList<Foods> menu;
    @Override
    public void deleteMenu() {

    }

    @Override
    public void updateMenu(ArrayList<Foods> foods) {
        for (food:
             foods) {
            menu.add(food);
        }
    }

    @Override
    public void setMenu(ArrayList<Foods> foods) {
        this.menu = foods;
    }

    @Override
    public void viewMenu() {

    }
}
