/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bitacora;

import Mantenimiento.*;
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


public class BiPaquete extends javax.swing.JFrame {

    public BiPaquete() {
        initComponents();
        this.getContentPane().setBackground(Color.ORANGE);
        this.setLocationRelativeTo(null);
        Actualizar();
    }
    DefaultTableModel modelo;
    String info[] = new String[12];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TIPOBOX = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IDTEXT = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();

        jButton4.setText("MODIFICAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("TABLA PAQUETE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TIPOBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO ENTREGADO", "ENTREGADO" }));
        TIPOBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIPOBOXActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Estado");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("DATOS GENERALES");

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

        jButton3.setText("MODIFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        jButton6.setText("ELIMINAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Hora de entrega");

        txtHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHora.setText("SIN ENTREGAR");
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(28, 28, 28)
                        .addComponent(jButton6)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IDTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TIPOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TIPOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TIPOBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIPOBOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIPOBOXActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //MODIFICAR
        String ID = IDTEXT.getText();
        String hora = txtHora.getText();
        String ESTADO = TIPOBOX.getSelectedItem().toString();
        
        if(ID.equals("")||ESTADO.equals("")){
             JOptionPane.showMessageDialog(null, "Falta ingresar un dato");
        }else{
            conexion consulta = new conexion();
            String sql;
            sql = "UPDATE \"Paquetes\" SET \"Estado\"='"+ESTADO+"',\"HoraEntregado\"='"+hora+"' WHERE \"IdPaquete\"='"+ID+"'";
            consulta.ejecutarSQL(sql);
            //limpia los textbox
            Lim();
            //limpia el Jtable
            limpiar();
            //Actualiza el Jtable con la base de datos
            Actualizar();
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VistaAdmin ad = new VistaAdmin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
//
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //ELIMINAR
                //ELIMINAR
        String ID = IDTEXT.getText();
        
        if(ID.equals("")){
             JOptionPane.showMessageDialog(null, "Falta ingresar un dato");
        }else{
            conexion consulta = new conexion();
            String sql;
            sql="DELETE FROM \"Paquetes\" WHERE \"IdPaquete\"='"+ID+"'";
            consulta.ejecutarSQL(sql);
            //limpia los textbox
            Lim();
            //limpia el Jtable
            limpiar();
            //Actualiza el Jtable con la base de datos
            Actualizar();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed


    //Lim
    public void Lim(){
        IDTEXT.setText("");
        txtHora.setText("SIN ENTREGAR");
    }
     public void limpiar(){
        modelo=(DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
    }
    public void lista(String id,String nombre, String estado, String tipo,String Direccion,String Precio,String Transporte,String user,String fin,String hora, String año) {
        this.tabla.setModel(modelo);
            info[0] = id;
            info[1] = nombre;
            info[2] = estado;
            info[3] = tipo;
            info[4] = Direccion;
            info[5] = Precio;
            info[6] = Transporte;
            info[7] = user;
            info[8] = fin;
            info[9] = hora;
            info[10] = año;
            //SE LE AGREGA LA FILA A LA TABLA
            modelo.addRow(info);    
    }
    
    public void Actualizar(){
       String validarId;
       String validarNombre;
       String validarEstado;
       String validarTipo;
       String validarDireccion;
       String validarPrecio;
       String validarTransporte;
       String validarUser;
       String validarDireccionFinal;
       String validarHora;
       String validarAño;
       ResultSet resultado;
       
       modelo = new DefaultTableModel();
       modelo.addColumn("IdPaquete");
       modelo.addColumn("Nombre");
       modelo.addColumn("Estado");
       modelo.addColumn("Tipo");
       modelo.addColumn("Direccion");
       modelo.addColumn("Precio");
       modelo.addColumn("ID_Transporte");
       modelo.addColumn("ID_User");
       modelo.addColumn("DireccionFinal");
       modelo.addColumn("Hora de entrega");
       modelo.addColumn("Año");
    try {
            //Extraer los datos SQL
            resultado = consultarDB();
            while(resultado.next()){
                    validarId=resultado.getString("IdPaquete");
                    validarNombre=resultado.getString("Nombre");
                    validarEstado=resultado.getString("Estado");
                    validarTipo=resultado.getString("Tipo");
                    validarDireccion=resultado.getString("Direccion");
                    validarPrecio=resultado.getString("Precio");
                    validarTransporte=resultado.getString("ID_Transporte");
                    validarUser=resultado.getString("IDUser");
                    validarDireccionFinal=resultado.getString("DireccionFinal");
                    validarHora=resultado.getString("HoraEntregado");
                    validarAño=resultado.getString("Año");
                    lista(validarId,validarNombre,validarEstado,validarTipo,validarDireccion,validarPrecio,validarTransporte,validarUser,validarDireccionFinal,validarHora,validarAño);
             }             
        }catch (Exception ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public ResultSet consultarDB() throws Exception{
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        Statement sentencia = null;
        try{
           String Consulta ="SELECT * FROM \"Paquetes\"";  
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(Consulta);
           return resultado;
        }catch(Exception e){
            throw new Exception("Error al consultar DB");
        }finally{
        }
    }
        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDTEXT;
    private javax.swing.JComboBox<String> TIPOBOX;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
