package sorrawich.self.self3;

public class MemberCustomer extends Customer {
    private double points;
    private static double discountRate = 0.2;

    public MemberCustomer() {
    }

    public MemberCustomer(String name, String surname, double points) {
        super(name, surname);
        this.points = points;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        MemberCustomer.discountRate = discountRate;
    }

    @Override
    public void addPointFromBuyingTotalPrice(double buyingPrice) {
        this.points += Math.floor(buyingPrice/25);
    }

    @Override
    public double redeemPoint2Cash(int usePoints) {
        if(usePoints > this.points) {
            System.out.println("Your points are not enough!");
            return -1;
        }
        int discount = (int)Math.floor(usePoints/800)*100;
        this.points -= (discount*8);
        return discount;
    }

    public double getPoints() {
        return this.points;
    }

    @Override
    public String toString() {
        return "MemberCustomer{" +
                "points=" + points +
                '}';
    }
}
