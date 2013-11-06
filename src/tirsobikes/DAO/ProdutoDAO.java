package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import tirsobikes.entidades.Produto;

/**
 *
 * @author RFSUPORTE
 */
public class ProdutoDAO {

    private EntityManager manager;

    public ProdutoDAO(EntityManager manager) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");
//        manager = factory.createEntityManager();
        this.manager = manager;
    }

    public Produto salvarProduto(Produto produto) {
        manager.getTransaction().begin();
        manager.persist(produto);
        manager.getTransaction().commit();        
        return produto;        
    }

    public void atualizarProduto(Produto produto) {
        manager.getTransaction().begin();
        manager.merge(produto);
        manager.getTransaction().commit();
    }

    public void deletarProduto(Produto produto) {
        manager.getTransaction().begin();
        manager.remove(produto);
        manager.getTransaction().commit();
    }

    public Produto procurarProduto(int idproduto) {
        return manager.find(Produto.class, idproduto);
    }

    public List<Produto> listarProdutos() {
        Query query = manager.createQuery("from Produto");
        return query.getResultList();
    }
    
    public List<Produto> procurarProdutoNome (String descricao) {
        Query query = manager.createQuery("FROM Produto WHERE descricao LIKE (:searchKeyword)");
        query.setParameter("searchKeyword", "%"+descricao+"%");
        return query.getResultList();
    }
    
    
}
