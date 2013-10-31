package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import tirsobikes.entidades.Usuario;

/**
 *
 * @author LuisHenrique
 */
public class UsuarioDAO {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");
    private static EntityManager manager;

    public UsuarioDAO() {
    
        manager = factory.createEntityManager();
    }


    public List<Usuario> listaUsuario() {
        Query query = manager.createQuery("from Usuario");
        return query.getResultList();
    }
    
    
}
