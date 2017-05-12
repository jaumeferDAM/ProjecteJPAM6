
package Controlador;

import Excepcions.ExcepcionCurs;
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
        List<UnitatFormativa> p = null;
        try{
        System.out.println("Busqueda per id");
        Query query = em.createNamedQuery("cercaUFCurs", UnitatFormativa.class);
        query.setParameter("id", id);
        System.out.println("close");
        p = (List<UnitatFormativa>) query.getResultList();
            if (p == null || p.isEmpty()) {
                throw new ExcepcionCurs("fallo");
            }
        }catch(ExcepcionCurs ex){
            System.out.println(ex.getMessage());
        }
        return p;
    }
    
    public List<Modul> BuscarModulsCurs(Long id) {
        List<Modul> p = null;
        try{
        System.out.println("Busqueda per id");
        Query query = em.createNamedQuery("cercaModulCurs", Modul.class);
        query.setParameter("id", id);
        System.out.println("close");
        p = (List<Modul>) query.getResultList();
            if (p == null || p.isEmpty()) {
               throw new ExcepcionCurs("curs");
            }
        }catch(ExcepcionCurs ex){
            System.out.println(ex.getMessage());
        }
        return p;
    }

    
    
}
