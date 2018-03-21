package sorrawich.week7;

import sorrawich.week7.models.Medicine;
import sorrawich.week7.models.Paracetamol;

public class TestMedicable {
    public static void main(String[] args) {
        /*String[] ingredients = {"A", "B", "C"};
        MedicAble medicAble;
        Medicine medicine = new Medicine(1, "ABC", ingredients, "Exam Prevention", "Don't take over 2 times per day");
        System.out.println(medicine.medicProperties());

        Medicine paracetamol = new Paracetamol(500, 2, "Tylinol", ingredients, "Headache Prevention", "Don't take over 1 time per day");
        System.out.println(paracetamol.medicProperties());*/

        Medicine medicine = new Medicine();
        System.out.println(medicine.properties);

        medicine = new Paracetamol();
        System.out.println(medicine.properties);
    }
}
