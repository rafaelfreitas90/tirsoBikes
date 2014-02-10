
package tirsobikes.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import tirsobikes.controllers.PrincipalController;
import tirsobikes.controllers.ProdutoController;
import tirsobikes.controllers.UsuarioController;
import tirsobikes.controllers.VendaListaController;
import tirsobikes.views.PrincipalView;

/**
 *
 * @author RFSUPORTE
 */
public class TirsoBikes {

    private static EntityManager manager;

    static {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TirsoBikesPU");
        manager = factory.createEntityManager();
    }

    public static EntityManager getEntityManager() {
        return manager;
    }

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

<<<<<<< HEAD
=======
        VendaListaController.getInstancia().exibirInterfaceGrafica();
        
>>>>>>> atualizando venda
//        PrincipalController.getInstancia().exibirInterfaceGrafica();

       UsuarioController.getInstancia().exibirInterfaceGrafica();
    }
}
