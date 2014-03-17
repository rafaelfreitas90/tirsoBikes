package tirsobikes.controllers;

import tirsobikes.views.orcamento.OrcamentoView;

/**
 *
 * @author Rafael
 */
public class OrcamentoListaController {
    
    private static OrcamentoListaController instancia = new OrcamentoListaController();
    private OrcamentoView view;
    
    public OrcamentoListaController(){
        
    }
    
    //Método para instanciar o controller.
    public static OrcamentoListaController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(){
        if (view == null){
            view = new OrcamentoView();
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }

   
}
