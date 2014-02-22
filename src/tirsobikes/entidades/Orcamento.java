package tirsobikes.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "orcamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orcamento.findAll", query = "SELECT o FROM Orcamento o"),
    @NamedQuery(name = "Orcamento.findByIdorcamento", query = "SELECT o FROM Orcamento o WHERE o.idorcamento = :idorcamento"),
    @NamedQuery(name = "Orcamento.findByDesconto", query = "SELECT o FROM Orcamento o WHERE o.desconto = :desconto"),
    @NamedQuery(name = "Orcamento.findByValorFinal", query = "SELECT o FROM Orcamento o WHERE o.valorFinal = :valorFinal")})
public class Orcamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorcamento")
    private Integer idorcamento;
    @Basic(optional = false)
    @Column(name = "desconto")
    private int desconto;
    @Basic(optional = false)
    @Column(name = "valorFinal")
    private double valorFinal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idorcamento")
    private Collection<Itensorcamento> itensorcamentoCollection;

    public Orcamento() {
    }

    public Orcamento(Integer idorcamento) {
        this.idorcamento = idorcamento;
    }

    public Orcamento(Integer idorcamento, int desconto, double valorFinal) {
        this.idorcamento = idorcamento;
        this.desconto = desconto;
        this.valorFinal = valorFinal;
    }

    public Integer getIdorcamento() {
        return idorcamento;
    }

    public void setIdorcamento(Integer idorcamento) {
        this.idorcamento = idorcamento;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    @XmlTransient
    public Collection<Itensorcamento> getItensorcamentoCollection() {
        return itensorcamentoCollection;
    }

    public void setItensorcamentoCollection(Collection<Itensorcamento> itensorcamentoCollection) {
        this.itensorcamentoCollection = itensorcamentoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorcamento != null ? idorcamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orcamento)) {
            return false;
        }
        Orcamento other = (Orcamento) object;
        if ((this.idorcamento == null && other.idorcamento != null) || (this.idorcamento != null && !this.idorcamento.equals(other.idorcamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tirsobikes.entidades.Orcamento[ idorcamento=" + idorcamento + " ]";
    }

}
