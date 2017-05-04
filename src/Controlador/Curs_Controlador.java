
package Controlador;

import Model.Modul;
import Model.UnitatFormativa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class Curs_Controlador extends Generic_Controlador{

    public Curs_Controlador(EntityManager entityManger) {
        super(entityManger);
    }

    public List<UnitatFormativa> BuscarUFCurs(Long id) {
        System.out.println("Busqueda per id");
        Query query = em.createNamedQuery("cercaUFCurs", UnitatFormativa.class);
        query.setParameter("id", id);
        List<UnitatFormativa> p = (List<UnitatFormativa>) query.getResultList();
        return p;
    }
    
    public List<Modul> BuscarModulsCurs(Long id) {
        System.out.println("Busqueda per id");
        Query query = em.createNamedQuery("cercaModulCurs", Modul.class);
        query.setParameter("id", id);
        List<Modul> p = (List<Modul>) query.getResultList();
        return p;
    }

    
    
}
