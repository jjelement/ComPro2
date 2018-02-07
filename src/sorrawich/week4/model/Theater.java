package sorrawich.week4.model;

public class Theater {
    private String name;

    public Theater() {
    }

    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                '}';
    }
}
