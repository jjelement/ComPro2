package sorrawich.week4;

import sorrawich.week4.model.Employee;
import sorrawich.week4.model.Manager;

public class TestEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Pun", 50000);
        System.out.println(employee);

        Manager manager = new Manager(12, "PunPun", 100000, 12000);
        manager.setEmpId("MGN-002");
        System.out.println(manager);
        System.out.println(manager.pay());
    }
}
