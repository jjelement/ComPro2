package sorrawich.week8.models;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String color, int legCount) {
        super(color, legCount);
    }

    @Override
    public int getLegCount() {
        return 4;
    }
}
