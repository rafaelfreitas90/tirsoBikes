package tirsobikes.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "servico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servico.findAll", query = "SELECT s FROM Servico s"),
    @NamedQuery(name = "Servico.findByIdservico", query = "SELECT s FROM Servico s WHERE s.idservico = :idservico"),
    @NamedQuery(name = "Servico.findByDescricao", query = "SELECT s FROM Servico s WHERE s.descricao = :descricao"),
    @NamedQuery(name = "Servico.findByValor", query = "SELECT s FROM Servico s WHERE s.valor = :valor")})
public class Servico implements Serializable {

    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;
    @OneToMany(mappedBy = "idservico")
    private Collection<Itensvenda> itensvendaCollection;
    @OneToMany(mappedBy = "idservico")
    private Collection<Venda> vendaCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idservico")
    private Integer idservico;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;

    public Servico() {
    }

    public Servico(Integer idservico) {
        this.idservico = idservico;
    }

    public Servico(Integer idservico, String descricao, Double valor) {
        this.idservico = idservico;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getIdservico() {
        return idservico;
    }

    public void setIdservico(Integer idservico) {
        this.idservico = idservico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValorString() {
        String valorNovo = String.valueOf(valor);
        String replace = valorNovo.replace(".", ",");
        return replace;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setValor(String valor) {
        valor = valor.replace(",", ".");
        this.valor = Double.parseDouble(valor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idservico != null ? idservico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servico)) {
            return false;
        }
        Servico other = (Servico) object;
        if ((this.idservico == null && other.idservico != null) || (this.idservico != null && !this.idservico.equals(other.idservico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tirsobikes.entidades.Servico[ idservico=" + idservico + " ]";
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @XmlTransient
    public Collection<Itensvenda> getItensvendaCollection() {
        return itensvendaCollection;
    }

    public void setItensvendaCollection(Collection<Itensvenda> itensvendaCollection) {
        this.itensvendaCollection = itensvendaCollection;
    }

    @XmlTransient
    public Collection<Venda> getVendaCollection() {
        return vendaCollection;
    }

    public void setVendaCollection(Collection<Venda> vendaCollection) {
        this.vendaCollection = vendaCollection;
    }
}
