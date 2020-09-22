
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james
 */
public class ConectorDB {
    
        public static final String USERNAME="root";
    public static final String PASSWORD="Guatemala13.";
    //public static final String URL="jdbc:mysql://localhost:3306/hospital";
    public static final String URL="jdbc:mysql://localhost:3306/hospital?useTimezona=true&serverTimezone=CST";
     
    

    public static Connection getConnection(){
    Connection con=null;
    try{
        
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    con =(Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
    //JOptionPane.showMessageDialog(null,"Conexion exitosa");
    
    } catch(Exception e){
    
    
    
    }
    return con;   
        
    
    }
    
}
