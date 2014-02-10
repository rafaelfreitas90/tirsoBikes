package tirsobikes.entidades;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RFSUPORTE
 */
@Entity
@Table(name = "venda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v"),
    @NamedQuery(name = "Venda.findByIdvenda", query = "SELECT v FROM Venda v WHERE v.idvenda = :idvenda"),
    @NamedQuery(name = "Venda.findByDataHora", query = "SELECT v FROM Venda v WHERE v.dataHora = :dataHora"),
    @NamedQuery(name = "Venda.findByValorTotal", query = "SELECT v FROM Venda v WHERE v.valorTotal = :valorTotal"),
    @NamedQuery(name = "Venda.findByDesconto", query = "SELECT v FROM Venda v WHERE v.desconto = :desconto"),
    @NamedQuery(name = "Venda.findByFormaPagamento", query = "SELECT v FROM Venda v WHERE v.formaPagamento = :formaPagamento"),
    @NamedQuery(name = "Venda.findByDataPagamento", query = "SELECT v FROM Venda v WHERE v.dataPagamento = :dataPagamento"),
    @NamedQuery(name = "Venda.findByStatusPagamento", query = "SELECT v FROM Venda v WHERE v.statusPagamento = :statusPagamento")})
public class Venda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvenda")
    private Integer idvenda;
    @Basic(optional = false)
    @Column(name = "dataHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    @Basic(optional = false)
    @Column(name = "valorTotal")
    private double valorTotal;
    @Column(name = "desconto")
    private Double desconto;
    @Basic(optional = false)
    @Column(name = "formaPagamento")
    private String formaPagamento;
    @Column(name = "dataPagamento")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    @Basic(optional = false)
    @Column(name = "statusPagamento")
    private char statusPagamento;
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Cliente idcliente;
    @Basic(optional = false)
    @Column(name = "informacoes")
    private String informacoes;

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }
    @OneToMany(mappedBy = "idvenda")
    private List<Itensvenda> itens;

    public List<Itensvenda> getItens() {
        return itens;
    }

    public void setItens(List<Itensvenda> itens) {
        this.itens = itens;
    }

    public Venda() {
    }

    public Venda(Integer idvenda) {
        this.idvenda = idvenda;
    }

    public Venda(Integer idvenda, Date dataHora, double valorTotal, String formaPagamento, char statusPagamento) {
        this.idvenda = idvenda;
        this.dataHora = dataHora;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
    }

    public Integer getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Integer idvenda) {
        this.idvenda = idvenda;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getValorTotalView() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valor = nf.format(this.valorTotal);
        return valor;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public String getDescontoView() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valor = nf.format(this.desconto);
        return valor;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public char getStatusPagamento() {
        return statusPagamento;
    }

    public String getStatusPagamentoView() {
        String status = Character.toString(this.statusPagamento);
        if (status.equals("1")) {
            status = "OK";
        } else {
            status = "DEVE";
        }
        return status;
    }

    public void setStatusPagamento(char statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvenda != null ? idvenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.idvenda == null && other.idvenda != null) || (this.idvenda != null && !this.idvenda.equals(other.idvenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tirsobikes.entidades.Venda[ idvenda=" + idvenda + " ]";
    }
}
