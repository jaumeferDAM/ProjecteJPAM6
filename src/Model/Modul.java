
package Model;

import java.util.ArrayList;


public class Modul {
    
    String id;
    String nom;
    ArrayList <UnitatFormativa> llistaUnitatsFormatives;

    public Modul(String id, String nom, ArrayList<UnitatFormativa> llistaUnitatsFormatives) {
        this.id = id;
        this.nom = nom;
        this.llistaUnitatsFormatives = llistaUnitatsFormatives;
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

    public ArrayList<UnitatFormativa> getLlistaUnitatsFormatives() {
        return llistaUnitatsFormatives;
    }

    public void setLlistaUnitatsFormatives(ArrayList<UnitatFormativa> llistaUnitatsFormatives) {
        this.llistaUnitatsFormatives = llistaUnitatsFormatives;
    }
    
    
    
}
