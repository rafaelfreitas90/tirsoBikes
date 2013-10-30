package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import tirsobikes.entidades.Fornecedor;
import tirsobikes.entidades.Produto;

/**
 *
 * @author RFSUPORTE
 */
public class FornecedorDAO {

    private EntityManager manager;

    public FornecedorDAO() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");
        manager = factory.createEntityManager();
    }

    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
        manager.getTransaction().begin();
        manager.persist(fornecedor);
        manager.getTransaction().commit();
        return fornecedor;
    }

    public void atualizarFornecedor(Fornecedor fornecedor) {
        manager.getTransaction().begin();
        manager.merge(fornecedor);
        manager.getTransaction().commit();
    }

    public void deletarForncedor(Fornecedor fornecedor) {
        manager.getTransaction().begin();
        manager.remove(fornecedor);
        manager.getTransaction().commit();
    }

    public Produto procurarFornecedor(int idfornecedor) {
        return manager.find(Produto.class, idfornecedor);
    }

    public List<Fornecedor> listarFornecedor() {
        Query query = manager.createQuery("from fornecedor");
        return query.getResultList();
    }
    
    public List<Fornecedor> procurarFornecedorNome (String nomeRazao) {
        Query query = manager.createQuery("FROM fornecedor WHERE nomeRazao LIKE (:searchKeyword)");
        query.setParameter("searchKeyword", "%"+nomeRazao+"%");
        return query.getResultList();
    }
    
    
}
