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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.Usuario;
import proyecto.VistaAdmin;


public class MantenimientoPaquete extends javax.swing.JFrame {

    public MantenimientoPaquete() {
        initComponents();
        this.getContentPane().setBackground(Color.ORANGE);
        this.setLocationRelativeTo(null);
        llenarCombo(); 
        Actualizar();
    }
    DefaultTableModel modelo;
    String info[] = new String[12];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TIPOBOX = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        IDTEXT = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        comboJ = new javax.swing.JComboBox<>();
        DIRETEXT1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUse = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFinal = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtaño = new javax.swing.JTextField();

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del Producto:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DIRECCION:");

        TIPOBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PELIGROSO", "INTERNACIONAL" }));
        TIPOBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIPOBOXActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("TIPO:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("DATOS GENERALES");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        jButton5.setText("Revisar");
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

        comboJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboJMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboJMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboJMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboJMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboJMouseReleased(evt);
            }
        });
        comboJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJActionPerformed(evt);
            }
        });
        comboJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboJKeyPressed(evt);
            }
        });

        DIRETEXT1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("TRANSPORTE");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Precio del Producto: ");

        txtProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("ID Usuario:");

        txtUse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("DIRECCION FINAL:");

        txtFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton6.setText("ELIMINAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Año de envio");

        txtaño.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(234, 234, 234)
                                        .addComponent(jLabel6)))
                                .addGap(0, 20, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(28, 28, 28)
                        .addComponent(jButton6)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TIPOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(txtUse, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(DIRETEXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(comboJ, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jButton5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(TIPOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(DIRETEXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TIPOBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIPOBOXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIPOBOXActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //AGREGAR
        String ID = IDTEXT.getText();
        String nombre = txtNombre.getText();
        String estados = "NO ENTREGADO";
        String Tipo = TIPOBOX.getSelectedItem().toString();
        String Direccion = DIRETEXT1.getText();
        String precio = txtProducto.getText();
        String Transporte =comboJ.getSelectedItem().toString();
        String user=txtUse.getText();
        String fin=txtFinal.getText();
        String año = txtaño.getText();
        
        String validarIdUser="";
        String validarPass="";
        String validarTipo="";
        String validarIDCliente="";
        
        MantenimientoUser ad = new MantenimientoUser();
        ResultSet resultado;
        boolean es = false;
        es=estado();
        try {
               resultado = ad.consultarUsuario(user);
               while(resultado.next()){
               validarIdUser=resultado.getString("IDUser");
               validarPass=resultado.getString("Password");
               validarTipo=resultado.getString("Tipo");
               validarIDCliente = resultado.getString("Id_Cliente");
               }
        } catch (Exception ex) {
            Logger.getLogger(MantenimientoTransport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(ID.equals("")||nombre.equals("")||Tipo.equals("")||Direccion.equals("")||precio.equals("")||Transporte.equals("")||user.equals("")||fin.equals("")||año.equals("")){
             JOptionPane.showMessageDialog(null, "Falta ingresar un dato");
        }else{
          if(validarTipo.equals("Cliente")&& es==true){
            conexion consulta = new conexion();
            String sql;
            sql="INSERT INTO \"Paquetes\"(\"IdPaquete\",\"Nombre\",\"Estado\",\"Tipo\",\"Direccion\",\"Precio\",\"ID_Transporte\",\"IDUser\",\"DireccionFinal\",\"HoraEntregado\",\"Año\")VALUES('"+ID+"','"+nombre+"','"+estados+"','"+Tipo+"','"+Direccion+"','"+precio+"','"+Transporte+"','"+user+"','"+fin+"','SIN ENTREGAR','"+año+"')";
            consulta.ejecutarSQL(sql);
            //limpia los textbox
            Lim();
            //limpia el Jtable
            limpiar();
            //Actualiza el Jtable con la base de datos
            Actualizar();
          }else if(es==false){
               JOptionPane.showMessageDialog(null, "El transporte seleccionado no disponible por accidente!");
          }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //MODIFICAR
        String ID = IDTEXT.getText();
        String nombre = txtNombre.getText();
        
        String Tipo = TIPOBOX.getSelectedItem().toString();
        String Direccion = DIRETEXT1.getText();
        
        String precio = txtProducto.getText();
        String Transporte =comboJ.getSelectedItem().toString();
        
        String user=txtUse.getText();
        
        String fin=txtFinal.getText();
        String año = txtaño.getText();
        
        String validarIdUser="";
        String validarPass="";
        String validarTipo="";
        String validarIDCliente="";
        
        MantenimientoUser ad = new MantenimientoUser();
        ResultSet resultado;
        
        try {
               resultado = ad.consultarUsuario(user);
               while(resultado.next()){
               validarIdUser=resultado.getString("IDUser");
               validarPass=resultado.getString("Password");
               validarTipo=resultado.getString("Tipo");
               validarIDCliente = resultado.getString("Id_Cliente");
               }
        } catch (Exception ex) {
            Logger.getLogger(MantenimientoTransport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(ID.equals("")||nombre.equals("")||Tipo.equals("")||Direccion.equals("")||precio.equals("")||Transporte.equals("")||user.equals("")||fin.equals("")||año.equals("")){
             JOptionPane.showMessageDialog(null, "Falta ingresar un dato");
        }else{
          if(validarTipo.equals("Cliente")){
            conexion consulta = new conexion();
            String sql;
             sql = "UPDATE \"Paquetes\" SET \"Nombre\"='"+nombre+"',\"Tipo\"='"+Tipo+"',\"Direccion\"='"+Direccion+"',\"Precio\"='"+precio+"',\"ID_Transporte\"='"+Transporte+"',\"IDUser\"='"+user+"',\"DireccionFinal\"='"+fin+"',\"Año\"='"+año+"' WHERE \"IdPaquete\"='"+ID+"'";
            consulta.ejecutarSQL(sql);
            //limpia los textbox
            Lim();
            //limpia el Jtable
            limpiar();
            //Actualiza el Jtable con la base de datos
            Actualizar();
          }
        }
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Revisar Consulta
       String Transporte =comboJ.getSelectedItem().toString();
       String validarId;
       String validarTipo="";
       String validarEstado;
       String validarDireccion;
       String validarUser;

       ResultSet resultado;
       MantenimientoTransport a = new  MantenimientoTransport();
       try{
        resultado= a.consultarTransporte(Transporte);
        while(resultado.next()){
               validarId=resultado.getString("Id_Transporte");
               validarTipo=resultado.getString("Tipos");
               validarEstado=resultado.getString("Estado");
               validarDireccion = resultado.getString("Direccion");
               validarUser=resultado.getString("IDUser"); 
         }   
        JOptionPane.showMessageDialog(null, "Transporte es: "+validarTipo);
       }catch(Exception e){      
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    public boolean estado(){
            //Revisar Consulta
       boolean es=false;
       String Transporte =comboJ.getSelectedItem().toString();
       String validarId;
       String validarTipo="";
       String validarEstado;
       String validarDireccion;
       String validarUser;
       
       ResultSet resultado;
       MantenimientoTransport a = new  MantenimientoTransport();
       try{
        resultado= a.consultarTransporte(Transporte);
            while(resultado.next()){
               validarId=resultado.getString("Id_Transporte");
               validarTipo=resultado.getString("Tipos");
               validarEstado=resultado.getString("Estado");
               validarDireccion = resultado.getString("Direccion");
               validarUser=resultado.getString("IDUser"); 
                  if(validarEstado.equals("NO ACCIDENTADO")){
                   return es=true;
               }
            }
         
       
            
        JOptionPane.showMessageDialog(null, "Transporte es: "+validarTipo);
       }catch(Exception e){      
       }
       return es;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VistaAdmin ad = new VistaAdmin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJActionPerformed
     
    }//GEN-LAST:event_comboJActionPerformed

    private void comboJMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboJMousePressed
      
    }//GEN-LAST:event_comboJMousePressed

    private void comboJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboJMouseClicked
        
    }//GEN-LAST:event_comboJMouseClicked

    private void comboJMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboJMouseEntered
      
    }//GEN-LAST:event_comboJMouseEntered

    private void comboJMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboJMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboJMouseReleased

    private void comboJMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboJMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboJMouseExited

    private void comboJKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboJKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboJKeyPressed
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

    //FUNCIONES EXTRA
    //arraylistComboBox
    public void llenarCombo(){
       String validarId;
       String validarTipo;
       String validarEstado;
       String validarDireccion;
       String validarUser;

       ResultSet resultado;
       MantenimientoTransport a = new  MantenimientoTransport();
       try{
        resultado= a.consultarDB();
        while(resultado.next()){
               validarId=resultado.getString("Id_Transporte");
               validarTipo=resultado.getString("Tipos");
               validarEstado=resultado.getString("Estado");
               validarDireccion = resultado.getString("Direccion");
               validarUser=resultado.getString("IDUser");
               comboJ.addItem(validarId);
         }   
       }catch(Exception e){      
       }
    }
    //Lim

    public void Lim(){
        IDTEXT.setText("");
        txtNombre.setText("");
        txtProducto.setText("");
        txtUse.setText("");
        txtFinal.setText("");
        DIRETEXT1.setText("");
        txtProducto.setText("");
        txtaño.setText("");
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
                new MantenimientoPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DIRETEXT1;
    private javax.swing.JTextField IDTEXT;
    private javax.swing.JComboBox<String> TIPOBOX;
    private javax.swing.JComboBox<String> comboJ;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtUse;
    private javax.swing.JTextField txtaño;
    // End of variables declaration//GEN-END:variables
}
