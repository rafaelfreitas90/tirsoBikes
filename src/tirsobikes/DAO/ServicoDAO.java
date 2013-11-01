package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tirsobikes.entidades.Servico;

/**
 *
 * @author LuisHenrique
 */
public class ServicoDAO {
    private EntityManager manager;

    public ServicoDAO(EntityManager manager) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");
        this.manager = manager;
    }

    public Servico salvarServico(Servico servico) {
        manager.getTransaction().begin();
        manager.persist(servico);
        manager.getTransaction().commit();
        return servico;
    }

    public void atualizarServico(Servico servico) {
        manager.getTransaction().begin();
        manager.merge(servico);
        manager.getTransaction().commit();
    }

    public void deletarServico(Servico servico) {
        manager.getTransaction().begin();
        manager.remove(servico);
        manager.getTransaction().commit();
    }

    public Servico procurarServico(int idservico) {
        return manager.find(Servico.class, idservico);
    }

    public List<Servico> ListarServicos() {
        Query query = manager.createQuery("from Servico");
        return query.getResultList();
    }
    
    public List<Servico> procurarServicoNome (String descricao) {
        Query query = manager.createQuery("FROM Servico WHERE descricao LIKE (:searchKeyword)");
        query.setParameter("searchKeyword", "%"+descricao+"%");
        return query.getResultList();
    }
}
