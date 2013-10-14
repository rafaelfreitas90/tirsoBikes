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

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");

    public void salvarProduto(Object objeto) {

        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(objeto);
        manager.getTransaction().commit();

        manager.close();
        
    }
    
        public List ListarProdutos() {
        
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        Query query = manager.createQuery("from Produto");
        List<Produto> produtos = query.getResultList();

        manager.getTransaction().commit();

        manager.close();
        

        return produtos;

    }
    
    
    
}
