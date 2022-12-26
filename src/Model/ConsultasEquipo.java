
package Model;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import View.VistaJugar;
import javax.swing.JTable;


public class ConsultasEquipo extends Conexion {
    public boolean Ingresar(Equipo eq){
        PreparedStatement ps = null;
        Connection con = (Connection) getConexion();
        
        String sql = "INSERT INTO equipo (nombre, provincia, Cantidad de Juegos Jugados, Ganados, Perdidos, Average colectivo, Errores totales, Errores x Juego) VALUES(?,?,0,0,0,0,0,0)";
        
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, eq.getNombre());
            ps.setString(2, eq.getProvincia());
            
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                System.err.println(e);
            }
        }
       
    }
     public boolean Modificar(Equipo eq)
    {
        PreparedStatement ps = null;
        Connection con = (Connection) getConexion();
        
        String sql = "UPDATE equipo SET nombre=?, provincia=? WHERE ID=?";
        
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, eq.getNombre());
            ps.setString(2, eq.getProvincia());
            ps.setInt(3, eq.getId());
           
            ps.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
                
            }catch(SQLException e){
                System.err.println(e);
            }
        }
       
    }
      public void RellenarTabla(String tabla, JTable jTable1){
           String sql ="Select * from equipo";
        Statement st;
        Conexion con = new Conexion();
        java.sql.Connection conexion = con.getConexion();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Provincia");
        
        jTable1.setModel(model);
        String [] dato = new String[2];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                
            }
        }catch(SQLException e){
            System.err.println(e);
        }
      }
       
    }
    

