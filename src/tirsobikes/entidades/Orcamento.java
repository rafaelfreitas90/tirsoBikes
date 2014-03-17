package tirsobikes.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

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
    @NamedQuery(name = "Orcamento.findByValorFinal", query = "SELECT o FROM Orcamento o WHERE o.valorFinal = :valorFinal"),
    @NamedQuery(name = "Orcamento.findByDataHora", query = "SELECT o FROM Orcamento o WHERE o.dataHora = :dataHora"),
    @NamedQuery(name = "Orcamento.findByDataPagamento", query = "SELECT o FROM Orcamento o WHERE o.dataPagamento = :dataPagamento"),
    @NamedQuery(name = "Orcamento.findByFormaPagamento", query = "SELECT o FROM Orcamento o WHERE o.formaPagamento = :formaPagamento"),
    @NamedQuery(name = "Orcamento.findByInformacoes", query = "SELECT o FROM Orcamento o WHERE o.informacoes = :informacoes"),
    @NamedQuery(name = "Orcamento.findByStatusPagamento", query = "SELECT o FROM Orcamento o WHERE o.statusPagamento = :statusPagamento")})
public class Orcamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorcamento")
    private Integer idorcamento;
    @Basic(optional = false)
    @Column(name = "desconto")
    private double desconto;
    @Basic(optional = false)
    @Column(name = "valorFinal")
    private double valorFinal;
    @Basic(optional = false)
    @Column(name = "dataHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    @Basic(optional = false)
    @Column(name = "dataPagamento")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    @Basic(optional = false)
    @Column(name = "formaPagamento")
    private String formaPagamento;
    @Column(name = "informacoes")
    private String informacoes;
    @Basic(optional = false)
    @Column(name = "statusPagamento")
    private char statusPagamento;

    public Orcamento() {
    }

    public Orcamento(Integer idorcamento) {
        this.idorcamento = idorcamento;
    }

    public Orcamento(Integer idorcamento, double desconto, double valorFinal, Date dataHora, Date dataPagamento, String formaPagamento, char statusPagamento) {
        this.idorcamento = idorcamento;
        this.desconto = desconto;
        this.valorFinal = valorFinal;
        this.dataHora = dataHora;
        this.dataPagamento = dataPagamento;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
    }

    public Integer getIdorcamento() {
        return idorcamento;
    }

    public void setIdorcamento(Integer idorcamento) {
        this.idorcamento = idorcamento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public char getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(char statusPagamento) {
        this.statusPagamento = statusPagamento;
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
