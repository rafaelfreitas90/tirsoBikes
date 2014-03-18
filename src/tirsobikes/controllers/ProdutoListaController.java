package tirsobikes.controllers;

import tirsobikes.views.venda.ProdutoListaView;
import tirsobikes.views.venda.VendaView;

/**
 *
 * @author Rafael
 */
public class ProdutoListaController {
    
    private static ProdutoListaController instancia = new ProdutoListaController();
    private ProdutoListaView view;
    
    public ProdutoListaController(){
        
    }
    
    //Método para instanciar o controller.
    public static ProdutoListaController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(VendaView aThis){
        if (view == null){
            view = new ProdutoListaView(aThis);
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
   

      
}
