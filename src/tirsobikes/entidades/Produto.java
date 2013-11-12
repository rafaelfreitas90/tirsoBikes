package tirsobikes.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import tirsobikes.funcoes.Converter;

/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "produto")
@XmlRootElement
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
    @Column(name = "codigoDeBarras")
    private Integer codigoDeBarras;
    @Column(name = "fornecedor")
    private String fornecedor;
    @Basic(optional = false)
    @Column(name = "estoqueMinimo")
    private int estoqueMinimo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valorCusto")
    private Double valorCusto;
    @Basic(optional = false)
    @Column(name = "valorVenda")
    private Double valorVenda;
    @Basic(optional = false)
    @Column(name = "margem")
    private Double margem;
    @JoinColumn(name = "idmarca", referencedColumnName = "idmarca")
    @ManyToOne(optional = false)
    private Marca idmarca;
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
    @ManyToOne(optional = false)
    private Categoria idcategoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproduto")
    private List<Estoque> estoqueCollection;

    public Produto() {
    }

    public Produto(Integer idproduto) {
        this.idproduto = idproduto;
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

    public Integer getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(Integer codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public Double getValorCusto() {
        return valorCusto;
    }

    public String getValorCustoString() {
        DecimalFormat myformat = new DecimalFormat();
        myformat.setMaximumFractionDigits(2);
        myformat.setMinimumFractionDigits(2);
        String valorNovo = myformat.format(valorCusto);        
        return valorNovo;
    }

    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public void setValorCusto(String valorCusto) {
        valorCusto = Converter.banco(valorCusto);
        this.valorCusto = Double.parseDouble(valorCusto);
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public String getValorVendaString() {
        DecimalFormat myformat = new DecimalFormat();
        myformat.setMaximumFractionDigits(2);
        myformat.setMinimumFractionDigits(2);
        String valorNovo = myformat.format(valorVenda);                 
        return valorNovo;
    }

    public String getValorVendaView() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valor = nf.format(this.valorVenda);
        return valor;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        valorVenda = Converter.banco(valorVenda);
        this.valorVenda = Double.parseDouble(valorVenda);
    }

    public Double getMargem() {
        return margem;
    }

    public String getMargemString() {
        DecimalFormat myformat = new DecimalFormat();
        myformat.setMaximumFractionDigits(2);
        myformat.setMinimumFractionDigits(2);
        String valorNovo = myformat.format(margem);        
        return valorNovo;
    }

    public void setMargem(Double margem) {
        this.margem = margem;
    }

    public void setMargem(String margem) {
        margem = Converter.banco(margem);
        this.margem = Double.parseDouble(margem);
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

    @XmlTransient
    public List<Estoque> getEstoqueCollection() {
        return estoqueCollection;
    }

    public void setEstoqueCollection(List<Estoque> estoqueLista) {
        this.estoqueCollection = estoqueLista;
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
