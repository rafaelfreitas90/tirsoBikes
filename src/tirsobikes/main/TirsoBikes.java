package tirsobikes.main;

import java.util.Date;
import java.util.List;
import tirsobikes.DAO.EstoqueDAO;
import tirsobikes.DAO.ProdutoDAO;
import tirsobikes.controllers.PrincipalController;
import tirsobikes.controllers.ProdutoController;
import tirsobikes.entidades.Estoque;
import tirsobikes.entidades.Produto;

/**
 *
 * @author RFSUPORTE
 */
public class TirsoBikes {

    public static void main(String[] args) {

//        Estoque e = new Estoque();
//        Produto p = new Produto();
//        EstoqueDAO dao = new EstoqueDAO();
//        ProdutoDAO daop = new ProdutoDAO();
//        Date data = new Date(2013, 03, 11);
//
//        e.setData(data);
//        
//
//        e.setIdproduto(null);
//        dao.salvarEstoque(e);
        
        
        PrincipalController.getInstancia().exibirInterfaceGrafica();
    }
}
