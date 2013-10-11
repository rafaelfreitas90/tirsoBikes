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
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByIdproduto", query = "SELECT p FROM Produto p WHERE p.idproduto = :idproduto"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByCodigoBarras", query = "SELECT p FROM Produto p WHERE p.codigoBarras = :codigoBarras"),
    @NamedQuery(name = "Produto.findByFornecedor", query = "SELECT p FROM Produto p WHERE p.fornecedor = :fornecedor"),
    @NamedQuery(name = "Produto.findByMarca", query = "SELECT p FROM Produto p WHERE p.marca = :marca"),
    @NamedQuery(name = "Produto.findByCategoria", query = "SELECT p FROM Produto p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "Produto.findByEstoqueMin", query = "SELECT p FROM Produto p WHERE p.estoqueMin = :estoqueMin"),
    @NamedQuery(name = "Produto.findByEstoqueAtual", query = "SELECT p FROM Produto p WHERE p.estoqueAtual = :estoqueAtual"),
    @NamedQuery(name = "Produto.findByValorCusto", query = "SELECT p FROM Produto p WHERE p.valorCusto = :valorCusto"),
    @NamedQuery(name = "Produto.findByValorVenda", query = "SELECT p FROM Produto p WHERE p.valorVenda = :valorVenda")})
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproduto")
    private Integer idproduto;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "codigoBarras")
    private Integer codigoBarras;
    @Column(name = "fornecedor")
    private String fornecedor;
    @Column(name = "marca")
    private String marca;
    @Column(name = "categoria")
    private String categoria;
    @Basic(optional = false)
    @Column(name = "estoqueMin")
    private int estoqueMin;
    @Basic(optional = false)
    @Column(name = "estoqueAtual")
    private int estoqueAtual;
    @Basic(optional = false)
    @Column(name = "valorCusto")
    private double valorCusto;
    @Basic(optional = false)
    @Column(name = "valorVenda")
    private double valorVenda;

    public Produto() {
    }

    public Produto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Produto(Integer idproduto, String descricao, int estoqueMin, int estoqueAtual, double valorCusto, double valorVenda) {
        this.idproduto = idproduto;
        this.descricao = descricao;
        this.estoqueMin = estoqueMin;
        this.estoqueAtual = estoqueAtual;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Integer codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduto != null ? idproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idproduto == null && other.idproduto != null) || (this.idproduto != null && !this.idproduto.equals(other.idproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tirsobikes.entidades.Produto[ idproduto=" + idproduto + " ]";
    }
    
}
