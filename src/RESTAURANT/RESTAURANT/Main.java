package RESTAURANT;

public class Main {
    public static void main(String[] args) {
        Manager men=new Manager("Nurdaulet", "Yessengeldi", "Manager");
       // System.out.println(men.getLogin());
        Restaurant res=new Restaurant();
        res.restaurantMenu();
      // Database rest=Database.getInstance();
     //  rest.getdata("SELECT * FROM employee");

    }
}

