
package Controlador;

import Excepcions.ExcepcionFamilia;
import Model.Cicle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class Familia_Controlador extends Generic_Controlador{

    public Familia_Controlador(EntityManager entityManger) {
        super(entityManger);
    }
    
    public List<Cicle> BuscarPerFamilia(Long id) { 
        List<Cicle> p = null;
        try{
        System.out.println("Busqueda per id");
        Query query = em.createNamedQuery("cercaCiclesFamilia", Cicle.class);
        query.setParameter("id", id);
        p = (List<Cicle>) query.getResultList();
        System.out.println("close");
        System.out.println(p.size());
            if (p == null || p.isEmpty()) {
                throw new ExcepcionFamilia("GOC");
            }
        }catch(ExcepcionFamilia ex){
            System.out.println(ex.getMessage());
        }
        return p;
    }
    
}
