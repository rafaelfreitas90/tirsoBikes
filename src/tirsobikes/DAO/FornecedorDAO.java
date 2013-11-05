package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tirsobikes.entidades.Fornecedor;
import tirsobikes.entidades.Produto;

/**
 *
 * @author RFSUPORTE
 */
public class FornecedorDAO {

    private EntityManager manager;

    public FornecedorDAO(EntityManager manager) {
        
        this.manager = manager;
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

    public Fornecedor procurarFornecedor(int idfornecedor) {
        return manager.find(Fornecedor.class, idfornecedor);
    }

    public List<Fornecedor> listarFornecedor() {
        Query query = manager.createQuery("from Fornecedor");
        return query.getResultList();
    }
    
    public List<Fornecedor> procurarFornecedorNome (String nomeRazao) {
        Query query = manager.createQuery("FROM Fornecedor WHERE nomeRazao LIKE (:searchKeyword)");
        query.setParameter("searchKeyword", "%"+nomeRazao+"%");
        return query.getResultList();
    }
    
    
}
