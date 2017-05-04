
package Controlador;

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
        System.out.println("Busqueda per id");
        Query query = em.createNamedQuery("cercaCiclesFamilia", Cicle.class);
        query.setParameter("id", id);
        List<Cicle> p = (List<Cicle>) query.getResultList();
        System.out.println(p.size());
        System.out.println("close sunormah");        
        return p;
    }
    
}
