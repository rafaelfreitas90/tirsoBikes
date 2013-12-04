/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name = "itensvenda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itensvenda.findAll", query = "SELECT i FROM Itensvenda i"),
    @NamedQuery(name = "Itensvenda.findByIditensVenda", query = "SELECT i FROM Itensvenda i WHERE i.iditensVenda = :iditensVenda"),
    @NamedQuery(name = "Itensvenda.findByPrecoUnitario", query = "SELECT i FROM Itensvenda i WHERE i.precoUnitario = :precoUnitario"),
    @NamedQuery(name = "Itensvenda.findByQuantidade", query = "SELECT i FROM Itensvenda i WHERE i.quantidade = :quantidade")})
public class Itensvenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iditensVenda")
    private Integer iditensVenda;
    @Basic(optional = false)
    @Column(name = "precoUnitario")
    private double precoUnitario;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @JoinColumn(name = "idservico", referencedColumnName = "idservico")
    @ManyToOne
    private Servico idservico;
    @JoinColumn(name = "idvenda", referencedColumnName = "idvenda")
    @ManyToOne(optional = false)
    private Venda idvenda;
    @JoinColumn(name = "idproduto", referencedColumnName = "idproduto")
    @ManyToOne
    private Produto idproduto;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    
    
    public Itensvenda() {
    }

    public Itensvenda(Integer iditensVenda) {
        this.iditensVenda = iditensVenda;
    }

    public Itensvenda(Integer iditensVenda, double precoUnitario, int quantidade) {
        this.iditensVenda = iditensVenda;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public Integer getIditensVenda() {
        return iditensVenda;
    }

    public void setIditensVenda(Integer iditensVenda) {
        this.iditensVenda = iditensVenda;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public String getPrecoUnitarioView() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valor = nf.format(this.precoUnitario);
        return valor;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Servico getIdservico() {
        return idservico;
    }

    public void setIdservico(Servico idservico) {
        this.idservico = idservico;
    }

    public Venda getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Venda idvenda) {
        this.idvenda = idvenda;
    }

    public Produto getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Produto idproduto) {
        this.idproduto = idproduto;
    }

    public Double getTotal() {
        Double total = this.quantidade * this.precoUnitario;
        return total;
    }

    public String getTotalView() {
        Double total = this.quantidade * this.precoUnitario;
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valor = nf.format(total);
        return valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditensVenda != null ? iditensVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itensvenda)) {
            return false;
        }
        Itensvenda other = (Itensvenda) object;
        if ((this.iditensVenda == null && other.iditensVenda != null) || (this.iditensVenda != null && !this.iditensVenda.equals(other.iditensVenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tirsobikes.entidades.Itensvenda[ iditensVenda=" + getQuantidade() +  " ]";
    }
}
