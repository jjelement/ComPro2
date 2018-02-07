package self.self1;

import org.junit.Test;
import static org.junit.Assert.*;
import sorrawich.self.self1.model.Student;
import sorrawich.self.self1.StudentBMI;

/**
 *
 * @author Wind
 */
public class StudentBMITest {
   private Student std[];
           
   public StudentBMITest() {
      std = new Student[] {
              new Student("Cherprang", 20, 1.2), new Student("Pun", 37, 1.4),
              new Student("Noey", 50, 1.4),new Student("Jane",110, 1.9),
              new Student("A",-1, 1),new Student("B",1, 0),new Student("C",1, -1)
          };
   }
   
   @Test
   public void bmiOfAllStudent() {
        String expect[] = {"under weight", "normal weight", "over weight", "obesity","none","none","none"};
        String actual[] = StudentBMI.bmiStudents(std);
        assertArrayEquals(expect, actual);
   }
   
   
   
}
