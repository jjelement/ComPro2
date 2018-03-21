package sorrawich.week8.models;

public class Bird extends Animal implements CanFly {

    @Override
    public int getLegCount() {
        return 2;
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
