package sorrawich.week8.models;

public class Animal {
    private String color;
    private int legCount;

    public Animal() {
    }

    public Animal(String color, int legCount) {
        this.color = color;
        this.legCount = legCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }
}
