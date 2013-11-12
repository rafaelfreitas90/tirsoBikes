package tirsobikes.controllers;

import tirsobikes.entidades.Produto;
import tirsobikes.entidades.Servico;
import tirsobikes.views.produto.ProdutoView;

/**
 *
 * @author Rafael
 */
public class ProdutoController {
    
    private static ProdutoController instancia = new ProdutoController();
    private ProdutoView view = new ProdutoView();
    
    public ProdutoController(){        
    }
    
    //Método para instanciar o controller.
    public static ProdutoController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(){
        if (view == null){
            view = new ProdutoView();
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }

    public void exibirInterfaceGrafica(Produto produto) {
        view = new ProdutoView(produto);   
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
    
       public void exibirInterfaceGrafica(Servico servico) {
        view = new ProdutoView(servico);          
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
}
