package sorrawich.week4.model;

public class Employee {
    private long empId;
    private String empName;
    protected double payRate;

    public Employee() {
    }

    public Employee(long empId, String empName, double payRate) {
        this.empId = empId;
        this.empName = empName;
        this.payRate = payRate;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double pay() {
        return payRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", payRate=" + payRate +
                '}';
    }
}
