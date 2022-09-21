/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Mantenimiento;

import PostgreSQL.conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.Usuario;
import proyecto.VistaAdmin;

/**
 *
 * @author AxelM
 */
public class MantenimientoCliente extends javax.swing.JFrame {
    
    /**
     * Creates new form CREARUSER
     */
    DefaultTableModel modelo;
    String info[] = new String[4];
    public MantenimientoCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.ORANGE);
        Actualizar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NAMETEXT = new javax.swing.JTextField();
        CANTPAQTEXT = new javax.swing.JTextField();
        DIRETEXT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        IDTEXT = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jButton4.setText("MODIFICAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MANTENIMIENTO DE TABLAS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("TELEFONO:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DIRECCION:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("DATOS GENERALES");

        NAMETEXT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NAMETEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMETEXTActionPerformed(evt);
            }
        });

        CANTPAQTEXT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CANTPAQTEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANTPAQTEXTActionPerformed(evt);
            }
        });

        DIRETEXT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DIRETEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIRETEXTActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("ID:");

        IDTEXT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("CREAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("MODIFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("ELIMINAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NAMETEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CANTPAQTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DIRETEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jLabel6))
                            .addComponent(jButton2))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(IDTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(NAMETEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CANTPAQTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DIRETEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NAMETEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMETEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMETEXTActionPerformed

    private void CANTPAQTEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANTPAQTEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANTPAQTEXTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String ID = IDTEXT.getText();
        String nombre = NAMETEXT.getText();
        String Direccion = DIRETEXT.getText();
        String Telefono = CANTPAQTEXT.getText();
	int number = Integer.parseInt(Telefono);
        
          if(ID.equals("")||nombre.equals("")||Telefono.equals("")||Direccion.equals("")){
                JOptionPane.showMessageDialog(null, "Falta ingresar un dato");
            }else{
            conexion consulta = new conexion();
            String sql;
            sql="INSERT INTO \"Cliente\"(\"Id_Cliente\",\"Nombre\",\"Telefono\",\"Direccion\")VALUES('"+ID+"','"+nombre+"','"+number+"','"+Direccion+"')";
            consulta.ejecutarSQL(sql);
            lim();
            limpiar();
            Actualizar();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String ID = IDTEXT.getText();
        String nombre = NAMETEXT.getText();
        String Direccion = DIRETEXT.getText();
        String Telefono = CANTPAQTEXT.getText();
	int number = Integer.parseInt(Telefono);
        
          if(ID.equals("")||nombre.equals("")||Telefono.equals("")||Direccion.equals("")){
                JOptionPane.showMessageDialog(null, "Falta ingresar un dato");
            }else{
            conexion consulta = new conexion();
            String sql;
            
            sql = "Update \"Cliente\" set \"Id_Cliente\"='"+ID+"',\"Nombre\"='"+nombre+"',\"Direccion\"='"+Direccion+"',\"Telefono\"="+number+"Where \"Id_Cliente\"='"+ID+"'";
            consulta.ejecutarSQL(sql);
            lim();
            limpiar();
            Actualizar();
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String ID = IDTEXT.getText();

          if(ID.equals("")){
                JOptionPane.showMessageDialog(null, "Falta ingresar un dato");
            }else{
            conexion consulta = new conexion();
            String sql;
            //Al borrar un cliente se tiene que borrar su usuario por completo y despues eliminar al cliente
            //esto se debe a la relacion foranea se debe eliminar en cascada.
            sql="DELETE FROM \"Usuarios\" WHERE \"Id_Cliente\"='"+ID+"'";
            consulta.ejecutarSQL(sql);
            
            sql="DELETE FROM \"Cliente\" WHERE \"Id_Cliente\"='"+ID+"'";
            consulta.ejecutarSQL(sql);
            lim();
            limpiar();
            Actualizar();
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VistaAdmin ad = new VistaAdmin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void lim(){
        IDTEXT.setText("");
        NAMETEXT.setText("");
        DIRETEXT.setText("");
        CANTPAQTEXT.setText("");
    }
    private void DIRETEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIRETEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DIRETEXTActionPerformed
    public void Actualizar(){
       String validarId;
       String validarNombre;
       String validarTelefono;
       String validarDireccion;
       ResultSet resultado;
       
       modelo = new DefaultTableModel();
       modelo.addColumn("ID");
       modelo.addColumn("NOMBRE");
       modelo.addColumn("TELEFONO");
       modelo.addColumn("DIRECCION");
       
        try {
            //Extraer los datos SQL
            resultado = consultarDB();
            while(resultado.next()){
               validarId = resultado.getString("Id_Cliente");
               validarNombre=resultado.getString("Nombre");
               validarTelefono=resultado.getString("Telefono");
               validarDireccion=resultado.getString("Direccion");
               lista(validarId,validarNombre,validarTelefono,validarDireccion);
             }             
        }catch (Exception ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
   
    public void lista(String id,String nombre, String tel, String dir) {
        
     
        //DARLE LOS TITULOS A LAS COLUMNAS
       
        this.tabla.setModel(modelo);
            info[0] =id;
            info[1] = nombre;
            info[2] = tel;
            info[3] = dir;
            //SE LE AGREGA LA FILA A LA TABLA
            modelo.addRow(info);    
    }
    public void limpiar(){
        modelo=(DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
    }
        public ResultSet consultarDB() throws Exception{
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        Statement sentencia = null;
        try{
           String Consulta ="SELECT * FROM \"Cliente\"";  
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(Consulta);
           return resultado;
        }catch(Exception e){
            throw new Exception("Error al consultar DB");
        }finally{
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CANTPAQTEXT;
    private javax.swing.JTextField DIRETEXT;
    private javax.swing.JTextField IDTEXT;
    private javax.swing.JTextField NAMETEXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
