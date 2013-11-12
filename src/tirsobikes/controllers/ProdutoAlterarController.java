package tirsobikes.controllers;

import tirsobikes.views.produto.ProdutoAlterarView;

/**
 *
 * @author Rafael
 */
public class ProdutoAlterarController {
    
    private static ProdutoAlterarController instancia = new ProdutoAlterarController();
    private ProdutoAlterarView view = new ProdutoAlterarView();
    
    public ProdutoAlterarController(){
        
    }
    
    //Método para instanciar o controller.
    public static ProdutoAlterarController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(){
        if (view == null){
            view = new ProdutoAlterarView();
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }

   
}
