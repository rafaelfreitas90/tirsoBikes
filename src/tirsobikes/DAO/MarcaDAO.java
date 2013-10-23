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
import tirsobikes.entidades.Marca;

/**
 *
 * @author LuisHenrique
 */
public class MarcaDAO {
    private EntityManager manager;

    public MarcaDAO() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");
        manager = factory.createEntityManager();
    }

    public Marca salvarMarca(Marca marca) {
        manager.getTransaction().begin();
        manager.persist(marca);
        manager.getTransaction().commit();
        return marca;
    }

    public void atualizarMarca(Marca marca) {
        manager.getTransaction().begin();
        manager.merge(marca);
        manager.getTransaction().commit();
    }

    public void deletarMarca(Marca marca) {
        manager.getTransaction().begin();
        manager.remove(marca);
        manager.getTransaction().commit();
    }

    public Marca procurarMarca(int idmarca) {
        return manager.find(Marca.class, idmarca);
    }

    public List<Marca> listaMarcas() {
        Query query = manager.createQuery("from Marca");
        return query.getResultList();
    }
}