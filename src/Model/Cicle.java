
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
//@NamedQueries({
//@NamedQuery(name = "cercaCiclesFamilia", query = "SELECT c FROM Cicle c WHERE c.familia.id=:id"),
//@NamedQuery(name = "cercaCursosCicles", query = "SELECT c FROM Curs c WHERE c.cicle.id=:id"),
//@NamedQuery(name = "cercaModulsCicles", query = "SELECT c FROM Modul c WHERE c.cicle.id=:id")})
@Table(name = "cicles")
public class Cicle implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idCicle", nullable = false, unique = true)
    private Long id;
    
    @Column(name = "nomCicle", length = 50, nullable = false)
    private String nom;
    
    @Column(name = "grauCicle", length = 50)
    private String grau;
    
    //Un cile pot tenir mes d'un curs pero cada curs pertany a un sol cicle.
    @OneToMany(mappedBy="cicle", cascade = CascadeType.ALL)
    private List<Curs> llistaCursos;
    
    //Un cicle pot tenir diversos moduls pero cada modul pertany a un cicle.
    @OneToMany(mappedBy="cicle" , cascade = CascadeType.ALL)
    private List<Modul> llistaModuls;
    
    //una familia pot tenir diversos cicles pero cada cicle només pertany a una familia.
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idFamilia")
    private Familia familia;
    

    public Cicle(Long id, String nom, String grau, Familia familia) {
        this.id = id;
        this.nom = nom;
        this.grau = grau;
        this.familia = familia;
    }

    public Cicle(String nom, String grau, Familia familia) {
        this.nom = nom;
        this.grau = grau;
        this.familia = familia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public List<Modul> getLlistaModuls() {
        return llistaModuls;
    }

    public void setLlistaModuls(List<Modul> llistaModuls) {
        this.llistaModuls = llistaModuls;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Cicle other = (Cicle) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }


    public Cicle() {
    }

    @Override
    public String toString() {
        return "Cicle{" + "id=" + id + ", nom=" + nom + ", grau=" + grau + ", llistaModuls=" + llistaModuls + ", familia=" + familia + '}';
    }

    

    
    

    
    
    
}
