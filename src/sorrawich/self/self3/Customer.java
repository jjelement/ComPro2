package sorrawich.self.self3;

public abstract class Customer {
    private String name;
    private String surname;

    public Customer() {
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract double getDiscountRate();
    public abstract void setDiscountRate(double discountRate);
    public abstract void addPointFromBuyingTotalPrice(double buyingPrice);
    public abstract double redeemPoint2Cash(int usePoints);

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
