/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ALUMNEDAM
 */
public class Curs {
    
    String id;
    String nom;
    ArrayList <UnitatFormativa> llistaUNitatsFormatives;

    public Curs(String id, String nom, ArrayList<UnitatFormativa> llistaUNitatsFormatives) {
        this.id = id;
        this.nom = nom;
        this.llistaUNitatsFormatives = llistaUNitatsFormatives;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<UnitatFormativa> getLlistaUNitatsFormatives() {
        return llistaUNitatsFormatives;
    }

    public void setLlistaUNitatsFormatives(ArrayList<UnitatFormativa> llistaUNitatsFormatives) {
        this.llistaUNitatsFormatives = llistaUNitatsFormatives;
    }
    
    
}
