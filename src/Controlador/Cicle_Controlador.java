
package Controlador;

import Model.Curs;
import Model.Modul;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class Cicle_Controlador extends Generic_Controlador{

    public Cicle_Controlador(EntityManager entityManager) {
        super(entityManager);
    }

     public List<Curs> BuscarCursosCicle(Long id) {
        System.out.println("Busqueda per id");
        Query query = em.createNamedQuery("cercaCursosCicles", Curs.class);
        query.setParameter("id", id);
        List<Curs> p = (List<Curs>) query.getResultList();
        System.out.println(p.size());
        return p;
    }

    public List<Modul> BuscarModulsCicle(Long id) {
        System.out.println("Busqueda per id");
        Query query = em.createNamedQuery("cercaModulsCicles", Modul.class);
        query.setParameter("id", id);
        List<Modul> p = (List<Modul>) query.getResultList();
        System.out.println(p.size());
        return p;
    }
    
}
