package sorrawich.week9.view;

import sorrawich.week9.controller.CourseController;
import sorrawich.week9.model.Course;

import java.util.ArrayList;

public class TestCourseDB {
    public static void main(String[] args) {
        try {
            CourseController courseController = new CourseController("db.properties");
            ArrayList<Course> courses = courseController.selectCourse();
            for(Course course : courses) {
                System.out.println(course);
            }
            courseController.closeCourseConnection();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Mission Complete");
    }
}
