package tirsobikes.controllers;

import tirsobikes.views.orcamento.OrcamentoView;

/**
 *
 * @author Rafael
 */
public class OrcamentoController {

    private static OrcamentoController instancia = new OrcamentoController();
    private OrcamentoView view = new OrcamentoView();

    public OrcamentoController() {
    }

    //Método para instanciar o controller.
    public static OrcamentoController getInstancia() {
        return instancia;
    }

    // Método para chamar a interface.
    public void exibirInterfaceGrafica() {
        if (view == null) {
            view = new OrcamentoView();
        }
        view.setAlwaysOnTop(true);
        view.setVisible(true);
    }


}
