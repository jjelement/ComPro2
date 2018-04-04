package sorrawich.week9.controller;

import sorrawich.week9.db.ConnectionManager;
import sorrawich.week9.model.Course;

import javax.swing.plaf.nimbus.State;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseController {
    private Connection connection;

    public CourseController(String user, String password) throws ClassNotFoundException, SQLException {
        connection = ConnectionManager
            .createConnection(
                "jdbc:derby://localhost:1527/sorrawich/sit",
                user,
                password
            );
    }

    public void createCourseTable() throws SQLException {
        String sql = "CREATE TABLE course (" +
            "   courseId varchar(6)," +
            "   courseName varchar(50)," +
            "   primary key(courseId)" +
            ")";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("Created table success");
    }

    public void dropCourseTable() throws SQLException {
        String sql = "DROP TABLE course";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("Drop table success");
    }

    public int insertCourse(Course course) throws SQLException {
        String sql = String.format("INSERT INTO course(courseId, courseName) VALUES ('%s', '%s')",
            course.getCourseId(),
            course.getCourseName()
        );

        Statement statement = connection.createStatement();
        int result = statement.executeUpdate(sql);
        System.out.println("Insert success");
        return result;
    }

    public int insertFromFile(String fileName) throws FileNotFoundException, SQLException {
        Scanner scanner = new Scanner(new File(fileName));
        scanner.useDelimiter(",");
        int result = 0;

        String sql = "INSERT INTO course(courseId, courseName) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        while (scanner.hasNext()) {
            preparedStatement.setString(1, scanner.next().trim());
            preparedStatement.setString(2, scanner.next().trim());
            result += preparedStatement.executeUpdate();
        }
        System.out.println(result + " records inserted");
        return result;
    }

    public ArrayList<Course> selectCourse() throws SQLException {
        ArrayList<Course> courses = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM course");
        while(resultSet.next()) {
            Course course = new Course(
                resultSet.getString(1),
                resultSet.getString(2)
            );
            courses.add(course);
        }
        return courses;
    }

    public Object execute(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        boolean hasResultSet = statement.execute(sql);
        if(hasResultSet) {
            ResultSet resultSet = statement.getResultSet();
            ArrayList<Course> courses = new ArrayList<>();
            while(resultSet.next()) {
                Course course = new Course(
                    resultSet.getString(1),
                    resultSet.getString(2)
                );
                courses.add(course);
            }
            return courses;
        } else {
            return statement.getUpdateCount();
        }
    }

    public int truncateCourse() throws SQLException {
        Statement statement = connection.createStatement();
        int result = statement.executeUpdate("TRUNCATE TABLE course");
        System.out.println("Truncated");
        return result;
    }

    public void closeCourseConnection() throws SQLException {
        ConnectionManager.closeConnection(connection);
    }
}
