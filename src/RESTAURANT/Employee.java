package RESTAURANT;

public abstract class Employee {
    private int id;
    private static int id_gen = 0;
    private String name;
    private String surname;
    private String position;
    private int salary;
    public Employee(String name, String surname){
        id = id_gen++;
        this.name = name;
        this.surname = surname;
        salary = 0;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }
}
