/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ALUMNEDAM
 */
public class AlumneDAO extends GENERICODAOImpl<Object, Serializable>{

    @Override
    public ArrayList<Object> listarTodos() {
        return super.listarTodos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Serializable id) {
        super.eliminar(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(Serializable id) {
        return super.get(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Object entity) {
        super.actualizar(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar(Object entity) {
        super.insertar(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object crear() {
        return super.crear(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
