package RESTAURANT;

import java.util.Scanner;

public class KitchenManager extends Administration implements stuffChange, menuReceipt {
    Scanner userChoice=new Scanner(System.in);
    Scanner userInput=new Scanner(System.in);
    Scanner input2=new Scanner(System.in);
    private String login="arai02";
    private String password="2002array";
    public KitchenManager( String name, String surname, String position){
        super(name, surname, position);
        super.setName(name);
        super.setSurname(surname);
        super.setPosition(position);
        super.changeLogin(login);
        super.changePassword(password);
    }
public void kitchenManagerMenu(){
        System.out.println("1: Add kitchen stuff");
        System.out.println("2: View kitchen stuffs");
        System.out.println("3: Delete kitchen stuffs");
        System.out.println("4: Go back");
    System.out.println("What would you like to do?");
    int choice=userChoice.nextInt();
    if(choice==1){
     addStuff();
    }
   else if(choice==2){

    }
   else if(choice==3){
       deleteStuff();
    }
   else if(choice==4){
       Restaurant res=new Restaurant();
       res.restaurantMenu();
    }
   else System.out.println("Incorrect user input!");
}
    @Override
    public void setReceipt() {

    }

    @Override
    public void viewMenu() {

    }

    @Override
    public void deleteStuff() {
        System.out.println("Employee id:");
        int choice=userChoice.nextInt();
        dbConnect delete=dbConnect.getInstance();
        delete.SQL("DELETE FROM employee where id="+choice);
        System.out.println("Do you want add more?");
        String command=userInput.nextLine();
        if(command.toLowerCase().equals("yes")){
            deleteStuff();
        }
        else if(command.toLowerCase().equals("no")){
            kitchenManagerMenu();
        }
    }

    @Override
    public void addStuff() {
        System.out.println("Employee id:");
       int id=userInput.nextInt();
        System.out.println("Employee name:");
        String name= userInput.nextLine();
        System.out.println("Employee surname:");
        String surname=userInput.nextLine();
        System.out.println("Employee position:");
        String position=userInput.nextLine();
        dbConnect changes=dbConnect.getInstance();
        changes.SQL("INSERT INTO employee(id, name, surname, position, emp_section)"+"VALUES("+id+","+"'"+name+"','"+surname+
                "','"+position+"','kitchen stuff')");
        System.out.println("Do you want add more?");
        String command=userInput.nextLine();
        if(command.toLowerCase().equals("yes")){
            addStuff();
        }
        else if(command.toLowerCase().equals("no")){
            kitchenManagerMenu();
        }
    }

    @Override
    public void viewStuffs() {

    }
}
