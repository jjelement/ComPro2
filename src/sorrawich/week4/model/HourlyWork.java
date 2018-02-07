package sorrawich.week4.model;

public class HourlyWork extends Employee {
    private double hourWork;

    public double getHourWork() {
        return hourWork;
    }

    public void setHourWork(double hourWork) {
        this.hourWork = hourWork;
    }

    @Override
    public double pay() {
        return payRate*hourWork;
    }

    @Override
    public String toString() {
        return "HourlyWork{" +
                "hourWork=" + hourWork +
                '}';
    }
}
