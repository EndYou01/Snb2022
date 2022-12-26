
package Model;


import static Controller.NuevoEquipoController.ventana;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.jdbc.Connection;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;



import javax.swing.table.DefaultTableModel;




public class Conexion {
    private final String base = "proyecto";
    private final String user = "root";
    private final String pass = "";
    private final String url = "jdbc:mysql://localhost:3306/proyecto";
    private Connection con = null;
    DefaultTableModel model = new DefaultTableModel();
    
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            
            
            
        }catch(SQLException e){
            System.err.println(e);
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
     public void RellenarTabla(String tabla, JTable jTable1){
        String sql ="Select * from equipo";
        Statement st;
        Conexion con = new Conexion();
        java.sql.Connection conexion = con.getConexion();
        
        
        model.addColumn("Nombre");
        model.addColumn("Provincia");
        
        jTable1.setModel(model);
        String [] fila = new String[2];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                
                model.addRow(fila);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
      }
     public void BtnEliminar(String nombre) {
         String sql = "DELETE FROM `equipo` WHERE nombre = " + '"' + nombre + '"';
         Statement st;
         Connection conexion = getConexion();
         try{
             st = conexion.createStatement();
             int rs = st.executeUpdate(sql);
             
         }catch(SQLException e){
             System.out.println(e);
         }}
    
     public void IngresarEquipo(JTextField txtNombreEquipoActionPerformed, JTextField txtProvinciaActionPerformed)
     {
     String sql = "INSERT INTO equipo(nombre,Provincia) values(" + '"' +  txtNombreEquipoActionPerformed.getText() + '"' + ", " + '"'+ txtProvinciaActionPerformed.getText() + '"' + ")";
     Statement st;
     Connection conexion = getConexion();
         try{
             st = conexion.createStatement();
             int rs = st.executeUpdate(sql);
             
             
             
         }catch(SQLException e){
             System.out.println(e);
         }
     }
     public void IngresarJ(){
         Connection con = getConexion();
         Statement st;
     if(ventana.getCboxPitchers().isEnabled() == true){
     String sql = "INSERT INTO jugadores(Nombre,Numero,Equipo,Posicion,Rol) values(" + '"' +  ventana.getTxtNombreJugador().getText() + '"' + ", " + '"'+ ventana.getTxtNumeroJugador().getText()+ '"' + ", " + '"'+ ventana.getTxtNombreEquipo().getText()  + '"' + ", " + '"'+ ventana.getCboxPosicion().getSelectedItem() + '"' + ", " + '"'+ ventana.getCboxPitchers().getSelectedItem() + '"' + ')';
         try{
             st = con.createStatement();
             int rs = st.executeUpdate(sql); 
         }catch(SQLException e){
             System.out.println(e);
         }
        }else if(ventana.getCboxPitchers().isEnabled() == false){
        String sql = "INSERT INTO jugadores(Nombre,Numero,Equipo,Posicion,Rol) values(" + '"' +  ventana.getTxtNombreJugador().getText() + '"' + ", " + '"'+ ventana.getTxtNumeroJugador().getText()+ '"' + ", " + '"'+ ventana.getTxtNombreEquipo().getText()  + '"' + ", " + '"'+ ventana.getCboxPosicion().getSelectedItem() + '"' + ", " + '"'+ ventana.getCboxBateadores().getSelectedItem() + '"' + ")";
         try{
             st = con.createStatement();
             int rs = st.executeUpdate(sql); 
         }catch(SQLException e){
             System.out.println(e);
         }
         }

     }
  
     
      public void RellenarTabla2(String tabla, JTable jTable2, String nombre){
        String sql ="Select Numero, Nombre, Posicion, Rol from jugadores Where Equipo = " + '"' + nombre + '"' ;
        Statement st;
        Conexion con = new Conexion();
        java.sql.Connection conexion = con.getConexion();
        
        model.addColumn("Numero");
        model.addColumn("Nombre");
        model.addColumn("Posicion");
        model.addColumn("Rol");
        
        jTable2.setModel(model);
        String [] fila = new String[4];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                model.addRow(fila);
            }
        }catch(SQLException e){
            System.err.println(e);
        }
      }
       public void EliminarJug(String nombre) {
         String sql = "DELETE FROM `jugadores` WHERE Nombre = " + '"' + nombre + '"' ;
         Statement st;
         Connection conexion = getConexion();
         try{
             st = conexion.createStatement();
             int rs = st.executeUpdate(sql);
             
         }catch(SQLException e){
             System.out.println(e);
         }}
       
       public void BtnAtras1(JTextField txtNombreEquipoActionPerformed){
         String sql = "DELETE FROM jugadores WHERE Equipo = " + '"' + ventana.getTxtNombreEquipo().getText() + '"' ;
         Statement st;
         Connection conexion = getConexion();
         try{
             st = conexion.createStatement();
             int rs = st.executeUpdate(sql);
             
         }catch(SQLException e){
             System.out.println(e);
         }}
       public void BtnAtras2(JTextField txtNombreEquipoActionPerformed){
         String sql = "DELETE FROM equipo WHERE nombre = " + '"' + ventana.getTxtNombreEquipo().getText() + '"' ;
         Statement st;
         Connection conexion = getConexion();
         try{
             st = conexion.createStatement();
             int rs = st.executeUpdate(sql);
             
         }catch(SQLException e){
             System.out.println(e);
         }}
       }
           
       

       
        
    
