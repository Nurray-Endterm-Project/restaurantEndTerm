package RESTAURANT;
import java.util.Scanner;
public class Restaurant {
    //KitchenManager k_manager;
    //Manager manager;
    //ExecutiveChef chef;
    Scanner userChoice=new Scanner(System.in);
    Scanner userInput=new Scanner(System.in);
    public void restaurantInfo(){

    }
    public void restaurantMenu(){
        System.out.println("Hello, who are you?");
        System.out.println("1: Manager");
        System.out.println("2: Kitchen Manager");
        System.out.println("3:Executive Chef");
        System.out.println("4: Client");
        int choice=userChoice.nextInt();
        if(choice==1){
            Manager manager= new Manager("Nurdaulet", "Yessengeldi", "manager");
            System.out.println("Enter your login:");
            String login=userInput.nextLine();
            System.out.println("Enter your password:");
            String password=userInput.nextLine();
           if(login.equals(manager.gettingLogin())&&password.equals(manager.gettingPassword())){
                System.out.println("Hello, mr"+manager.getName());
                manager.managerMenu();
            }
            else {
                System.out.println("Incorrect Login or Password!");
               restaurantMenu();
            }

        }
        else if(choice==2){
            KitchenManager manager=new KitchenManager("Arailym", "Talgatkyzy", "kitchen manager");
            System.out.println("Enter your login:");
            String login=userInput.nextLine();
            System.out.println("Enter your password:");
            String password=userInput.nextLine();
            if(login.equals(manager.getLogin())&&password.equals(manager.getPassword())){
                System.out.println("Hello, ms "+manager.getName());
               manager.kitchenManagerMenu();
            }
            else{
                System.out.println("Incorrect login or Password!");
                restaurantMenu();
            }

        }
    }

}
