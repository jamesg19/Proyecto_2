
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class ConectorDB {
    
    public static final String USERNAME="root";
    public static final String PASSWORD="Guatemala13.";
    //public static final String URL="jdbc:mysql://localhost:3306/hospital";
    public static final String URL="jdbc:mysql://localhost:3306/tienda?useTimezona=true&serverTimezone=CST";
    public static Connection con;
    

    public static Connection getConnection(){
    try{
        
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    con =(Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);

    } catch(Exception e){

    }
    return con;   
    }
    
    
    public static void cerrarConector(){
        try{
            if(con != null)
            con.close();
        } catch (Exception e){
        System.out.println("Error: No se logro cerrar conexion:\n"+e);
    }
    }
    
    
    
}
