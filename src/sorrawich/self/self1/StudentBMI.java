package sorrawich.self.self1;

import sorrawich.self.self1.model.Student;

public class StudentBMI {

    public static String[] bmiStudents(Student[] students) {
        String[] response = new String[students.length];
        for(int i = 0; i < students.length; i++) {
            response[i] = bmiCategory(students[i]);
        }
        return response;
    }

    public static String bmiCategory(Student student) {
        double bmi = student.getBMI();

        if(bmi < 0)
            return "none";
        else if(bmi < 18.5)
            return "under weight";
        else if(bmi < 25)
            return "normal weight";
        else if(bmi <= 30)
            return "over weight";
        else
            return "obesity";
    }

}
