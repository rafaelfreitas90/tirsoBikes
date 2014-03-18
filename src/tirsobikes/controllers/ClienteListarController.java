package tirsobikes.controllers;

import tirsobikes.views.orcamento.OrcamentoView;
import tirsobikes.views.venda.ClienteListaView;
import tirsobikes.views.venda.VendaView;

/**
 *
 * @author Rafael
 */
public class ClienteListarController {

    private static ClienteListarController instancia = new ClienteListarController();
    private ClienteListaView view;

    public ClienteListarController() {
    }

    //Método para instanciar o controller.
    public static ClienteListarController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.    
    public void exibirInterfaceGrafica(VendaView aThis) {
         if (view == null){
            view = new ClienteListaView(aThis);
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
    
        public void exibirInterfaceGrafica2(OrcamentoView aThis) {
         if (view == null){
            view = new ClienteListaView(aThis);
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
}
