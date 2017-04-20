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
public class Familia {
    
    String id;
    String nom;
    ArrayList<Cicle> cicles;

    public Familia(String id, String nom, ArrayList<Cicle> cicles) {
        this.id = id;
        this.nom = nom;
        this.cicles = cicles;
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

    public ArrayList<Cicle> getCicles() {
        return cicles;
    }

    public void setCicles(ArrayList<Cicle> cicles) {
        this.cicles = cicles;
    }
    
    
    
}
