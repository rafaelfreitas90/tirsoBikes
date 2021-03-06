package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tirsobikes.entidades.Estoque;

/**
 *
 * @author LuisHenrique
 */
public class EstoqueDAO {

    private EntityManager manager;

    public EstoqueDAO(EntityManager manager) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");
        this.manager = manager;
    }

    public Estoque salvarEstoque(Estoque estoque) {
        manager.getTransaction().begin();
        manager.persist(estoque);
        manager.getTransaction().commit();
        return estoque;
    }

    public void atualizarEstoque(Estoque estoque) {
        manager.getTransaction().begin();
        manager.merge(estoque);
        manager.getTransaction().commit();
    }

    public void deletarEstoque(Estoque estoque) {
        manager.getTransaction().begin();
        manager.remove(estoque);
        manager.getTransaction().commit();
    }

    public Estoque procurarEstoque(int idestoque) {
        return manager.find(Estoque.class, idestoque);
    }

    public List<Estoque> listarEstoques(int idproduto) {
        Query query = manager.createQuery("FROM Estoque WHERE idproduto.idproduto = :id");        
        query.setParameter("id", idproduto);
        return query.getResultList();
    }

    public List<Estoque> ultimoEstoque(int idproduto) {
        Query query = manager.createQuery("FROM Estoque WHERE idproduto.idproduto = :id ORDER BY data DESC");        
        query.setParameter("id", idproduto);        
        return query.getResultList();
    }
}