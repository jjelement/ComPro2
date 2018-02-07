package sorrawich.week4.model;

public class Manager extends Employee {
    private String empId;
    private double positionAllowance;

    public Manager(long empId, String empName, double payRate, double positionAllowance) {
        super(empId, empName, payRate);
        this.positionAllowance = positionAllowance;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(double positionAllowance) {
        this.positionAllowance = positionAllowance;
    }

    @Override
    public double pay() {
        return payRate+positionAllowance;
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() +
                " Manager Id = " + empId +
                " positionAllowance=" + positionAllowance +
                '}';
    }
}
