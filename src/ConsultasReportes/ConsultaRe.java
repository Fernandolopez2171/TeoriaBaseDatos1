/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsultasReportes;

import PostgreSQL.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ferna
 */
public class ConsultaRe {
    ResultSet resultado;
    String Consulta;
  
    public void Vista0(String us){
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        String vista = "CREATE VIEW \"Vista0\" AS ";
        String s;
        Statement sentencia = null;
        try{
           Consulta ="SELECT \"Paquetes\".\"IDUser\",\"Transporte\".\"Id_Transporte\",\"Transporte\".\"Estado\",\"Paquetes\".\"IdPaquete\" FROM \"Transporte\" INNER JOIN \"Paquetes\" ON \"Paquetes\".\"ID_Transporte\"=\"Transporte\".\"Id_Transporte\" WHERE \"Transporte\".\"Estado\"='ACCIDENTADO' and \"Transporte\".\"Id_Transporte\"='"+us+"'"; 
           s=vista+Consulta;
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(s);
        }catch(Exception e){
           
        }
        
    }
    public ResultSet v0() {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        Statement sentencia = null;
         try{
           Consulta ="SELECT * FROM public.\"Vista0\"";
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(Consulta);
           return resultado;
        }catch(Exception e){
        }  
        return null;
    }
    //----------------------------------------------------
    public void Vista1(String us) {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        String vista = "CREATE VIEW \"Vista1\" AS ";
        String s;
        Statement sentencia = null;
        try{
           Consulta ="SELECT \"Paquetes\".\"DireccionFinal\",\"Transporte\".\"Id_Transporte\",\"Transporte\".\"Estado\",\"Paquetes\".\"IdPaquete\" FROM \"Transporte\" INNER JOIN \"Paquetes\" ON \"Paquetes\".\"ID_Transporte\"=\"Transporte\".\"Id_Transporte\" WHERE \"Transporte\".\"Estado\"='ACCIDENTADO' and \"Transporte\".\"Id_Transporte\"='"+us+"'"; 
           s=vista+Consulta;
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(s);
        }catch(Exception e){
        }
    }
    public ResultSet v1() {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        Statement sentencia = null;
         try{
           Consulta ="SELECT * FROM public.\"Vista1\"";
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(Consulta);
           return resultado;
        }catch(Exception e){
        }  
        return null;
    }
    
    //----------------------------------------------------
     public void Vista2(String us) {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        String vista = "CREATE VIEW \"Vista2\" AS ";
        String s;
        Statement sentencia = null;
        try{
           Consulta ="SELECT \"Paquetes\".\"HoraEntregado\",\"Transporte\".\"Id_Transporte\",\"Transporte\".\"Estado\",\"Paquetes\".\"IdPaquete\" FROM \"Transporte\" INNER JOIN \"Paquetes\" ON \"Paquetes\".\"ID_Transporte\"=\"Transporte\".\"Id_Transporte\" WHERE \"Transporte\".\"Estado\"='ACCIDENTADO' and \"Transporte\".\"Id_Transporte\"='"+us+"' and \"Paquetes\".\"HoraEntregado\" != 'SIN ENTREGAR'"; 
           s=vista+Consulta;
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(s);
        }catch(Exception e){
        }
    }
     public ResultSet v2() {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        Statement sentencia = null;
         try{
           Consulta ="SELECT * FROM public.\"Vista2\"";
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(Consulta);
           return resultado;
        }catch(Exception e){
        }  
        return null;
    }
    //----------------------------------------------------
public void Vista3(String us) {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        String vista = "CREATE VIEW \"Vista3\" AS ";
        String s;
        Statement sentencia = null;
        try{
           Consulta ="SELECT \"IDUser\", \"Año\" from \"Paquetes\" Where \"Año\"='"+us+"'";
           s=vista+Consulta;
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(s);
        }catch(Exception e){
        }
}
     
public ResultSet v3() {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        Statement sentencia = null;
      try{
           Consulta ="SELECT * FROM public.\"Vista3\"";
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(Consulta);
           return resultado;
        }catch(Exception e){
        }  
        return null;
}
public ResultSet v3igual(String us) {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        Statement sentencia = null;
      try{
           Consulta ="SELECT * FROM public.\"Vista3\" where \"IDUser\"='"+us+"'";
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(Consulta);
           return resultado;
        }catch(Exception e){
        }  
        return null;
    }
 //----------------------------------------------------
 public void Vista4(String us) {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        String vista = "CREATE VIEW \"Vista4\" AS ";
        String s;
        Statement sentencia = null;
        try{
           Consulta ="SELECT \"IDUser\",\"Precio\" from \"Paquetes\" Where \"Año\"='"+us+"'";
           s=vista+Consulta;
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(s);
        }catch(Exception e){
        }
 }
 public ResultSet v4() {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        Statement sentencia = null;
      try{
           Consulta ="SELECT * FROM public.\"Vista4\"";
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(Consulta);
           return resultado;
        }catch(Exception e){
        }  
        return null;
 }
 public ResultSet v4igual(String us) {
        conexion sql= new conexion();
        Connection data = sql.conectar();
        ResultSet resultado;
        Statement sentencia = null;
      try{
           Consulta ="SELECT * FROM public.\"Vista4\" where \"IDUser\"='"+us+"'";
           sentencia = data.createStatement();
           resultado = sentencia.executeQuery(Consulta);
           return resultado;
        }catch(Exception e){
        }  
        return null;
    }
}
