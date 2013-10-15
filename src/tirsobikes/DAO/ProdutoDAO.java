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

    public ProdutoDAO() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");
        manager = factory.createEntityManager();
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

    public Produto procurarProduto(int id) {
        return manager.find(Produto.class, id);
    }

    public List<Produto> ListarProdutos() {
        Query query = manager.createQuery("from Produto");
        return query.getResultList();
    }
}
