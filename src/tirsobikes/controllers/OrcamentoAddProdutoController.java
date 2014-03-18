package tirsobikes.controllers;

import tirsobikes.entidades.Produto;
import tirsobikes.views.orcamento.OrcamentoAddProdutoView;
import tirsobikes.views.orcamento.OrcamentoView;

/**
 *
 * @author Rafael
 */
public class OrcamentoAddProdutoController {

    private static OrcamentoAddProdutoController instancia = new OrcamentoAddProdutoController();
    private OrcamentoAddProdutoView view;

    public OrcamentoAddProdutoController() {
    }

    //Método para instanciar o controller.
    public static OrcamentoAddProdutoController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.    
    public void exibirInterfaceGrafica(Produto produto, OrcamentoView aThis) {
        view = new OrcamentoAddProdutoView(produto, aThis);
        view.setModal(true);
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }
    
  

}