
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unitatsFormatives")
public class UnitatFormativa implements Serializable{
    
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUnitatFormativa", unique = true, nullable = false)
    private int id;
    
    @Column(name = "nomUnitatFormativa", length = 50, nullable = false)
    private String nom;
    
    @Column(name = "horesUnitatFormativa", length = 50, nullable = false)
    private String hores;

    public UnitatFormativa(int id, String nom, String hores) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
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

    public String getHores() {
        return hores;
    }

    public void setHores(String hores) {
        this.hores = hores;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UnitatFormativa other = (UnitatFormativa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UnitatFormativa{" + "id=" + id + ", nom=" + nom + ", hores=" + hores + '}';
    }

    public UnitatFormativa() {
    }
   
}
