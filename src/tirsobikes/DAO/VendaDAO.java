/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tirsobikes.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tirsobikes.entidades.Cliente;
import tirsobikes.entidades.Venda;

/**
 *
 * @author Lemaun
 */
public class VendaDAO {

    private EntityManager manager;

    public VendaDAO(EntityManager manager) {
        this.manager = manager;
    }

    public Venda salvarVenda(Venda venda) {
        manager.getTransaction().begin();
        manager.persist(venda);
        manager.getTransaction().commit();
        return venda;
    }

    public void atualizarVenda(Venda venda) {
        manager.getTransaction().begin();
        manager.merge(venda);
        manager.getTransaction().commit();
    }

    public void deletarVenda(Venda venda) {
        manager.getTransaction().begin();
        manager.remove(venda);
        manager.getTransaction().commit();
    }

    public Venda procurarVenda(int idvenda) {
        return manager.find(Venda.class, idvenda);
    }

    public Venda procurarVendaCliente(int idcliente) {
        return manager.find(Venda.class, idcliente);
    }

    public List<Venda> listarVendas() {
        Query query = manager.createQuery("from Venda");
        return query.getResultList();
    }

    public List<Venda> listarVendasClientes(Cliente cliente) {
        Query query = manager.createQuery("from Venda WHERE idcliente= (:cliente) ORDER BY dataHora");
        query.setParameter("cliente", cliente);
        return query.getResultList();
    }
    
//        public List<Produto> procurarProdutoNome (String descricao) {
//        Query query = manager.createQuery("FROM Produto WHERE descricao LIKE (:searchKeyword) ORDER BY descricao");
//        query.setParameter("searchKeyword", "%"+descricao+"%");
//        return query.getResultList();
//    }
}