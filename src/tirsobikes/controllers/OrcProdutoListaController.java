package tirsobikes.controllers;

import tirsobikes.views.orcamento.OrcamentoView;
import tirsobikes.views.venda.ProdutoListaView;

/**
 *
 * @author Rafael
 */
public class OrcProdutoListaController {
    
    private static OrcProdutoListaController instancia = new OrcProdutoListaController();
    private ProdutoListaView view;
    
    public OrcProdutoListaController(){
        
    }
    
    //Método para instanciar o controller.
    public static OrcProdutoListaController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(OrcamentoView aThis){
        if (view == null){
            view = new ProdutoListaView(aThis);
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
   


      
}
