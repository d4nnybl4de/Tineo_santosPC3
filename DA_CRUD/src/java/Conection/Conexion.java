/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Daniel
 */
public class Conexion {
    
    public static String bd="ventas";
    public  static String user="root" ;
    public  static String password="";
    public  static String url="jdbc:mysql://localhost:3306/ventas?serverTimezone=UTC";
    
    

    public static Connection conectar(){
     Connection con = null;
     
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }
    
    

}
