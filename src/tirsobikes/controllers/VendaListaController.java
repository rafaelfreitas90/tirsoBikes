package tirsobikes.controllers;

import tirsobikes.views.venda.VendaListaView;
import tirsobikes.views.venda.VendaView;

/**
 *
 * @author Rafael
 */
public class VendaListaController {
    
    private static VendaListaController instancia = new VendaListaController();
    private VendaListaView view;
    
    public VendaListaController(){
        
    }
    
    //Método para instanciar o controller.
    public static VendaListaController getInstancia(){
        return instancia;
    }
    
    // Método para chamar a interface.
   public void exibirInterfaceGrafica(){
        if (view == null){
            view = new VendaListaView();
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }

   
}
