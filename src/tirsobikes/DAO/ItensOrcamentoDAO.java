package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tirsobikes.entidades.Itensorcamento;

/**
 *
 * @author Rafael
 */
public class ItensOrcamentoDAO {

    private EntityManager manager;

    public ItensOrcamentoDAO(EntityManager manager) {
        this.manager = manager;
    }

    public Itensorcamento salvarItensOrcamento(Itensorcamento itensOrcamento) {
        manager.getTransaction().begin();
        manager.persist(itensOrcamento);
        manager.getTransaction().commit();
        return itensOrcamento;
    }

    public void atualizarItensOrcamento(Itensorcamento itensOrcamento) {
        manager.getTransaction().begin();
        manager.merge(itensOrcamento);
        manager.getTransaction().commit();
    }

    public void deletaritensVenda(Itensorcamento itensOrcamento) {
        manager.getTransaction().begin();
        manager.remove(itensOrcamento);
        manager.getTransaction().commit();
    }

    public Itensorcamento procurarItensOrcamento(int idIitensorcamento) {
        return manager.find(Itensorcamento.class, idIitensorcamento);
    }

    public List<Itensorcamento> listaritensOrcamento() {
        Query query = manager.createQuery("from itensOrcamento");
        return query.getResultList();
    }
}
