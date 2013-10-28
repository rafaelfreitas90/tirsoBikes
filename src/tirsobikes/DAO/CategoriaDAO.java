package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import tirsobikes.entidades.Categoria;

/**
 *
 * @author LuisHenrique
 */
public class CategoriaDAO {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");
    private static EntityManager manager;

    public CategoriaDAO() {
    
        manager = factory.createEntityManager();
    }

    public Categoria salvarCategoria(Categoria categoria) {
        manager.getTransaction().begin();
        manager.persist(categoria);
        manager.getTransaction().commit();
        return categoria;
    }

    public void atualizarCategoria(Categoria categoria) {
        manager.getTransaction().begin();
        manager.merge(categoria);
        manager.getTransaction().commit();
    }

    public void deletarCategoria(Categoria categoria) {
        manager.getTransaction().begin();
        manager.remove(categoria);
        manager.getTransaction().commit();
    }

    public Categoria procurarCategoria(int idcategoria) {
        return manager.find(Categoria.class, idcategoria);
    }

    public List<Categoria> listaCategorias() {
        Query query = manager.createQuery("from Categoria");
        return query.getResultList();
    }
}
