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
        
       String num = "1,1";
       Double d = Double.parseDouble(num);
       
        
        Produto p  = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        
        p.setValorCusto("50,50");
        p.setMargem("30,0");
        
        System.out.println(p.getValorVenda());
                
       
        
        
     
    }
    
}
