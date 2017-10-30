/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll ;
import java.sql.* ;
import javax.swing.* ; 

/**
 *
 * @author ervinpepic
 */
public class db {
    
    Connection conn = null ;
    public static Connection java_db() {
        
        try {
            
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ervinpepic/Documents/DesktopApps/JavaApps/EmployeePayroll/mydatabase.sqlite");
            return conn;
            
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }
}
