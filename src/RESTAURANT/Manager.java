package RESTAURANT;

public class Manager extends Employee implements fullyStuffChange, menuPricing {
    private String name;
    private String surname;
    private String position;
    public Manager(String name, String surname){
        super(name, surname);
        position = "Manager";
    }
    @Override
    public void updateStuff() {

    }

    @Override
    public void setPrise() {

    }

    @Override
    public void viewMenu() {

    }

    @Override
    public void deleteStuff() {

    }

    @Override
    public void addStuff() {

    }

    @Override
    public void viewStuffs() {

    }
}
