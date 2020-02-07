/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Vosko
 */
public class Coneccion {
    
    private static Connection conn;
    private static final String driver = "org.gjt.mm.mysql.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost/ductum_0";
    
        public Coneccion()
        {
            conn = null;
            try
            {
                Class.forName(driver);
                conn = DriverManager.getConnection(url,user,password);
                
                if(conn != null)
                {
                    System.out.println("Conexion a Base de Datos establecida... ");
                }
                
            }catch(ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,"Error: "+e);}
        }
        
        //este metodo nos retorna la conexion
        public Connection getConnection()
        {
            return conn;
        }
        
        public void desconectar()
        {
            conn = null;
            System.out.println("Conexion a Base de Datos terminada... ");
        }
        
        
    
}
