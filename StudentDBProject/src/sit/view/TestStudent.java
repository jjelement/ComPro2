/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.sql.SQLException;
import sit.controller.StudentController;

/**
 *
 * @author INT105
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try{
            //(DriverClass,ConnectionString,username,psw)
        StudentController stdCtrl = new   StudentController ();
        stdCtrl.connectStudentDB("org.apache.derby.jdbc.EmbeddedDriver", "jdbc:derby://localhost:1527/student", "sit", "sit");
        stdCtrl.selectALLStudent("select *from student");
        }
        catch(ClassNotFoundException cf){
            System.out.println(cf);
        
        }
        catch(SQLException sql){
            System.out.println(sql);
        }
        
    }
    
}
