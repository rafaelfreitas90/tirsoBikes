/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tirsobikes.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tirsobikes.entidades.Itensvenda;

/**
 *
 * @author Lemaun
 */
public class ItensVendaDAO {

    private EntityManager manager;

    public ItensVendaDAO(EntityManager manager) {
        this.manager = manager;
    }

    public Itensvenda salvaritensVenda(Itensvenda itensVenda) {
        manager.getTransaction().begin();
        manager.persist(itensVenda);
        manager.getTransaction().commit();
        return itensVenda;
    }

    public void atualizaritensVenda(Itensvenda itensVenda) {
        manager.getTransaction().begin();
        manager.merge(itensVenda);
        manager.getTransaction().commit();
    }

    public void deletaritensVenda(Itensvenda itensVenda) {
        manager.getTransaction().begin();
        manager.remove(itensVenda);
        manager.getTransaction().commit();
    }

    public Itensvenda procuraritensVenda(int iditensVenda) {
        return manager.find(Itensvenda.class, iditensVenda);
    }

    public List<Itensvenda> listaritensVendas() {
        Query query = manager.createQuery("from itensVenda");
        return query.getResultList();
    }
}
