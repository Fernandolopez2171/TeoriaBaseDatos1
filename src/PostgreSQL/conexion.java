package PostgreSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;
import proyecto.VistaAdmin;

public class conexion {
    Connection conn=null;
    String url = "jdbc:postgresql://localhost:5432/Empresa";
    String usuario = "postgres";
    String clave = "root";
     
    public Connection conectar(){
        try{
           Class.forName("org.postgresql.Driver");
           conn= DriverManager.getConnection(url,usuario,clave);
           
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Conexion fallida" + e,"Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
       public Connection cerrar(){
        try{
           conn.close();
           
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Desconexion fallida" + e,"Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
       
  
       public Connection getConex(){
       return conn;
       }
       
 public void ejecutarSQL(String sql){
           conexion a = new conexion();
           PreparedStatement ps;
           a.conectar();
           try{
              ps = a.getConex().prepareStatement(sql);
              ps.execute();
              ps.close();
              a.cerrar();
              JOptionPane.showMessageDialog(null,"Consulta Exitosa!","Consulta",JOptionPane.INFORMATION_MESSAGE);
           }catch(SQLException e){
               Logger.getLogger(VistaAdmin.class.getName()).log(Level.SEVERE,null,e);
           }
       }
}
