package myproject.week4.warmup;

public class Boss {
    private int id;
    private String name;
    private double salary;

    public Boss() {
    }

    public Boss(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary + (salary*0.25);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
