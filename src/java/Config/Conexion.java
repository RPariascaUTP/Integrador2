package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nelynoe
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/cxp?useSSL=false";
    String user="root";
    String pass="8520";
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            if (con!=null){
                System.out.println("Conexion exitosa!!!");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error siguiente: "+e.getMessage());
        }
        return con;
        
    }
}
