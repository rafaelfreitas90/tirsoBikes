package tirsobikes.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tirsobikes.entidades.Cliente;
import tirsobikes.entidades.Orcamento;
import tirsobikes.entidades.Venda;

/**
 *
 * @author rafael
 */
public class OrcamentoDAO {

    private EntityManager manager;

    public OrcamentoDAO(EntityManager manager) {
        this.manager = manager;
    }

    public Orcamento salvarOrcamento(Orcamento orcamento) {
        manager.getTransaction().begin();
        manager.persist(orcamento);
        manager.getTransaction().commit();
        return orcamento;
    }

    public void atualizarOrcamento(Orcamento orcamento) {
        manager.getTransaction().begin();
        manager.merge(orcamento);
        manager.getTransaction().commit();
    }

    public void deletarOrcamento(Orcamento orcamento) {
        manager.getTransaction().begin();
        manager.remove(orcamento);
        manager.getTransaction().commit();
    }

    public Orcamento procurarOrcamento(int idorcamento) {
        return manager.find(Orcamento.class, idorcamento);
    }

    public Orcamento procurarOrcamentoCliente(int idcliente) {
        return manager.find(Orcamento.class, idcliente);
    }

    public List<Orcamento> listarOrcamento() {
        Query query = manager.createQuery("from Orcamento");
        return query.getResultList();
    }

    public List<Orcamento> listarOrcamentoCliente(Cliente cliente) {
        Query query = manager.createQuery("from Orcamento WHERE idcliente= (:cliente) ORDER BY dataHora");
        query.setParameter("cliente", cliente);
        return query.getResultList();
    }
    

}