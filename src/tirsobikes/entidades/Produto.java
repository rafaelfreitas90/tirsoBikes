package tirsobikes.entidades;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Produto.findByCodigoDeBarras", query = "SELECT p FROM Produto p WHERE p.codigoDeBarras = :codigoDeBarras"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByEstoqueMinimo", query = "SELECT p FROM Produto p WHERE p.estoqueMinimo = :estoqueMinimo"),
    @NamedQuery(name = "Produto.findByFornecedor", query = "SELECT p FROM Produto p WHERE p.fornecedor = :fornecedor"),
    @NamedQuery(name = "Produto.findByMargem", query = "SELECT p FROM Produto p WHERE p.margem = :margem"),
    @NamedQuery(name = "Produto.findByValorCusto", query = "SELECT p FROM Produto p WHERE p.valorCusto = :valorCusto"),
    @NamedQuery(name = "Produto.findByValorVenda", query = "SELECT p FROM Produto p WHERE p.valorVenda = :valorVenda")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproduto")
    private Integer idproduto;
    @Column(name = "codigoDeBarras")
    private Integer codigoDeBarras;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "estoqueMinimo")
    private int estoqueMinimo;
    @Column(name = "fornecedor")
    private String fornecedor;
    @Basic(optional = false)
    @Column(name = "margem")
    private double margem;
    @Basic(optional = false)
    @Column(name = "valorCusto")
    private double valorCusto;
    @Basic(optional = false)
    @Column(name = "valorVenda")
    private double valorVenda;
    @JoinColumn(name = "idmarca", referencedColumnName = "idmarca")
    @ManyToOne(optional = false)
    private Marca idmarca;
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
    @ManyToOne(optional = false)
    private Categoria idcategoria;

    public Produto() {
    }

    public Produto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Produto(Integer idproduto, String descricao, int estoqueMinimo, double margem, double valorCusto, double valorVenda) {
        this.idproduto = idproduto;
        this.descricao = descricao;
        this.estoqueMinimo = estoqueMinimo;
        this.margem = margem;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Integer getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(Integer codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getMargem() {
        return margem;
    }

    public void setMargem(double margem) {
        this.margem = margem;
    }

    public void setMargem(String margem) {
        margem = margem.replace(",", ".");
        this.margem = Double.parseDouble(margem);
    }

    public String getMargemString() {
        String valorNovo = String.valueOf(margem);
        String replace = valorNovo.replace(".", ",");
        return replace;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public String getValorCustoString() {
        String valorNovo = String.valueOf(valorCusto);
        String replace = valorNovo.replace(".", ",");
        return replace;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public void setValorCusto(String valorCusto) {
        valorCusto = valorCusto.replace(",", ".");
        this.valorCusto = Double.parseDouble(valorCusto);
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        valorVenda = valorVenda.replace(",", ".");
        this.valorVenda = Double.parseDouble(valorVenda);
    }

    public String getValorVendaString() {
        this.valorVenda = this.valorCusto + (this.valorCusto * (this.margem / 100));
        String valorNovo = String.valueOf(valorVenda);
        String replace = valorNovo.replace(".", ",");      
        return replace;
    }

    public String getValorVendaView() {
        this.valorVenda = this.valorCusto + (this.valorCusto * (this.margem / 100));
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valor = nf.format(this.valorVenda);        
        return valor;
    }

    public Marca getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(Marca idmarca) {
        this.idmarca = idmarca;
    }

    public Categoria getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Categoria idcategoria) {
        this.idcategoria = idcategoria;
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
