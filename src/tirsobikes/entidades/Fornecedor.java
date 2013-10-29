package tirsobikes.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RFSUPORTE
 */
@Entity
@Table(name = "fornecedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByIdfornecedor", query = "SELECT f FROM Fornecedor f WHERE f.idfornecedor = :idfornecedor"),
    @NamedQuery(name = "Fornecedor.findByNomeRazao", query = "SELECT f FROM Fornecedor f WHERE f.nomeRazao = :nomeRazao"),
    @NamedQuery(name = "Fornecedor.findByEndereco", query = "SELECT f FROM Fornecedor f WHERE f.endereco = :endereco"),
    @NamedQuery(name = "Fornecedor.findByCidade", query = "SELECT f FROM Fornecedor f WHERE f.cidade = :cidade"),
    @NamedQuery(name = "Fornecedor.findByUf", query = "SELECT f FROM Fornecedor f WHERE f.uf = :uf"),
    @NamedQuery(name = "Fornecedor.findByCep", query = "SELECT f FROM Fornecedor f WHERE f.cep = :cep"),
    @NamedQuery(name = "Fornecedor.findByNomeFantasia", query = "SELECT f FROM Fornecedor f WHERE f.nomeFantasia = :nomeFantasia"),
    @NamedQuery(name = "Fornecedor.findByVendedor", query = "SELECT f FROM Fornecedor f WHERE f.vendedor = :vendedor"),
    @NamedQuery(name = "Fornecedor.findByTelefone1", query = "SELECT f FROM Fornecedor f WHERE f.telefone1 = :telefone1"),
    @NamedQuery(name = "Fornecedor.findByTelefone2", query = "SELECT f FROM Fornecedor f WHERE f.telefone2 = :telefone2"),
    @NamedQuery(name = "Fornecedor.findByIe", query = "SELECT f FROM Fornecedor f WHERE f.ie = :ie"),
    @NamedQuery(name = "Fornecedor.findByIm", query = "SELECT f FROM Fornecedor f WHERE f.im = :im"),
    @NamedQuery(name = "Fornecedor.findByEmail", query = "SELECT f FROM Fornecedor f WHERE f.email = :email")})
public class Fornecedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfornecedor")
    private Integer idfornecedor;
    @Basic(optional = false)
    @Column(name = "nomeRazao")
    private String nomeRazao;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
    @Basic(optional = false)
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Basic(optional = false)
    @Column(name = "vendedor")
    private String vendedor;
    @Basic(optional = false)
    @Column(name = "telefone1")
    private String telefone1;
    @Column(name = "telefone2")
    private String telefone2;
    @Column(name = "ie")
    private String ie;
    @Column(name = "im")
    private String im;
    @Column(name = "email")
    private String email;

    public Fornecedor() {
    }

    public Fornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public Fornecedor(Integer idfornecedor, String nomeRazao, String endereco, String cidade, String uf, String cep, String nomeFantasia, String vendedor, String telefone1) {
        this.idfornecedor = idfornecedor;
        this.nomeRazao = nomeRazao;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.nomeFantasia = nomeFantasia;
        this.vendedor = vendedor;
        this.telefone1 = telefone1;
    }

    public Integer getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public String getNomeRazao() {
        return nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfornecedor != null ? idfornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.idfornecedor == null && other.idfornecedor != null) || (this.idfornecedor != null && !this.idfornecedor.equals(other.idfornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tirsobikes.entidades.Fornecedor[ idfornecedor=" + idfornecedor + " ]";
    }
    
}
