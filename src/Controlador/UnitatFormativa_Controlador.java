
package Controlador;

import java.io.Serializable;
import java.util.ArrayList;


public class UnitatFormativa_Controlador extends GENERICODAOImpl<Object, Serializable>{

    @Override
    public ArrayList<Object> listarTodos(String s) {
        return super.listarTodos(s); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    Object buscarPorClave(String clave) {
        return super.buscarPorClave(clave); //To change body of generated methods, choose Tools | Templates.
    }
    
}
