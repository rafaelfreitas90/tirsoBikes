/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import tirsobikes.entidades.Servico;

/**
 *
 * @author LuisHenrique
 */
public class ServicoDAO {
    private EntityManager manager;

    public ServicoDAO() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");
        manager = factory.createEntityManager();
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
