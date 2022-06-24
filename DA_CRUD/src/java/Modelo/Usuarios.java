/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Daniel
 */
public class Usuarios extends Personas{
    
        private int iduser;
        private String user;
	private int idrol;
        private String rol_nombre;
	private String pwd;
    

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getRol_nombre() {
        return rol_nombre;
    }

    public void setRol_nombre(String rol_nombre) {
        this.rol_nombre = rol_nombre;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
   
 
    
    

    public Usuarios(int iduser, String user, int idrol, String rol_nombre, String pwd,int per_id, String per_nombres, String per_apellidos, String tper_id, String tdoc_id, String per_numdoc, String per_fec_nacimiento, int pais_id, String ecivil_id, String sexo_id, String tper_nombre, String tdoc_nombre, String pais_nombre, String sexo_nombre, String ecivi_nombre, String useraudit) {
        super(per_id, per_nombres, per_apellidos, tper_id, tdoc_id, per_numdoc, per_fec_nacimiento, pais_id, ecivil_id, sexo_id, tper_nombre, tdoc_nombre, pais_nombre, sexo_nombre, ecivi_nombre, useraudit);
    
        this.iduser = iduser;
        this.user = user;
        this.idrol = idrol;
        this.rol_nombre = rol_nombre;
        this.pwd = pwd;
    
    }
    
}
