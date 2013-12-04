package tirsobikes.controllers;

import tirsobikes.views.produto.ProdutoAlterarView;
import tirsobikes.views.venda.ProdutoListaView;
import tirsobikes.views.venda.ServicoListaView;
import tirsobikes.views.venda.VendaView;

/**
 *
 * @author Rafael
 */
public class ServicoListaController {
    
    private static ServicoListaController instancia = new ServicoListaController();
    private ServicoListaView view;
    
    public ServicoListaController(){
        
    }
    
    //Método para instanciar o controller.
    public static ServicoListaController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(VendaView aThis){
        if (view == null){
            view = new ServicoListaView(aThis);
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }

   
}
