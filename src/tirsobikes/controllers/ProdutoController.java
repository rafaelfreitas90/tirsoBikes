package tirsobikes.controllers;

import tirsobikes.views.ProdutoView;

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
        view.setVisible(true);
    }
    
}
