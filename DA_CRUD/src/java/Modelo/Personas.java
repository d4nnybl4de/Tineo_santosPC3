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
public class Personas {
        private int per_id;
        private String per_nombres;
	private String per_apellidos;
        private String tper_id;
        private String tdoc_id;
        private String per_numdoc; 
        private String per_fec_nacimiento;
        private int pais_id;
        private String ecivil_id;
        private String sexo_id;
        private String user;
        
        private String tper_nombre;
        private String tdoc_nombre;
        private String pais_nombre;
        private String sexo_nombre;
        private String ecivi_nombre;

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public String getPer_nombres() {
        return per_nombres;
    }

    public void setPer_nombres(String per_nombres) {
        this.per_nombres = per_nombres;
    }

    public String getPer_apellidos() {
        return per_apellidos;
    }

    public void setPer_apellidos(String per_apellidos) {
        this.per_apellidos = per_apellidos;
    }

    public String getTper_id() {
        return tper_id;
    }

    public void setTper_id(String tper_id) {
        this.tper_id = tper_id;
    }

    public String getTdoc_id() {
        return tdoc_id;
    }

    public void setTdoc_id(String tdoc_id) {
        this.tdoc_id = tdoc_id;
    }

    public String getPer_numdoc() {
        return per_numdoc;
    }

    public void setPer_numdoc(String per_numdoc) {
        this.per_numdoc = per_numdoc;
    }

    public String getPer_fec_nacimiento() {
        return per_fec_nacimiento;
    }

    public void setPer_fec_nacimiento(String per_fec_nacimiento) {
        this.per_fec_nacimiento = per_fec_nacimiento;
    }

    public int getPais_id() {
        return pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }

    public String getEcivil_id() {
        return ecivil_id;
    }

    public void setEcivil_id(String ecivil_id) {
        this.ecivil_id = ecivil_id;
    }

    public String getSexo_id() {
        return sexo_id;
    }

    public void setSexo_id(String sexo_id) {
        this.sexo_id = sexo_id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTper_nombre() {
        return tper_nombre;
    }

    public void setTper_nombre(String tper_nombre) {
        this.tper_nombre = tper_nombre;
    }

    public String getTdoc_nombre() {
        return tdoc_nombre;
    }

    public void setTdoc_nombre(String tdoc_nombre) {
        this.tdoc_nombre = tdoc_nombre;
    }

    public String getPais_nombre() {
        return pais_nombre;
    }

    public void setPais_nombre(String pais_nombre) {
        this.pais_nombre = pais_nombre;
    }

    public String getSexo_nombre() {
        return sexo_nombre;
    }

    public void setSexo_nombre(String sexo_nombre) {
        this.sexo_nombre = sexo_nombre;
    }

    public String getEcivi_nombre() {
        return ecivi_nombre;
    }

    public void setEcivi_nombre(String ecivi_nombre) {
        this.ecivi_nombre = ecivi_nombre;
    }
        
        
      public Personas(int per_id, String per_nombres, String per_apellidos, String tper_id, String tdoc_id, String per_numdoc, String per_fec_nacimiento, int pais_id, String ecivil_id, String sexo_id,String tper_nombre,String tdoc_nombre,String pais_nombre,String sexo_nombre, String ecivi_nombre,String useraudit) {
        this.per_id = per_id;
        this.per_nombres = per_nombres;
        this.per_apellidos = per_apellidos;
        this.tper_id = tper_id;
        this.tdoc_id = tdoc_id;
        this.per_numdoc = per_numdoc;
        this.per_fec_nacimiento = per_fec_nacimiento;
        this.pais_id = pais_id;
        this.ecivil_id = ecivil_id;
        this.sexo_id = sexo_id;
        this.user=useraudit;
        this.tper_nombre = tper_nombre;
        this.tdoc_nombre = tdoc_nombre;
        this.pais_nombre = pais_nombre;
        this.sexo_nombre = sexo_nombre;
        this.ecivi_nombre = ecivi_nombre;
       }

    public Personas() {
    }
      
      
}
