package RESTAURANT;

import java.util.Scanner;

public class Manager extends Administration implements fullyStuffChange, menuPricing {
    Scanner userChoice=new Scanner(System.in);
    Scanner userInput=new Scanner(System.in);
    private String login="Nurda02";
    private String password="daulet2002";
    public String gettingLogin(){
        return login;
    }
    public String gettingPassword(){
        return password;
    }
    public Manager(String name, String surname, String position){
        super(name, surname, position);
        super.setName(name);
        super.setSurname(surname);
        super.setPosition(position);
        super.changeLogin(login);
        super.changePassword(password);
    }
    public void managerMenu(){
        System.out.println("1: Add employee");
        System.out.println("2: View employee");
        System.out.println("3: Delete employee");
        System.out.println("4: Set salary");
        System.out.println("5:Set prices");
        System.out.println("6: Go to main");
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
     else  if(choice==6){
          Restaurant res=new Restaurant();
          res.restaurantMenu();
       }
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
        System.out.println("Employee id:");
        int id=userInput.nextInt();
        System.out.println("Employee name:");
        String name= userInput.nextLine();
        System.out.println("Employee surname:");
        String surname=userInput.nextLine();
        System.out.println("Employee position:");
        String position=userInput.nextLine();
        System.out.println("Employee salary:");
        int salary=userInput.nextInt();
        System.out.println("Employee section:");
        String section=userInput.nextLine();
        dbConnect addEmployee=dbConnect.getInstance();
        addEmployee.SQL("INSERT INTO employee"+"VALUES("+id+","+"'"+name+"','"+surname+
                "','"+position+","+ salary+','+section+"')");
        System.out.println("Do you want add more?");
        String command=userInput.nextLine();
        if(command.toLowerCase().equals("yes")){
            addStuff();
        }
        else if(command.toLowerCase().equals("no")){
            managerMenu();
        }
    }

    @Override
    public void viewStuffs() {
        Database rest=Database.getInstance();
        rest.getdata("SELECT * FROM employee");
    }

}
