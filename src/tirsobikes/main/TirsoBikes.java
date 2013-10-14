package tirsobikes.main;

import java.util.List;
import tirsobikes.DAO.ProdutoDAO;
import tirsobikes.controllers.ProdutoController;
import tirsobikes.entidades.Produto;

/**
 *
 * @author RFSUPORTE
 */
public class TirsoBikes {

    public static void main(String[] args) {  
        
        
        Produto p  = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        
        p.setCategoria("te");
        p.setCodigoBarras(0000);
        p.setDescricao("te");
        p.setEstoqueAtual(1);
        p.setEstoqueMin(2);
        p.setFornecedor("Bla");
        p.setMarca("Marca");
        p.setValorCusto(0.01);
        p.setValorVenda(0.02);
        
        dao.salvarProduto(p);
        
        
     
    }
    
}
