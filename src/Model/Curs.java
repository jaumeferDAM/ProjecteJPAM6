
package Model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Curs")
public class Curs {
    
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idCurs", unique = true, nullable = false)
    private int id;
    
    @Column(name = "nomCurs", length = 5)
    private String nom;
    
    ArrayList <UnitatFormativa> llistaUNitatsFormatives;

    public Curs(int id, String nom, ArrayList<UnitatFormativa> llistaUNitatsFormatives) {
        this.id = id;
        this.nom = nom;
        this.llistaUNitatsFormatives = llistaUNitatsFormatives;
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

    public ArrayList<UnitatFormativa> getLlistaUNitatsFormatives() {
        return llistaUNitatsFormatives;
    }

    public void setLlistaUNitatsFormatives(ArrayList<UnitatFormativa> llistaUNitatsFormatives) {
        this.llistaUNitatsFormatives = llistaUNitatsFormatives;
    }
    
    
}
