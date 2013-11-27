/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tirsobikes.entidades.Venda;

/**
 *
 * @author Lemaun
 */
public class VendaDAO {

    private EntityManager manager;

    public VendaDAO(EntityManager manager) {
        this.manager = manager;
    }

    public Venda salvarVenda(Venda venda) {
        manager.getTransaction().begin();
        manager.persist(venda);
        manager.getTransaction().commit();
        return venda;
    }

    public void atualizarVenda(Venda venda) {
        manager.getTransaction().begin();
        manager.merge(venda);
        manager.getTransaction().commit();
    }

    public void deletarVenda(Venda venda) {
        manager.getTransaction().begin();
        manager.remove(venda);
        manager.getTransaction().commit();
    }

    public Venda procurarVenda(int idvenda) {
        return manager.find(Venda.class, idvenda);
    }

    public List<Venda> listarVendas() {
        Query query = manager.createQuery("from Venda");
        return query.getResultList();
    }
}