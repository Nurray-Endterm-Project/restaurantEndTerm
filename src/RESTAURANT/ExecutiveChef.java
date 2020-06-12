package RESTAURANT;

import java.util.ArrayList;

public class ExecutiveChef extends Employee implements menuChange {
    private String name;
    private String surname;
    private String position;
    public static ArrayList<Foods> menu;
    public ExecutiveChef(String name, String surname){
        super(name, surname);
        position = "ExecutiveChef";
    }
    @Override
    public void deleteMenu() {
        menu.clear();
    }

    @Override
    public void updateMenu(ArrayList<Foods> foods) {
        for (Foods food:
             foods)
            menu.add(food);
    }

    @Override
    public void viewMenu() {
        for (Foods food:
             menu) {
            System.out.println(food);
        }
    }
}
