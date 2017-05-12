
package Model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "unitatFormativa")
public class UnitatFormativa implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUnitatFormativa", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "nomUnitatFormativa", nullable = false)
    private String nom;
    
    @Column(name = "horesUnitatFormativa", nullable = false)
    private String hores;

    //Una matricula té diverses unitats formatives.
    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Matricula> listaMatriculas;

    //Un curs te diverses unitats formatives.
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCurs")
    private Curs curs;

    //un modul te diverses unitats formatives pero aquestes nomes un modul.
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idModul")
    private Modul modul;


    public UnitatFormativa(Long id, String nom, String hores, Curs idCurs, Modul idModul) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.curs = idCurs;
        this.modul = idModul;
    }

    public UnitatFormativa(String nom, String hores, Curs curs, Modul modul) {
        this.nom = nom;
        this.hores = hores;
        this.curs = curs;
        this.modul = modul;
    }
    
    
    public UnitatFormativa() {
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

    public String getHores() {
        return hores;
    }

    public void setHores(String hores) {
        this.hores = hores;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }

  

    public Curs getIdCurs() {
        return curs;
    }

    public void setIdCurs(Curs idCurs) {
        this.curs = idCurs;
    }

    public Modul getIdModul() {
        return modul;
    }

    public void setIdModul(Modul idModul) {
        this.modul = idModul;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UnitatFormativa{" + "id=" + id + ", nom=" + nom + ", hores=" + hores + ", listaMatriculas=" + listaMatriculas + ", curs=" + curs + ", modul=" + modul + '}';
    }

    

    
}
