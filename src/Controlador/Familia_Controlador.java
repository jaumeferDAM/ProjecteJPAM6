
package Controlador;

import Model.Cicle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;


public class Familia_Controlador extends GENERICODAOImpl<Object, Serializable>{

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
    
        
    public List<Cicle> BuscarPerFamilia(Long id) {
      
        System.out.println("Busqueda per id");
        Query query = em.createNamedQuery("cercaCiclesFamilia", Cicle.class);
        query.setParameter("id", id);
        List<Cicle> p = (List<Cicle>) query.getResultList();
        System.out.println(p.size());
        return p;
}
    
}
