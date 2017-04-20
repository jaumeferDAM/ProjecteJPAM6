
package Model;

public class importe {
    double importe;
    Matricula matricula;

    public importe(double importe, Matricula matricula) {
        this.importe = importe;
        this.matricula = matricula;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
    
    
}
