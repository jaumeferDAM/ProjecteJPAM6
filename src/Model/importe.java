
package Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Embeddable
@Table(name = "import")
public class importe implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "import", nullable = false)
    private double importe;

    public importe() {
    }

    public importe(double importe) {
        this.importe = importe;
    }   
    
    
    
    
}
