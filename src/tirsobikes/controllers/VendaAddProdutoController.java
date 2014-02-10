package tirsobikes.controllers;

import tirsobikes.entidades.Produto;
import tirsobikes.entidades.Servico;
import tirsobikes.views.venda.VendaAddProdutoView;
import tirsobikes.views.venda.VendaView;

/**
 *
 * @author Rafael
 */
public class VendaAddProdutoController {

    private static VendaAddProdutoController instancia = new VendaAddProdutoController();
    private VendaAddProdutoView view;

    public VendaAddProdutoController() {
    }

    //Método para instanciar o controller.
    public static VendaAddProdutoController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.    
    public void exibirInterfaceGrafica(Produto produto, VendaView aThis) {
        view = new VendaAddProdutoView(produto, aThis);
        view.setModal(true);
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
    
    public void exibirInterfaceGrafica(Servico servico, VendaView aThis) {
        view = new VendaAddProdutoView(servico, aThis);
        view.setLocationRelativeTo(aThis);
        view.setModal(true);
        view.setAlwaysOnTop(true);        
        view.setVisible(true);
    }

}
