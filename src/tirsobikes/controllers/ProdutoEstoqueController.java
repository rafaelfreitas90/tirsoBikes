package tirsobikes.controllers;

import tirsobikes.views.produto.ProdutoAlterarView;
import tirsobikes.views.produto.ProdutoEstoqueView;

/**
 *
 * @author Rafael
 */
public class ProdutoEstoqueController {
    
    private static ProdutoEstoqueController instancia = new ProdutoEstoqueController();
    private ProdutoEstoqueView view = new ProdutoEstoqueView();
    
    public ProdutoEstoqueController(){
        
    }
    
    //Método para instanciar o controller.
    public static ProdutoEstoqueController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(){
        if (view == null){
            view = new ProdutoEstoqueView();
        }
        view.setVisible(true);
    }

   
}
