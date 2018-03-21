package sorrawich.week5;

import sorrawich.week5.models.UnderGraduatedStudent;

public class TestStudent {
    public static void main(String[] args) {
        UnderGraduatedStudent underGraduatedStudent = new UnderGraduatedStudent(60093, "Sorrawich", "MobileApplication");
        System.out.println(underGraduatedStudent.toString());
    }
}