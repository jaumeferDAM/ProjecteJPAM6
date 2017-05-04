/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Alumne;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ALUMNEDAM
 */
public class Alumne_Controlador extends Generic_Controlador<Alumne>{

    public Alumne_Controlador(EntityManager entityManger) {
        super(entityManger);
    }
    
    public Alumne buscarCognom(String cognom) {
        // Recupera el entity manager       
        Query query = em.createNamedQuery("alumneCognom", Alumne.class);
        query.setParameter("cognom", cognom);
        Alumne p = (Alumne) query.getSingleResult();
        System.out.println("close");
        em.close();
        return p;
}
    
}
