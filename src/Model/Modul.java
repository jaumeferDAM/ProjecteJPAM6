
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Modul")
public class Modul implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idModul", unique = true, nullable = false)
    private int id;
    
    @Column(name = "nomModul")
    String nom;
    ArrayList <UnitatFormativa> llistaUnitatsFormatives;

    public Modul(int id, String nom, ArrayList<UnitatFormativa> llistaUnitatsFormatives) {
        this.id = id;
        this.nom = nom;
        this.llistaUnitatsFormatives = llistaUnitatsFormatives;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
