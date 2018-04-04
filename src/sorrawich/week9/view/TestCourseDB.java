package sorrawich.week9.view;

import sorrawich.week9.controller.CourseController;
import sorrawich.week9.model.Course;

import java.util.ArrayList;

public class TestCourseDB {
    public static void main(String[] args) {
        Course course = new Course("INT102", "Programming I");
        try {
            CourseController courseController = new CourseController("sit", "sit");
            System.out.println(courseController.execute("INSERT INTO course(courseId, courseName) VALUES('INT106', 'Web Technology')"));
            courseController.closeCourseConnection();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Mission Complete");
    }
}
