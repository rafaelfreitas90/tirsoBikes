package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tirsobikes.entidades.Cliente;

/**
 *
 * @author RFSUPORTE
 */
public class ClienteDAO {

    private EntityManager manager;

    public ClienteDAO(EntityManager manager) {
        
        this.manager = manager;
    }

    public Cliente salvarCliente(Cliente cliente) {
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
        return cliente;
    }

    public void atualizarCliente(Cliente cliente) {
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }

    public void deletarCliente(Cliente cliente) {
        manager.getTransaction().begin();
        manager.remove(cliente);
        manager.getTransaction().commit();
    }

    public Cliente procurarCliente(int idcliente) {
        return manager.find(Cliente.class, idcliente);
    }

    public List<Cliente> listarCliente() {
        Query query = manager.createQuery("from Cliente");
        return query.getResultList();
    }
    
    public List<Cliente> procurarClienteNome (String nomeCompleto) {
        Query query = manager.createQuery("FROM Cliente WHERE nomeCompleto LIKE (:searchKeyword)");
        query.setParameter("searchKeyword", "%"+nomeCompleto+"%");
        return query.getResultList();
    }
    
    
}
