package tirsobikes.main;

import java.util.Date;
import java.util.List;
import tirsobikes.DAO.EstoqueDAO;
import tirsobikes.DAO.MarcaDAO;
import tirsobikes.DAO.ProdutoDAO;
import tirsobikes.controllers.PrincipalController;
import tirsobikes.controllers.ProdutoController;
import tirsobikes.entidades.Estoque;
import tirsobikes.entidades.Marca;
import tirsobikes.entidades.Produto;
import tirsobikes.views.PrincipalView;

/**
 *
 * @author RFSUPORTE
 */
public class TirsoBikes {

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

        PrincipalController.getInstancia().exibirInterfaceGrafica();

    }
}
