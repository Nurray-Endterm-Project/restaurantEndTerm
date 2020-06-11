package RESTAURANT;

public class Administration extends Employee {
    private String login;
    private String password;
    public void changePassword(String pass){
        this.password=pass;
    }
    public void changeLogin(String login){
        this.login=login;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
}
