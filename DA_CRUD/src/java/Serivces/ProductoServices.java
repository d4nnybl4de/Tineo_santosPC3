/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serivces;

import DAO.CategoriaDAO;
import Modelo.Categorias;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class ProductoServices {
        public List<Categorias> listar(){
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        return categoriaDAO.listar();
    }
    
}
