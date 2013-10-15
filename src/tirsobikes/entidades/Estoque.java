package tirsobikes.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "estoque")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estoque.findAll", query = "SELECT e FROM Estoque e"),
    @NamedQuery(name = "Estoque.findByIdestoque", query = "SELECT e FROM Estoque e WHERE e.idestoque = :idestoque"),
    @NamedQuery(name = "Estoque.findByData", query = "SELECT e FROM Estoque e WHERE e.data = :data"),
    @NamedQuery(name = "Estoque.findByQuantidade", query = "SELECT e FROM Estoque e WHERE e.quantidade = :quantidade")})
public class Estoque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestoque")
    private Integer idestoque;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @JoinColumn(name = "idproduto", referencedColumnName = "idproduto")
    @ManyToOne(optional = false)
    private Produto idproduto;

    public Estoque() {
    }

    public Estoque(Integer idestoque) {
        this.idestoque = idestoque;
    }

    public Estoque(Integer idestoque, Date data, int quantidade) {
        this.idestoque = idestoque;
        this.data = data;
        this.quantidade = quantidade;
    }

    public Integer getIdestoque() {
        return idestoque;
    }

    public void setIdestoque(Integer idestoque) {
        this.idestoque = idestoque;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Produto idproduto) {
        this.idproduto = idproduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestoque != null ? idestoque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estoque)) {
            return false;
        }
        Estoque other = (Estoque) object;
        if ((this.idestoque == null && other.idestoque != null) || (this.idestoque != null && !this.idestoque.equals(other.idestoque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tirsobikes.entidades.Estoque[ idestoque=" + idestoque + " ]";
    }

}
