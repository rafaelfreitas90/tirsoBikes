package tirsobikes.controllers;

import tirsobikes.entidades.Itensvenda;
import tirsobikes.entidades.Produto;
import tirsobikes.entidades.Servico;
import tirsobikes.views.venda.VendaAddProdutoView;
import tirsobikes.views.venda.VendaAlterarProdutoView;
import tirsobikes.views.venda.VendaView;

/**
 *
 * @author Rafael
 */
public class VendaAlterarProdutoController {

    private static VendaAlterarProdutoController instancia = new VendaAlterarProdutoController();
    private VendaAlterarProdutoView view;

    public VendaAlterarProdutoController() {
    }

    //Método para instanciar o controller.
    public static VendaAlterarProdutoController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.    
    public void exibirInterfaceGrafica(Itensvenda item, VendaView aThis) {
        view = new VendaAlterarProdutoView(item, aThis);
        view.setModal(true);
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }    
   
}
