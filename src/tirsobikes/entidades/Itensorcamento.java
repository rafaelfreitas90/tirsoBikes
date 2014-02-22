package tirsobikes.entidades;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "itensorcamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itensorcamento.findAll", query = "SELECT i FROM Itensorcamento i"),
    @NamedQuery(name = "Itensorcamento.findByIditensOrcamento", query = "SELECT i FROM Itensorcamento i WHERE i.iditensOrcamento = :iditensOrcamento"),
    @NamedQuery(name = "Itensorcamento.findByQuantidade", query = "SELECT i FROM Itensorcamento i WHERE i.quantidade = :quantidade"),
    @NamedQuery(name = "Itensorcamento.findByValorUnitario", query = "SELECT i FROM Itensorcamento i WHERE i.valorUnitario = :valorUnitario")})
public class Itensorcamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iditensOrcamento")
    private Integer iditensOrcamento;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @Column(name = "valorUnitario")
    private double valorUnitario;
    @JoinColumn(name = "idproduto", referencedColumnName = "idproduto")
    @ManyToOne(optional = false)
    private Produto idproduto;
    @JoinColumn(name = "idorcamento", referencedColumnName = "idorcamento")
    @ManyToOne(optional = false)
    private Orcamento idorcamento;

    public Itensorcamento() {
    }

    public Itensorcamento(Integer iditensOrcamento) {
        this.iditensOrcamento = iditensOrcamento;
    }

    public Itensorcamento(Integer iditensOrcamento, int quantidade, double valorUnitario) {
        this.iditensOrcamento = iditensOrcamento;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public Integer getIditensOrcamento() {
        return iditensOrcamento;
    }

    public void setIditensOrcamento(Integer iditensOrcamento) {
        this.iditensOrcamento = iditensOrcamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Produto getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Produto idproduto) {
        this.idproduto = idproduto;
    }

    public Orcamento getIdorcamento() {
        return idorcamento;
    }

    public void setIdorcamento(Orcamento idorcamento) {
        this.idorcamento = idorcamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditensOrcamento != null ? iditensOrcamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itensorcamento)) {
            return false;
        }
        Itensorcamento other = (Itensorcamento) object;
        if ((this.iditensOrcamento == null && other.iditensOrcamento != null) || (this.iditensOrcamento != null && !this.iditensOrcamento.equals(other.iditensOrcamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tirsobikes.entidades.Itensorcamento[ iditensOrcamento=" + iditensOrcamento + " ]";
    }

}
