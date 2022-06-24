/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conection.Conexion;
import Modelo.Categorias;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class CategoriaDAO {

   /* public List<Categorias> listar() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String SQL = null;
        List<Categorias> categorias = new ArrayList<Categorias>();

        try {
            con = Conexion.conectar();
            SQL = "select c.cat_nombre from categoria c order by c.cat_nombre";
            pstm = con.prepareStatement(SQL);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Categorias cat = new Categorias();
                cat.setIdCat(rs.getInt("cat_id"));
                cat.setNomCat(rs.getString("cat_nombre"));
                categorias.add(cat);
            }
        } catch (Exception e) {
            
        }

        return categorias;
    }*/

    public List<Categorias> listar(){
        Connection con=null;
        CallableStatement cstm=null;
        ResultSet rs=null;
        List<Categorias>  categorias=null;
        
        try {
            con=Conexion.conectar();
            
            cstm=con.prepareCall("{call sp_listar_categoria()}");
            
            categorias = new ArrayList<>();
            Categorias cat=null;
            rs = cstm.executeQuery();
            while (rs.next()) {                
                cat=new Categorias();
                cat.setIdCat(rs.getInt("Id_categoria"));
                cat.setNomCat(rs.getString("Nombre"));
                
                categorias.add(cat);
            }
        } catch (Exception e) {
        }
        return categorias;
    }
    
    
    
        public void Registrar(Categorias categoria) throws Exception {
        Conexion con;
        Connection cn = null;
        Statement st = null;
        String sql = " INSERT INTO Categorias ( Nombre) "
                + "VALUES (   "+categoria.getNomCat()+"  )";
        con = new Conexion();
        try {
            cn = con.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);//Valido para cualquier tipo de transaccion y especialmente util si hace muchas cosas.
        } catch (Exception e) {
            throw e;
        } finally {
            if (st != null && st.isClosed() == false) {
                st.close();
            }
            st = null;
            if (cn != null && cn.isClosed() == false) {
                cn.close();
            }
            cn = null;
        }
    }
}
